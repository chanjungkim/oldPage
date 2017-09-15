package socket;

import java.awt.Dimension;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import common.MessageType;
import model.User;
import view.MainClientUI;

public class ChatClient implements MessageType{
	private String serverIP;
	private int port;
	private Socket socket;
	private DataInputStream in;
	private DataOutputStream out;
	private boolean stop;
	MainClientUI mainUI;
	String responseMessage;
	String protocol;
	
	public ChatClient() {
		this("localhost", 2568);
	}

	public ChatClient(String serverIP, int port) {
		this.serverIP = serverIP;
		this.port = port;
		responseMessage = new String();
		protocol = new String();
	}

	// setter getter
	public String getServerIP() {
		return serverIP;
	}

	public void setServerIP(String serverIP) {
		this.serverIP = serverIP;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	public DataInputStream getIn() {
		return in;
	}

	public void setIn(DataInputStream in) {
		this.in = in;
	}

	public DataOutputStream getOut() {
		return out;
	}

	public void setOut(DataOutputStream out) {
		this.out = out;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public MainClientUI getMainUI() {
		return mainUI;
	}

	public void setMainUI(MainClientUI mainUI) {
		this.mainUI = mainUI;
	}

	/** connect to server */
	public void connect() throws UnknownHostException, IOException {
		socket = new Socket(serverIP, port);
		out = new DataOutputStream(socket.getOutputStream());
		in = new DataInputStream(socket.getInputStream());
	}

	/** disconnect from server */
	public void disConnect() {
		sendMessage(SC_CLOSE + DELIMETER + mainUI.getUsr().getId());
		try {
			if (in != null)
				in.close();
			if (out != null)
				out.close();
			if (socket != null)
				socket.close();
		} catch (IOException e) {
		}
	}

	/**
	 * send message
	 */
	public void sendMessage(String message) {
		try {
			out.writeUTF(message);
		} catch (IOException e) {
//			mainUI.showPopUp("connection failure");
		}
	}

	/**
	 * receive message from server
	 */
	public void receiveMessage() throws IOException {
		new Thread() {
			@Override
			public void run() {
				while (!stop) {
					try {
						responseMessage = in.readUTF();
						System.out.println("Client Received : " + responseMessage);
					} catch (IOException e) {
						e.printStackTrace();
					}
					String[] tokens = responseMessage.split(DELIMETER);
					protocol = tokens[0];
					
					switch (protocol) {
					case S_LOGIN_RESULT: //201§roomName§TRUE§secret§maxUser§userID
						if (tokens[1].equalsIgnoreCase(TRUE)) {
							mainUI.setUsr(new User(tokens[4], tokens[2], tokens[3]));
							mainUI.showWaitingP();
							mainUI.setPreferredSize(new Dimension(636, 771));
							mainUI.pack();
							mainUI.setLocationRelativeTo(null);
							
						} else {
							mainUI.showMessage("Login failed. plz check your Id&Pw");
						}
						break;
					case S_JOIN_ROOM_RESULT:
						if (tokens[1].equals(TRUE)) {
							mainUI.getChatroomP().setRoomName(tokens[2]);;
							mainUI.showChatroomP();
							mainUI.setPreferredSize(new Dimension(686, 575));
							mainUI.pack();
							mainUI.setLocationRelativeTo(null);
							mainUI.getChatroomP().getMessageP().setUi(mainUI);
						}
						
						break;
					case S_WROOM_LIST: //205§roomName,roomName2,...
						if (tokens.length != 1) {
							mainUI.getWaitingP().createRoom(tokens[1]);
						} else {
							mainUI.getWaitingP().cleanRoom();
						}
						
						break;
					
					case S_WUSER_LIST: //206§man,john/woman,cathy
						if (tokens.length != 1) {
							mainUI.getWaitingP().setUserList(tokens[1]);
						}
						break;
					case S_USER_LIST: //207
						mainUI.getChatroomP().setUserList(tokens[1]);
						break;
					case SC_WMESSAGE:
						mainUI.getWaitingP().inputMessage(tokens[1], tokens[2]);
						break;
					
					case SC_MESSAGE: //300
						mainUI.getChatroomP().getMessageP().insertMessage(tokens[2], tokens[3]);
						break;
						
					case SC_EMOTICON: //301
						mainUI.getChatroomP().getMessageP().insertEmoticon(tokens[2], tokens[3]);
						break;
						
					case S_LEAVE_RESULT:
						mainUI.showWaitingP();
						mainUI.setPreferredSize(new Dimension(636, 771));
						mainUI.pack();
						mainUI.setLocationRelativeTo(null);
						break;
					default:
						break;
					}
					
				}
			}
		}.start();

	}
	

}

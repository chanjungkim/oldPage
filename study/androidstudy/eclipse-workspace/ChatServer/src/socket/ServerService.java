package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import common.MessageType;
import model.User;
import util.RWUserInfo;
import util.RoomManager;

public class ServerService extends Thread implements MessageType {

	private DataInputStream in;
	private DataOutputStream out;
	private Socket socket;
	private ChatServer server;
	String protocol;
	String receiveMesaage;
	private boolean serverStop;
	private RoomManager roomManager;
	private String userID;
	RWUserInfo userdao;


	public ServerService(ChatServer server, Socket socket) throws IOException {
		this.socket = socket;
		this.server = server;
		this.in = new DataInputStream(socket.getInputStream());
		this.out = new DataOutputStream(socket.getOutputStream());
		protocol = new String();
		receiveMesaage = new String();
		roomManager = RoomManager.getInstance();
		userdao = new RWUserInfo();
	}

	public void sendMessage(String message) {
		try {
			out.writeUTF(message);
		} catch (IOException e) {
			System.out.println("connection failure");
			e.printStackTrace();
		}
	}

	// handle the request message from client
	private void handleReq() throws Exception {
		try {
			while (!serverStop) {
				receiveMesaage = in.readUTF();
				System.out.println("server Received : " + receiveMesaage);
				String[] tokens = receiveMesaage.split(DELIMETER);
				protocol = tokens[0];

				switch (protocol) {
				case C_LOGIN: // 100
					User user = userdao.isUser(tokens[1], tokens[2]);
					if (user != null) {
						sendMessage(S_LOGIN_RESULT + DELIMETER + TRUE + DELIMETER + user.getName() + DELIMETER + user.getIsMale() + DELIMETER + user.getId());
						roomManager.joinRoom("WaitingRoom", user.getId());
						server.sendToAllListener(S_WROOM_LIST + DELIMETER + roomManager.getRoomNames());
						server.sendToAllListener(S_WUSER_LIST + DELIMETER + roomManager.getRoomMembersParsing("WaitingRoom"));
						userID = user.getId();
					} else {
						sendMessage(S_LOGIN_RESULT + DELIMETER + FALSE);
					}
					break;
				case C_SIGN_UP:
					userdao.signUp(tokens[1], tokens[2], tokens[3], tokens[4]);
					break;
					
				case C_CREATE_ROOM: //201
					if (tokens[2].equals(TRUE)) {
						roomManager.createRoom(tokens[1], tokens[3], tokens[4]);
						roomManager.joinRoom(tokens[1], tokens[5]);
					} else {
						roomManager.createRoom(tokens[1], tokens[3]);
						roomManager.joinRoom(tokens[1], tokens[4]);
					}
					server.sendToAllListener(S_WROOM_LIST + DELIMETER + roomManager.getRoomNames());
					server.sendToAllListener(S_WUSER_LIST + DELIMETER + roomManager.getRoomMembersParsing("WaitingRoom"));
					server.sendToOneRoom(tokens[1], S_USER_LIST + DELIMETER + roomManager.getRoomMembersParsing(tokens[1]));
					sendMessage(S_JOIN_ROOM_RESULT + DELIMETER + TRUE + DELIMETER + tokens[1]);
					break;
				
				case C_JOIN_ROOM: //202
					roomManager.joinRoom(tokens[1], tokens[2]);
					server.sendToOneRoom(tokens[1], S_USER_LIST + DELIMETER + roomManager.getRoomMembersParsing(tokens[1]));
					sendMessage(S_JOIN_ROOM_RESULT + DELIMETER + TRUE + DELIMETER + tokens[1]);
					break;
					
				case SC_WMESSAGE:
					server.sendToOneRoom("WaitingRoom", receiveMesaage);
					break;
					
				case SC_MESSAGE: //300
					server.sendToOneRoom(tokens[1], receiveMesaage);
					break;
			
				case SC_EMOTICON: // 301
					server.sendToOneRoom(tokens[1], receiveMesaage);
					break;
					
				case C_LEAVE_ROOM: //305
					roomManager.leaveRoom(tokens[1], tokens[2]);
					roomManager.joinRoom("WaitingRoom", userID);
					server.sendToAllListener(S_WROOM_LIST + DELIMETER + roomManager.getRoomNames());
					server.sendToAllListener(S_WUSER_LIST + DELIMETER + roomManager.getRoomMembersParsing("WaitingRoom"));
					server.sendToOneRoom(tokens[1], S_USER_LIST + DELIMETER + roomManager.getRoomMembersParsing(tokens[1]));
					sendMessage(S_LEAVE_RESULT + DELIMETER + TRUE);
					break;
				
				case SC_CLOSE: //500
					serverStop = !serverStop;
					roomManager.leaveRoom("WaitingRoom", tokens[1]);
					server.disconnectClinet(this);
				default:
					break;

				}

			}
		} finally {
			if (in != null)
				in.close();
			if (out != null)
				out.close();
			if (socket != null)
				socket.close();
		}
	}
	
	public String getUserID() {
		return userID;
	}

	@Override
	public void run() {
		try {
			handleReq();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

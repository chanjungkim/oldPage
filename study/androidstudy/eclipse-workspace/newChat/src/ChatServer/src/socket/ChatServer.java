package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import model.User;
import util.RoomManager;

public class ChatServer {

	/** server attibute */
	private boolean stop;
	private int port;
	private ServerSocket server;
	private Set<ServerService> conntedList;

	/**
	 * constructor
	 */
	public ChatServer() {
		this(2568);
	}

	public ChatServer(int port) {
		conntedList = new HashSet<ServerService>();
		this.port = port;
		
	}

	/** setter, getter */
	public boolean isStop() {
		return stop;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public ServerSocket getServer() {
		return server;
	}

	public void setServer(ServerSocket server) {
		this.server = server;
	}

	/** server start, shut down, etc... */
	/**
	 * #1. server start 
	 */
	public void startUp() throws IOException {
		server = new ServerSocket(port);
	}

	/**
	 * #2. server shut down
	 */
	public void shutDown() {
		try {
			if (server != null)
				server.close();
		} catch (IOException e) {
		}
	}

	/**
	 * #3. receive the client connection 
	 */
	public void connectListening() throws IOException {
		while (!stop) {
			Socket client = server.accept();
			System.out.println("연결됨 : " + client.getInetAddress().getHostAddress());
			ServerService serversvc = new ServerService(this, client);
			conntedList.add(serversvc);
			serversvc.start();
		}
	}

	/**
	 * #4. send message to all connected client
	 */

	public void sendToAllListener(String message) {
		Iterator<ServerService> iter = conntedList.iterator();
		while (iter.hasNext()) {
			iter.next().sendMessage(message);
		}
	}

	/**
	 * #5. specific client disconnect
	 */
	public void disconnectClinet(ServerService client) {
		conntedList.remove(client);
	}

	/**
	 * #6. send message to specific user
	 */
	public void sendToOneUser(String userId, String message) {
		Iterator<ServerService> iter = conntedList.iterator();
		ServerService svc = null;
		while (iter.hasNext()) {
			svc = iter.next();
			if (svc.getUserID().equals(userId)) {
				svc.sendMessage(message);
			}
		}
	}

	/*
	 * #7. send message to users who join the specific room
	 */
	public void sendToOneRoom(String roomName, String message) {
		for (User usr : RoomManager.getInstance().getRoomMembers(roomName)) {
			sendToOneUser(usr.getId(), message);
		}
	}
	

}

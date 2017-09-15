package util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.Room;
import model.User;


public class RoomManager {

	private static RoomManager manager;
	List<Room> roomList;
	User usr;
	Room room;
	RWUserInfo rw;
	private RoomManager(String waitingRoom) {
		super();
		room = new Room(waitingRoom);
		roomList = new ArrayList<Room>();
		roomList.add(room);
		rw = new RWUserInfo();
	}
	
	// Single Ton, Factory Class
	public static RoomManager getInstance() {
		if (manager == null) {
			synchronized (RoomManager.class) {
				manager = new RoomManager("WaitingRoom");
			}
		}
		return manager;
	};
	
	
	//create room
	public void createRoom(String roomName, String maxUser){
//		list.add();
		
		room = new Room(roomName, Integer.parseInt(maxUser));
		roomList.add(room);
	}
	
	public void createRoom(String roomName, String passwd, String maxUser){
		room = new Room(roomName, passwd, Integer.parseInt(maxUser));
		roomList.add(room);
	}
	
	//join room
	public synchronized void joinRoom(String roomName, String userID){
		Iterator<Room> iter = roomList.iterator();
		while (iter.hasNext()) {
			room = iter.next();
			if (room.getRoomName().equals(roomName)) {
				try {
					room.joinUser(rw.isUser(userID));
					if(!roomName.equals("WaitingRoom")) {
						leaveRoom("WaitingRoom", userID);
					}
					break;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	
	
	//leave room
	public void leaveRoom(String roomName, String joinUserId){
		Iterator<Room> iter = roomList.iterator();
		while (iter.hasNext()) {
			room = iter.next();
			if (room.getRoomName().equals(roomName)) {
				for (User user : room.getUserList()) {
					if (user.getId().equals(joinUserId)) {
						usr = user;
						break;
					}
				}
				room.leaveUser(usr);
				try {
					if (room.getUserList().size() == 0 && !roomName.equals("WaitingRoom")) {
						roomList.remove(room);
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
//	return online user info from given roomname
	public List<User> getRoomMembers(String roomName){
		Iterator<Room> iter = roomList.iterator();
		List<User> list = new ArrayList<>();
		while (iter.hasNext()) {
			room = iter.next();
			if (room.getRoomName().equals(roomName)) {
				list = room.getUserList();
			}
		}
		return list;
	}
//	split the user info, ',' and '/' token
	public String getRoomMembersParsing(String roomName){
		Iterator<User> iter = getRoomMembers(roomName).iterator();
		StringBuilder strb = new StringBuilder();
		while (iter.hasNext()) {
			usr = iter.next();
			strb.append(usr.getIsMale()+","+usr.getName());
			strb.append("/");
		}
	if (strb.length() == 0) {
		return " ";
	}
	return strb.substring(0, strb.length() - 1);
	}

	
//	split the room name by ',' token
	public String getRoomNames(){
		StringBuilder strb = new StringBuilder();
		strb.append("");
		for (Room room : roomList) {
			if (room.getRoomName().equals("WaitingRoom")) {
				continue;
			}
			strb.append(room.getRoomName());
			strb.append(",");
		}
		if (strb.length() != 0) {
			strb.deleteCharAt(strb.length()-1);
		}
		return strb.toString();
	}
	
//	confirm room is already exist or not
	public boolean isExist(String roomName){
		Iterator<Room> iter = roomList.iterator();
		while (iter.hasNext()) {
			room = iter.next();
			if (room.getRoomName().equals(roomName)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		RoomManager manager = RoomManager.getInstance();
		manager.joinRoom("WaitingRoom", "krkr");
		manager.createRoom("test room", "3");
		manager.leaveRoom("WaitingRoom", "krkr");
		manager.joinRoom("test room", "krkr");
		manager.joinRoom("test room", "asd");
		System.out.println(manager.roomList.toString());
	}

	
	
	
	
}

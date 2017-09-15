package model;

import java.util.ArrayList;
import java.util.List;

public class Room {
	String roomName;
	String password;
	List<User> userList;
	int maxUser;
	
	
	public Room(){}
	public Room(String roomName){
		super();
		userList = new ArrayList<User>();
		this.roomName = roomName;
	}

	public Room(String roomName, int maxUser){
		super();
		userList = new ArrayList<User>();
		this.roomName = roomName;
	}
	
	public Room(String roomName, List<User> userList) {
		super();
		this.roomName = roomName;
		this.userList = userList;
	}


	public Room(String roomName, String password, int maxUser) {
		super();
		this.roomName = roomName;
		this.password = password;
		this.maxUser = maxUser;
		userList = new ArrayList<User>();
	}

	public String getRoomName() {
		return roomName;
	}


	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}


	public List<User> getUserList() {
		return userList;
	}


	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
	
//	user join
	public void joinUser(User user){
		userList.add(user);
	}
	
//	Room leave
	public void leaveUser(User user){
		userList.remove(user);
	}


	@Override
	public String toString() {
		return "Room [roomName=" + roomName + ", userList=" + userList + "]";
	}
	
	
}




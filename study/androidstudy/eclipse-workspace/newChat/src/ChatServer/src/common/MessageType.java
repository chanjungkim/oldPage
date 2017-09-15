package common;

public interface MessageType {

	/** It is used to split the sentence */
	String DELIMETER = "§";
	
	/** Boolean */
	String TRUE = "TRUE";
	String FALSE = "FALSE";
	
	/** Message Type (Protocol) */
	
	/* request login  
	 * 100§id§passwd
	 */
	String C_LOGIN = "100"; // 
	
	/* response to a login request
	 * 101 §TRUE§name§sex§id
	 * 101 §FALSE
	 */
	String S_LOGIN_RESULT = "101";
	
	/*
	 * 103§id§passwd§name§sex
	 */
	String C_SIGN_UP = "103";

	
	/*
	 * rq create the room
	 * 201§roomName§TRUE§secret§maxUser§userID
	 * 201§roomName§FALSE§maxUser§userID
	 */
	String C_CREATE_ROOM = "201";
	
	/*
	 * rq join the room
	 * 202§roomName§userID
	 */
	String C_JOIN_ROOM = "202";
	
	/*
	 * 204§TRUE§roomName
	 * 204§FALSE
	 */
	String S_JOIN_ROOM_RESULT = "204";
	
	/*
	 * rp wating room lists
	 * 205§roomName,roomName2,...
	 */
	String S_WROOM_LIST = "205";
	
	/*
	 * 206§man,john/woman,cathy
	 */
	String S_WUSER_LIST = "206";
	
	/*
	 * 207§man,john/woman,cathy
	 */
	String S_USER_LIST = "207";
	
	/*
	 * 210§name§message
	 */
	String SC_WMESSAGE = "210";
	
	/*
	 * 300§roomName§message§name
	 */
	String SC_MESSAGE = "300";
	
	/*
	 * 301§roomName§emoticonName§name
	 */
	String SC_EMOTICON = "301";
	
	/*
	 * 302§receiverID§message§senderID
	 */
	String C_WHISPER = "302";
	
	
	/*
	 * 305§roomName§senderID
	 */
	String C_LEAVE_ROOM = "305";
	
	/*
	 * 306§TRUE
	 */
	String S_LEAVE_RESULT = "306";
	
	String SC_CLOSE = "500";
	
	
}

import java.net.*;
import java.io.*;
import java.util.*;
import java.util.Vector;
import java.awt.*;
import java.util.StringTokenizer;
import java.sql.*;


class Ping extends Thread{
	private Daks_Net_socket_ChatServer xServer;
			
	public Ping(Daks_Net_socket_ChatServer server){
	xServer = server;

	}

public void run(){
	while(true){
		try{
		xServer.ping_broadcast();
		
		sleep(2000);
		}catch (IOException e) {}
		catch(InterruptedException r){}
		
		}
	}

}


class ChatThread extends Thread {
	private Daks_Net_socket_ChatServer xServer;
	private Socket xSocket;
  
	PrintWriter streamOut;
	BufferedReader streamIn;
	String room_name = "";
	String category  = "";
	String password  = "";
	String room_no   = "";
	String id        = "";
	String name      = "";
	String maxmember = "";
	String master    = "N";
	String sex       = "";
	String auth      = "";
	String id_no     = "";

	
public ChatThread(Daks_Net_socket_ChatServer server, Socket socket) {
	
	xServer = server;
	xSocket = socket;
	streamOut = null;
	streamIn = null;
	}

public void sendMessage(String msg)throws IOException{
	streamOut.println(msg);
	streamOut.flush();
	}
	
public void disconnect() {
	try{
		this.streamOut.flush();
		xServer.removeClient(this);
		xServer.User_list_broadcast(xServer.User_List(this),this);
        	xServer.db_user_delete(this);
		this.streamIn.close();
 		this.streamOut.close();
 		this.xSocket.close();
  		this.stop();
		System.gc();
	}catch(IOException e){}
}	
	
public  void run(){
		
	System.out.println(
	"클라이언트\n"
	+xSocket
	+"\n에서 접속하였습니다."
	);
	try{	
      
	streamOut = new PrintWriter(new OutputStreamWriter(xSocket.getOutputStream(),"KSC5601"),true);
	streamIn = new BufferedReader(new InputStreamReader(xSocket.getInputStream(),"KSC5601"),256);
	
	String inputLine, outputLine;
	
			
		while(true) {
			inputLine = streamIn.readLine();
		
			if (!inputLine.equals("") || !inputLine.equals(null))	
			msg_process(inputLine);
			}
			}catch(Exception w){
				
			System.out.println(id+" 님의 접속이 비정상 종료되었습니다.");
			disconnect();
			}
		}
					 		
public void msg_process(String inputLine)	{
	try{
		if(inputLine.regionMatches(0,"001",0,3)) {
		String New_Room_Info = inputLine.substring(3).trim();
		master = "Y";
					 				
                StringTokenizer stm = new StringTokenizer(New_Room_Info,"|"); 
	      
	      	while(stm.hasMoreTokens()) {
    			try {
    				room_name = stm.nextToken();
                        	category  = stm.nextToken();
                        	password  = stm.nextToken();
                        	room_no   = stm.nextToken();
                        	room_no   = room_no.trim();
                        	room_no   = room_no.toUpperCase();
                        	id        = stm.nextToken();
    				name      = stm.nextToken();
    				maxmember = stm.nextToken();
    				sex       = stm.nextToken();
    										
    				}catch(NoSuchElementException e){}
    				
    			}
    	  		
			System.out.println(room_name + ":" + category + ":" +  password + ":" + room_no + ":" + id + ":" + name + ":" + maxmember + ":" + sex);
			xServer.log_check(this);
			xServer.New_Room(this);
			xServer.User_list_broadcast(xServer.User_List(this),this);
       			}
					 				
		else if(inputLine.regionMatches(0,"777",0,3)){
			String master_id = inputLine.substring(3).trim();
			this.master = "N";
			xServer.change_master(master_id,this);
			xServer.User_list_broadcast(xServer.User_List(this),this);
			}

		else if(inputLine.regionMatches(0,"444",0,3)){
			String exit_id = inputLine.substring(3).trim();
			xServer.user_exit(exit_id,this);
			xServer.User_list_broadcast(xServer.User_List(this),this);
			}

		else if(inputLine.regionMatches(0,"002",0,3)){

			String Room_In = inputLine.substring(3).trim();
       			StringTokenizer stm = new StringTokenizer(Room_In,"|"); 
	      
	      	 	while(stm.hasMoreTokens()) {
    			      try{
				room_no   = stm.nextToken();
    			      	room_no   = room_no.trim();
               			room_no   = room_no.toUpperCase();
				password  = stm.nextToken();
               			id        = stm.nextToken();
    				name      = stm.nextToken();
    				sex       = stm.nextToken();
    					  
				}catch(NoSuchElementException e){}
			}
          	    
    			
         		xServer.log_check(this);
			xServer.Room_In(this);
			xServer.broadcast("000<br><font color=#0000aa style='font-size:12px'>"+this.id+" 님이 들어오셨습니다.</font>",this);
			xServer.User_list_broadcast(xServer.User_List(this),this);
			}
					 			
		else if(inputLine.equals("888")) {
			xServer.User_list_broadcast(xServer.User_List(this),this);
			}
						
		else if(inputLine.equals("000")) {
			System.out.println(xSocket + "\n" + "님의 접속 종료!");
			xServer.broadcast("000<br><font color=#0000aa style='font-size:12px'>"+this.id+ " 님이 나가셨습니다.</font>",this);
			xServer.removeClient(this);
			disconnect();
			}
		
		else  {
			String UserOut = inputLine.substring(0).trim();
		 	System.out.println(UserOut);
			xServer.broadcast("000"+UserOut, this);
			}
		}catch(IOException e){}
		}
    	}
    

//////////////////////////////////////////////////////////////////////////////



public class Daks_Net_socket_ChatServer{

static Daks_Net_socket_ChatServer server;
static Connection con = null ;
static Statement stmt = null ;
static ResultSetMetaData rsmd = null;
static ResultSet Rs  = null;
static Vector clients = new Vector();
static Hashtable clients_hash = new Hashtable();
static Hashtable rooms_hash = new Hashtable();
static Enumeration broad_enu;
static Enumeration enu;
static String User_list="";

public Daks_Net_socket_ChatServer(){
	}

public synchronized void log_check(ChatThread client)throws IOException{
	
	try{
		if (clients_hash.containsKey(client.id)) { 
			ChatThread thd = (ChatThread)clients_hash.get(client.id);
			thd.sendMessage("666");
			thd.disconnect();
		}
	}catch(NullPointerException e){System.out.println("기존 로그 체크 중 널포인터 에러");}
	}

public void db_user_delete(ChatThread thd){

	try {
		String user_id = thd.id.trim();
		user_id = user_id.toUpperCase();
		String roomNo = thd.room_no.trim();
		roomNo = roomNo.toUpperCase();
		String sql = "delete roomuser where roomno='"+roomNo+"' and id='"+user_id+"'";
		System.out.println(sql);
	
		synchronized (stmt){stmt.executeUpdate(sql);}
	
		}catch(SQLException t) {
			System.out.println("채팅 사용자 DB 삭제중 에러 : " + t);
		}
	}

public void db_room_delete(ChatThread thd){

	try {
		String roomNo = thd.room_no.trim();
	       	roomNo = roomNo.toUpperCase();
		String sql = "delete roomlist where roomno='"+roomNo+"'";
		System.out.println(sql);
		
		synchronized (stmt){stmt.executeUpdate(sql);}
	
		}catch(SQLException t) {
			System.out.println("채팅방 DB 삭제중 에러 : " + t);
		}
	}


public void room_db_write(ChatThread thd){
	try {
		String roomtype = thd.category;
		String roomname = thd.room_name;
		String roompass = thd.password;
		String roomno   = thd.room_no.trim();
		roomno   = roomno.toUpperCase();
		String maxmember= thd.maxmember;
		String sql = "insert into roomlist(roomtype, roomname, roompass, roomno, maxmember) values ('"+roomtype+"','"+roomname+"','"+roompass+"','"+roomno+"','"+maxmember+"')";
		System.out.println(sql);
		synchronized (stmt) {stmt.executeUpdate(sql);}
	
		}catch(SQLException t) {
			System.out.println("채팅방 DB 기록중 에러 : " + t);
		}

	}

public void room_db_user_write(ChatThread thd){
	try {
		String DB_id = thd.id.trim();
	       	DB_id = DB_id.toUpperCase();
		String DB_name = thd.name;
		String DB_roomno = thd.room_no.trim();
		DB_roomno = DB_roomno.toUpperCase();
		String DB_master = thd.master;
		String sql = "insert into roomuser(id, name, roomno, master) values ('"+DB_id+"','"+DB_name+"','"+DB_roomno+"','"+DB_master+"')";
		System.out.println(sql);
		synchronized (stmt){stmt.executeUpdate(sql);}
		}catch(SQLException t) {
		System.out.println("채팅방 DB 기록중 에러 : " + t);
		}

	}
	
public void User_list_broadcast(String msg, ChatThread thd) throws IOException{
	synchronized(clients_hash){
  	broad_enu = clients_hash.elements();
	while(broad_enu.hasMoreElements()) {
		ChatThread client = (ChatThread)broad_enu.nextElement();
		if((client.room_no).equals(thd.room_no)) 
		synchronized (client){client.sendMessage(msg);}
		}
		}
  	
	}

public  void New_Room(ChatThread thd){
	synchronized  (clients_hash) {clients_hash.remove(thd.id);}
	synchronized (rooms_hash) { rooms_hash.remove(thd.room_no);}
	synchronized (clients_hash){clients_hash.put(thd.id,thd);}
	synchronized (rooms_hash){rooms_hash.put(thd.room_no,thd);}
	String sql = "delete roomuser where id = '" + thd.id + "'";
	System.out.println(thd.id + "사용자 정리");
	try{
    		synchronized (stmt){stmt.executeUpdate(sql);}
	}catch(SQLException r){}

    	sql = "delete roomlist where roomno = '" + thd.room_no + "'";
    	System.out.println(thd.room_no + "방 정리");
	try{    
    		synchronized (stmt){stmt.executeUpdate(sql);}
	}catch(SQLException r){}

	room_db_write(thd);
	room_db_user_write(thd);
	
	}
	
	
public  void Room_In(ChatThread thd)throws IOException{
	synchronized  (clients_hash) {clients_hash.remove(thd.id);}
	if (rooms_hash.containsKey(thd.room_no)) {
    		System.out.println("방이 있음");
    		synchronized (clients_hash){clients_hash.put(thd.id,thd);}
    		synchronized (rooms_hash){rooms_hash.put(thd.room_no,thd);}
		String sql = "delete roomuser where id = '" + thd.id + "'";
                System.out.println(thd.id + "사용자 정리");
		try{
        		synchronized (stmt){stmt.executeUpdate(sql);}
		}catch(SQLException r){}
		room_db_user_write(thd);
	}
     	
     	else { 
     		System.out.println("방이 사라졌음");
     		thd.sendMessage("007");
                thd.disconnect();
	     }
    	
	}

public synchronized String User_List(ChatThread thd) {
	User_list = "999";
  	broad_enu = clients_hash.elements();
	while(broad_enu.hasMoreElements()) {
		ChatThread client = (ChatThread)broad_enu.nextElement();
			
		if((client.room_no).equals(thd.room_no)) User_list = User_list + client.id +""+ client.name + "" + client.master + ""+ client.sex + "";
			  	
	}  		
  	System.out.println(User_list);
  	
  	int i;
  	i = User_list.length();
  	User_list = User_list.substring(0,i-1);
  	
  	return User_list;
  	
	}

public synchronized void change_master(String master_id, ChatThread thd){
	broad_enu = clients_hash.elements();
	while(broad_enu.hasMoreElements()) {
		ChatThread client = (ChatThread)broad_enu.nextElement();
		if((client.room_no).equals(thd.room_no) && (client.id).equals(master_id)) {
			synchronized (client) {client.master="Y";}
			System.out.println(client.id + " 님에게 방장권한을 부여했습니다.");
			}  		
		}
  	}
  
  
public synchronized void user_exit(String exit_id, ChatThread thd) throws IOException{
	broad_enu = clients_hash.elements();
	while(broad_enu.hasMoreElements()) {
		ChatThread client = (ChatThread)broad_enu.nextElement();
		if((client.room_no).equals(thd.room_no) && (client.id).equals(exit_id)) {
			client.sendMessage("444");
			System.out.println(client.id + "님을 강퇴하였습니다.");
			client.disconnect();
			}  		
		}
  	}
	
public void broadcast(String msg, ChatThread thd) throws IOException{  		
	synchronized (clients_hash) {
	broad_enu = clients_hash.elements();
	while(broad_enu.hasMoreElements()) {
		ChatThread client = (ChatThread)broad_enu.nextElement();
		if((client.room_no).equals(thd.room_no) && !(client.id).equals(thd.id)) 
			synchronized (client) {
			client.sendMessage(msg);
		}
		}
		}
 	 }	

public  void removeClient(ChatThread thd){ 
	synchronized  (clients_hash) {clients_hash.remove(thd.id);}
	db_user_delete(thd);
	enu = clients_hash.elements();
	String index = "N";
    
    	while(enu.hasMoreElements()) {
		ChatThread client = (ChatThread)enu.nextElement();
		if((client.room_no).equals(thd.room_no)) index = "Y";
		}	
		
		if (index.equals("N")) { 
			synchronized (rooms_hash) { rooms_hash.remove(thd.room_no);}
			db_room_delete(thd);
		}
	}

public void client_add_Vector(ChatThread thd) {
	synchronized (clients) {clients.addElement(thd);}
	}

public void ping_broadcast() throws IOException{
	try{	
    		Enumeration enu = clients_hash.elements();
    		while(enu.hasMoreElements()) {
			ChatThread thd = (ChatThread)enu.nextElement();
			thd.sendMessage("ping");
		}
    			
    		
    		}catch(NullPointerException e) {}	
    	}

public static void main(String[] args) {
	ServerSocket serverSocket = null;
	int port = 25006;
	
	try{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con = DriverManager.getConnection("jdbc:odbc:roomlist","inom","inom");
		stmt = con.createStatement();
		}catch(java.lang.ClassNotFoundException e) {
			System.out.println(e);
			}catch(SQLException r){
			System.out.println(r);
			}

	server = new Daks_Net_socket_ChatServer();
	
	try {
		serverSocket = new ServerSocket(port);
		} catch(IOException e) {
		System.err.println("연결실패");
		System.exit(-1);
		}
	
	System.out.println("서버 \n" + serverSocket + "\n에서 연결을 기다림");
		
	Ping ping_send;
	ping_send = new Ping(server);
	ping_send.start();
	
	try {
		while(true) {
		ChatThread thread;
		thread = new ChatThread(server, serverSocket.accept());
		thread.start();
  		server.client_add_Vector(thread);
    		System.gc();
  		 }
			
		}catch (Exception e) {
		System.out.println("통신이상");
		}
		System.out.println("서버를 종료합니다.");
		}
	}

		
		
					 		
					 			
	
import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Net_socket_ChatClient extends Applet implements Runnable {
	int nState = 0;
	Socket chatSocket = null;
	PrintWriter streamOut = null;
	BufferedReader streamIn = null;
	Vector v_tmp = new Vector();
	TextArea xOutputArea;
	TextField xInputField;
	String getMsg="";
	String tmp_msg ="";
	String tmp="";
	
public void init() {
	}
	
public void sendM(String m) {
	
	try{
		streamOut.println(m);
		streamOut.flush();
		}catch(Exception e){ }

	}
	
public void stop(){
	streamOut.println("000");
	streamOut.flush();
	disconnect();
	}
	
public void destroy(){
	streamOut.println("000");
	disconnect();
	}

public void deleteMessage(){
  getMsg = "";	
	}

public  String getMessage(){
	
	String imsi="";
	try {
	
	getMsg = (String)v_tmp.elementAt(0);
	
	if (!getMsg.equals("")) imsi = getMsg;
	else getMsg="";
	
	v_tmp.removeElementAt(0);
	
	}catch(NullPointerException t){}
	catch(ArrayIndexOutOfBoundsException r){}
	return imsi;
}
	
public  void addMessage(){
	try {
		if (getMsg.equals("")) {
			getMsg = (String)v_tmp.elementAt(0);
			v_tmp.removeElementAt(0);
		   }
		}catch(NullPointerException t){ getMsg = "";}
	}
	
public void initNetwork(String host, int port) {
	try {
		chatSocket = new Socket(host, port);
		streamOut = new PrintWriter(new OutputStreamWriter(chatSocket.getOutputStream(),"KSC5601"),true);
		streamIn = new BufferedReader(new InputStreamReader(chatSocket.getInputStream(),"KSC5601"),512);
		nState = 3;
		}catch(UnknownHostException e){
		System.err.println("호스트가 비정상");
	    	}catch(IOException e){
			System.err.println("입출력에러");
		}
		
	Thread thd;
	thd = new Thread(this);
	thd.start();
	}
	
public void disconnect(){
	try{
		streamOut.close();
		streamIn.close();
		chatSocket.close();
		nState = 0;
		}catch(IOException e){}
	}
	
		
public void run(){
	try{
		while(true){
			String tmp = streamIn.readLine();
			if (!tmp.equals("") && !tmp.equals(null) && !tmp.equals("ping")){ 
			v_tmp.addElement(tmp);
			tmp = "";
			//addMessage();
			}
			}
		}catch(IOException e){
			v_tmp.setElementAt("!EXIT!",0);
			//getMsg="";
			//addMessage();
		}
		}	
	}
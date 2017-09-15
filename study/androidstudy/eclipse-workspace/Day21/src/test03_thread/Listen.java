package test03_thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Listen extends Thread{
	private BufferedReader br = null;
	
	public Listen(Socket socket) {
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				String msg = br.readLine();
				System.out.println("상대방>>"+msg);
			}
		} catch(IOException e) {
			System.out.println("Listen 종료. 상대방 나간듯");
			e.printStackTrace();
		}
	}
}

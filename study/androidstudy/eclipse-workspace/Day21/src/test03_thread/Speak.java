package test03_thread;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Speak extends Thread{
	private BufferedWriter bw;
	
	public Speak(Socket socket) {
		try {
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Speak 생성자 에러.");
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		try {
			while(true) {
				System.out.print("보낼 메시지: ");
				String msg = sc.nextLine();
				
				bw.write(msg + "\n");
				bw.flush();
			}
		} catch (IOException e) {
			System.out.println("Speak 종료. 아마 상대방 나간듯");
			e.printStackTrace();
		}
		
		sc.close();
	}
}

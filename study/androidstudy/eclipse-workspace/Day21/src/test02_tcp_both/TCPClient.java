package test02_tcp_both;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) {
		Socket socket = null;
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			socket = new Socket("아이피 주소" , 7777);
			
			System.out.println("서버랑 연결됐네?!");
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				// 클라이언트가 메시지 먼저 보내기
				System.out.print("서버에게 전할 말: ");
				String sendMsg = sc.nextLine();
				
				bw.write(sendMsg+"\n");
				
				bw.flush();
				
				// 서버의 메시지 받아주기
				String receiveMsg = br.readLine();
				System.out.println("서버 왈>>"+receiveMsg);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //
	}
}

package test02_tcp_both;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.Scanner;

public class TCPServer {
	public static void main(String[] args) {
		ServerSocket servSocket = null;
		Socket socket = null;

		BufferedReader br = null;
		BufferedWriter bw = null;
		
		Scanner sc = new Scanner(System.in);
		try {
			// 서버가 먼저 실행해서 7777포트에서 클라이언트 기다림
			servSocket = new ServerSocket(7777);
			
			System.out.println("기다리는 중...");
			socket = servSocket.accept(); // 기다림
			System.out.println("클라이언트 요청 들어옴!");  // 클라이언트가 접속되면 실행됨
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) { 
				// 서버가 메시지 먼저 받아주기
				String receiveMsg = br.readLine();
	 			System.out.println("클라이언트 왈 >>"+receiveMsg);
	 	
	 			// 서버가 메시지 보내기(답장)
	 			System.out.print("서버가 보낼 메시지: ");
	 			String sendMsg = sc.nextLine();
	 			
	 			bw.write(sendMsg+"\n");
	 			bw.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
	public static void main(String[] args) {
		ServerSocket servSocket = null;
		Socket socket = null;

		BufferedReader br = null;
		
		try {
			// 서버가 먼저 실행해서 7777포트에서 클라이언트 기다림
			servSocket = new ServerSocket(7777);
			
			System.out.println("기다리는 중...");
			socket = servSocket.accept(); // 기다림
			System.out.println("클라이언트 요청 들어옴!");  // 클라이언트가 접속되면 실행됨
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			while(true) { // 한 번이 아니라, 계속 받음
				String receiveMsg = br.readLine(); // 클라이언트 메시지 기다려주기
	 			System.out.println("클라이언트 왈 >>"+receiveMsg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

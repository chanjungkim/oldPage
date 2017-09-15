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
			// ������ ���� �����ؼ� 7777��Ʈ���� Ŭ���̾�Ʈ ��ٸ�
			servSocket = new ServerSocket(7777);
			
			System.out.println("��ٸ��� ��...");
			socket = servSocket.accept(); // ��ٸ�
			System.out.println("Ŭ���̾�Ʈ ��û ����!");  // Ŭ���̾�Ʈ�� ���ӵǸ� �����
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) { 
				// ������ �޽��� ���� �޾��ֱ�
				String receiveMsg = br.readLine();
	 			System.out.println("Ŭ���̾�Ʈ �� >>"+receiveMsg);
	 	
	 			// ������ �޽��� ������(����)
	 			System.out.print("������ ���� �޽���: ");
	 			String sendMsg = sc.nextLine();
	 			
	 			bw.write(sendMsg+"\n");
	 			bw.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

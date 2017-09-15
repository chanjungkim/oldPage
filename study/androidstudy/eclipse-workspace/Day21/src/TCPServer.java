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
			// ������ ���� �����ؼ� 7777��Ʈ���� Ŭ���̾�Ʈ ��ٸ�
			servSocket = new ServerSocket(7777);
			
			System.out.println("��ٸ��� ��...");
			socket = servSocket.accept(); // ��ٸ�
			System.out.println("Ŭ���̾�Ʈ ��û ����!");  // Ŭ���̾�Ʈ�� ���ӵǸ� �����
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			while(true) { // �� ���� �ƴ϶�, ��� ����
				String receiveMsg = br.readLine(); // Ŭ���̾�Ʈ �޽��� ��ٷ��ֱ�
	 			System.out.println("Ŭ���̾�Ʈ �� >>"+receiveMsg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

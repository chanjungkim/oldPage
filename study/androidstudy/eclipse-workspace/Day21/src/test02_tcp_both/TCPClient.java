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
			socket = new Socket("������ �ּ�" , 7777);
			
			System.out.println("������ ����Ƴ�?!");
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				// Ŭ���̾�Ʈ�� �޽��� ���� ������
				System.out.print("�������� ���� ��: ");
				String sendMsg = sc.nextLine();
				
				bw.write(sendMsg+"\n");
				
				bw.flush();
				
				// ������ �޽��� �޾��ֱ�
				String receiveMsg = br.readLine();
				System.out.println("���� ��>>"+receiveMsg);
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

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) {
		Socket socket = null;
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket("아이피주소" , 7777);
			
			System.out.println("서버랑 연결됐네?!");
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	
			while(true) {
				System.out.print("서버에게 전할 말: ");
				String sendMsg = sc.nextLine();
				
				bw.write(sendMsg+"\n");
				
				bw.flush();
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

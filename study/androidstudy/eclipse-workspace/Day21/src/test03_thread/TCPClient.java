package test03_thread;
 
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
 
public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 3333);
             
            // 서버와 연결(Socket) 확보 됐으면 쓰레드 돌려놓기
            new Speak(socket).start();
            new Listen(socket).start();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
         
    }
}
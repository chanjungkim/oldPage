package test03_thread;
 
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
 
public class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(3333);
            System.out.println("wait.......");
            Socket socket = serverSocket.accept();
            System.out.println("accept!!"+socket.getInetAddress());
             
            // 연결(Socket) 확보 이후에는 쓰레드 두개 돌려놓기
            new Speak(socket).start();
            new Listen(socket).start();
        } catch (IOException e) {
            e.printStackTrace();
        }       
    }
}
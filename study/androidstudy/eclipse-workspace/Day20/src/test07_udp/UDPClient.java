package test07_udp;
 
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
 
public class UDPClient {
    public static void main(String[] args) {
        DatagramSocket sendSocket = null;
        DatagramPacket sendPacket = null;
         
        try {
            sendSocket = new DatagramSocket();
            byte[] sendData = 
                "안녕하세요. 저는 양유진 입니다.".getBytes();
             
            sendPacket = new DatagramPacket
            (sendData, sendData.length, InetAddress.getByName("70.12.115.56"), 5555);
//          (데이터, 데이터크기, 수신지 아이피주소, 수신지포트);     
             
            sendSocket.send(sendPacket);
            System.out.println("보냈음");
        } catch (SocketException e) {
            System.out.println("보내는 소켓 생성 실패");
            e.printStackTrace();
        } catch (UnknownHostException e) {
            System.out.println("아이피를 잘못 적었다네요 ;; ");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("패킷 보내다가 예외발생;");
            e.printStackTrace();
        }
    }
}
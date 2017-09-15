package test07_udp;
 
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
 
public class UDPServer {
    public static void main(String[] args) {
        DatagramSocket receiveSocket = null;
        DatagramPacket receivePacket = null;
         
        try {
            receiveSocket = new DatagramSocket(5555);
             
            while (true) {
                byte[] receiveData = new byte[1024];
                receivePacket = 
                        new DatagramPacket
                        (receiveData, receiveData.length);
                System.out.println("나는 서버.. 기다리는중...");
                receiveSocket.receive(receivePacket); // 기다림
 
                System.out.println("보내신분:" + receivePacket.getAddress());
                System.out.println("도착한 메세지:" + new String(receiveData));
            }
        } catch (SocketException e) {
            System.out.println("포트 충돌남");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("메세지 받는 도중 예외 발생함.");
            e.printStackTrace();
        }
    }
}
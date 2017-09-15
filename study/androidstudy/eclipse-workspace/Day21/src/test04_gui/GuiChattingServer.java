package test04_gui;
 
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 
public class GuiChattingServer extends JFrame {
    // �׷��� ���� �������
    private JTextArea textArea = new JTextArea();
    private JTextField textField = new JTextField();
 
    // ��Ʈ��ũ ��� ���� �������
    private BufferedReader br;
    private BufferedWriter bw;
 
    ////////////////////////////////////////////////////////
    public GuiChattingServer() {
        // �׷��� ȯ�� �ʱ�ȭ �۾�
        textArea.setEditable(false);
        textField.setBackground(Color.PINK);
 
        textField.addActionListener(new MyListener());
 
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(textField, BorderLayout.SOUTH);
 
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
 
        //������ �������� �ϰ����� ��Ʈ��ũ �ʱ�ȭ �޼ҵ� �����Ű��
        initTcpIp();
  
    }
     
    // ��Ʈ��ũ �ʱ�ȭ �۾�(����)
    public void initTcpIp() {
        try {
            textArea.setText("Ŭ���̾�Ʈ�� ��ٸ�����....\n");
            ServerSocket serverSocket = new ServerSocket(2222);
            Socket socket = serverSocket.accept(); // wait
            textArea.append("Ŭ���̾�Ʈ ������!!");
             
            br = new BufferedReader
                (new InputStreamReader(socket.getInputStream()));
            bw = new BufferedWriter
                (new OutputStreamWriter(socket.getOutputStream()));
             
            // ����ǰ� ���� �޼��� ���� ������ ���۽�Ű��
            new ReceiveThread().start();
        } catch (IOException e) {
            System.out.println("���� ��Ʈ��ũ �ʱ�ȭ ����");
            e.printStackTrace();
        }
    }
 
    class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String writeMsg = textField.getText();
 
            textArea.append("��:" + writeMsg + "\n");
            textField.setText("");
             
            try {
                // Ŭ���̾�Ʈ�� ������� ���� ���¿����� ���۾���
                if (bw != null) {
                    bw.write(writeMsg + "\n");
                    bw.flush();
                }
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
 
    class ReceiveThread extends Thread{
        @Override
        public void run() {
            try {
                while (true) {
                    String receiveMsg = br.readLine();
                    textArea.append("Ŭ���̾�Ʈ:" + receiveMsg + "\n");
                }
            } catch (IOException e) {
                textArea.append("Ŭ���̾�Ʈ ������\n");
                br = null;
                bw = null;
                initTcpIp();
                e.printStackTrace();
            }
        }
    }
    //////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        GuiChattingServer f = new GuiChattingServer();
    }
}
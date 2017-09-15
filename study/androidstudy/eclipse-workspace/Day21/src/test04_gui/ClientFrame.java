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
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
 
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 
public class ClientFrame extends JFrame {
    // �׷��� ���� �������
    private JTextArea textArea = new JTextArea();
    private JTextField textField = new JTextField();
    ////////////////////////////////////////////////////////
    public ClientFrame() {
        // �׷��� ȯ�� �ʱ�ȭ �۾�
        textArea.setEditable(false);
        textField.setBackground(Color.PINK);
 
        textField.addActionListener(new MyListener());
 
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(textField, BorderLayout.SOUTH);
 
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
         
    }
 
    class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String writeMsg = textField.getText();
 
            textArea.append("��:" + writeMsg + "\n");
            textField.setText("");
        }
    }
 
    //////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        ClientFrame f = new ClientFrame();
    }
}
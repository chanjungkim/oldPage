package bin;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import socket.ChatServer;

public class RunServer extends JFrame{
	
	JLabel ip;
	JButton serverStart;
	JTextArea log;
	ChatServer cs;
	public RunServer(){
		Container con = getContentPane();
		try {
			ip = new JLabel("server ip : " + InetAddress.getLocalHost().getHostAddress() + "  port : 2568");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		serverStart = new JButton("start");
		con.setLayout(new FlowLayout(FlowLayout.CENTER));
		con.add(ip);
		con.add(serverStart);
		setLocationRelativeTo(null);
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		eventReg();
	}
	
	public void eventReg(){
		serverStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Thread(){
					@Override
					public void run() {
						super.run();
						cs = new ChatServer();
						try {
							cs.startUp();
							cs.connectListening();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}.start();
				serverStart.setVisible(false);
			}
		});
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				exit();
			}
		});

	}
	
	public void exit(){
		if(cs != null) cs.shutDown();
		setVisible(true);
		dispose();
		System.exit(0);
	}
	
	
	public static void main(String[] args) throws IOException {
		new RunServer();
	}
}

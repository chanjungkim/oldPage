package view;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import model.User;
import socket.ChatClient;

public class MainClientUI extends JFrame {

	private static MainClientUI mc;
	LoginP loginP;
	WaitingP waitingP;
	ChatRoomP chatroomP;
	JPanel backGroundP;
	CardLayout cardLayout;
	ChatClient client;
	
	User usr;
	private MainClientUI(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		loginP = new LoginP();
		waitingP = new WaitingP();
		chatroomP = new ChatRoomP();
		backGroundP = new JPanel();
		cardLayout = new CardLayout();
		client = new ChatClient();
		
		loginP.setUi(this);
		waitingP.setUi(this);
		client.setMainUI(this);
		chatroomP.setUi(this);
		try {
			client.connect();
			client.receiveMessage();
		} catch (Exception e) {
			e.printStackTrace();
			showMessage("connection to server failed");
			exit();
		}
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				if (client != null) {
					client.setStop(true);
					client.disConnect();
				}
			}
		});
		
		
		setComp();
	}
	
	/*
	 * Using the single ton pattern in order to block the duplicated creation
	 */
	public static MainClientUI getInstance(){
		if(mc == null){
			synchronized(MainClientUI.class){
				if(mc == null){
					mc = new MainClientUI();
				}
			}
		}
		return mc;
	}
	
	
	/*
	 * setter & getter
	 */
	
	public User getUsr() {
		return usr;
	}

	public void setUsr(User usr) {
		this.usr = usr;
	}

	public WaitingP getWaitingP() {
		return waitingP;
	}

	public ChatRoomP getChatroomP() {
		return chatroomP;
	}

	/*
	 * View & Layout Composition
	 */
	public void setComp(){

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		backGroundP.setLayout(cardLayout);
		backGroundP.add(loginP, "loginP");
		backGroundP.add(waitingP, "waitingP");
		backGroundP.add(chatroomP, "chatroomP");
		this.add(backGroundP);
		this.setPreferredSize(new Dimension(330, 358));
		this.pack();  // Layout Compact method
		this.setLocationRelativeTo(null);  // place the view on center of screen
		this.setVisible(true);
	}
	
	/*
	 * card layout settings
	 */
	public void showLoginP() {
		cardLayout.show(backGroundP, "loginP");
	}
	public void showWaitingP() {
		cardLayout.show(backGroundP, "waitingP");
	}
	public void showChatroomP() {
		cardLayout.show(backGroundP, "chatroomP");
	}
	
	
	public void setViewCompact(){
		this.pack();
		this.setLocationRelativeTo(null);
		
	}
	
	/*
	 * Frame exit on window
	 */
	public void exit(){
		client.disConnect();
		dispose();
		System.exit(0);
	}
	
	
	public void sendMessage(String message){
		client.sendMessage(message);
	}
	
	public void showMessage(String message){
		JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	
	

}

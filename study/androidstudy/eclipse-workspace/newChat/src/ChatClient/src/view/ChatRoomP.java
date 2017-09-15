package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import common.MessageType;

public class ChatRoomP extends JPanel implements MessageType{

	JSplitPane splitP;
	JPanel eastP, southP;
	MessageP messageP;
	JScrollPane scrollP;
//	JComboBox<String> whisperCB;
	MainClientUI ui;
	DefaultListModel userListModel;
	JList userList;
	JTextField tf;
	JButton fileB, invitationB, submitB, exitB, emoticon, clear;
	
	private String roomName;
	
	public void setUi(MainClientUI ui) {
		this.ui = ui;
	}

	public ChatRoomP(){
		
		splitP = new JSplitPane();
		messageP = new MessageP();
		eastP = new JPanel();
		southP = new JPanel();
		scrollP = new JScrollPane(messageP);
		messageP.setScroll(scrollP);
		
		fileB = new JButton("File Transfer");
		invitationB = new JButton("Invitation");
		submitB = new JButton("send");
		exitB = new JButton("EXIT");
		emoticon = new JButton();
		clear = new JButton();
//		whisperCB = new JComboBox<String>();
		userListModel = new DefaultListModel();
		userList = new JList(userListModel);
		
		setComp();
		eventReg();
		
	}
	//setter getter
	public String getRoomName() {
		return roomName;
	}
	
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	
	public MessageP getMessageP() {
		return messageP;
	}

	//Layout Setting
	public void setComp(){
		eastP.setPreferredSize(new Dimension(150, 450));
		southP.setPreferredSize(new Dimension(650, 35));
		scrollP.setPreferredSize(new Dimension(470, 500));
		scrollP.setBackground(new Color(202, 255, 255));
		
		//South Panel Setting (Typing Field)
		southP.setLayout(new FlowLayout(FlowLayout.LEADING));
//		southP.add(whisperCB);
//		whisperCB.addItem("All");
		tf = new JTextField();
		tf.setPreferredSize(new Dimension(350, 27));
		
		emoticon = new JButton("emoticon");
		clear = new JButton("clean");

		southP.add(tf);
		
		southP.add(emoticon);
		southP.add(submitB);
		southP.add(exitB);
//		southP.add(clear);
		
		
		//East Panel Setting
		eastP.setLayout(new BorderLayout());
		JPanel buttonP = new JPanel();
		JScrollPane userScroll = new JScrollPane(eastP);
		userScroll.setBorder(BorderFactory.createTitledBorder("Connected Users"));
		userList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		userList.setVisibleRowCount(10);
		userList.setPreferredSize(new Dimension(200, 300));
		
		eastP.add(userList, BorderLayout.NORTH);
		eastP.add(buttonP, BorderLayout.CENTER);
//		buttonP.add(new JButton("File Send"));
//		buttonP.add(new JButton("Kick out"));
		
		
		
		this.setLayout(new BorderLayout());
		splitP.setLeftComponent(scrollP);
		splitP.setRightComponent(userScroll);
		add(splitP, BorderLayout.CENTER);
		add(southP, BorderLayout.SOUTH);
		splitP.setEnabled(false);
	}
	
	public void setUserList(String userList){
		userListModel.removeAllElements();
		String[] users = userList.split("/");
		for (String user : users) {
			String[] tokens = user.split(",");
			if (tokens.length != 1) {
				userListModel.addElement(tokens[1]);
			}
		}
	}
	
	
	//Event Regist
	public void eventReg(){
		submitB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				sendMessage();
				
			}
		});
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				sendMessage();
			}
		});
		
		emoticon.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				EmoticonPanel emP = new EmoticonPanel();
				emP.setUi(ui);
			}
		});
		exitB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ui.sendMessage(C_LEAVE_ROOM + DELIMETER + getRoomName() + DELIMETER + ui.getUsr().getId());
			}
		});
		
	}
	
	public void sendMessage(){
		if (tf.getText().trim().length() != 0) {
			ui.sendMessage(SC_MESSAGE + DELIMETER + getRoomName() + DELIMETER + tf.getText() + DELIMETER + ui.getUsr().getName());
			tf.setText("");
		}
	}
	
	public static void main(String[] args) {
		JFrame frm = new JFrame("Test");
		frm.add(new ChatRoomP());
		frm.setVisible(true);
		frm.pack();
		System.out.println(frm.getSize().toString());
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}


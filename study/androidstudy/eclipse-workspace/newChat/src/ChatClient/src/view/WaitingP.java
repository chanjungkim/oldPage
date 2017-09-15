package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;

import common.MessageType;

public class WaitingP extends JPanel implements MessageType {
	JPanel northP, southP, centerP, eastP, roomListP, typingP;
	JScrollPane scrollRoomP;
	JButton createRoomB, logoutB, submitB;
	JTextField typingF;
	MainClientUI ui;
	Dimension btnSize;
	DefaultListModel listModel;
	JList list;
	JTextPane textP;
	StyledDocument doc;
	public WaitingP(){
		northP = new JPanel();
		southP = new JPanel();
		centerP = new JPanel();
		eastP = new JPanel();
		roomListP = new JPanel();
		scrollRoomP = new JScrollPane(roomListP);
		typingP = new JPanel();
		
		createRoomB = new JButton("Create Room");
		logoutB = new JButton("Log Out");
		submitB = new JButton("Submit");
		
		typingF = new JTextField(10);
		
		
		//set the room-button-size
		btnSize = new Dimension(185, 60);
		
		// user list setting
		listModel = new DefaultListModel();
		list = new JList(listModel);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setVisibleRowCount(10);
		
		
		setComp();
		eventReg();
	}
	
	public void setUi(MainClientUI ui) {
		this.ui = ui;
	}

	public void setComp(){
		northP.setPreferredSize(new Dimension(600, 100));
		southP.setPreferredSize(new Dimension(600, 200));
		roomListP.setSize(390, 390);
		scrollRoomP.setPreferredSize(new Dimension(400, 385));
		centerP.add(scrollRoomP);
		eastP.setPreferredSize(new Dimension(200, 400));
		
		//North Panel Setting
		JLabel content = new JLabel("Thanks for using HG-Chat");
		content.setFont(new Font("Serif", Font.PLAIN, 30));
		northP.setLayout(new FlowLayout(FlowLayout.CENTER));
		northP.add(content);
		
		
		//East Panel Setting
		eastP.setLayout(new BorderLayout());
		JPanel buttonP = new JPanel();
		buttonP.setLayout(new FlowLayout());
		buttonP.add(createRoomB);
		buttonP.add(logoutB);
		eastP.add(buttonP, BorderLayout.SOUTH);

		JScrollPane scrollP = new JScrollPane(list);
		scrollP.setBorder(BorderFactory.createTitledBorder("Waiting Room User"));
		eastP.add(scrollP, BorderLayout.CENTER);
		
		//Center Panel Setting
		roomListP.setLayout(new WrapLayout(WrapLayout.LEADING));
		centerP.setBorder(BorderFactory.createTitledBorder("Chatting Rooms"));
		
		//South Panel Setting
		southP.setLayout(new BorderLayout());
		//Typing Filed Setting Using GridBagLayout
		GridBagLayout grid = new GridBagLayout();
		GridBagConstraints cons = new GridBagConstraints();
		cons.fill = GridBagConstraints.BOTH;
		typingP.setLayout(grid);
		
		cons.gridx = 0;
		cons.gridwidth = 1;
		cons.weightx = 0.8;
		grid.setConstraints(typingF, cons);
		typingP.add(typingF);
		
		cons.gridx = 1;
		cons.gridwidth = 1;
		cons.weightx = 0.1;
		grid.setConstraints(submitB, cons);
		typingP.add(submitB);
		
		//Chatting View Setting
		textP = new JTextPane();
		textP.setPreferredSize(southP.getPreferredSize());
		doc = textP.getStyledDocument();
		
		southP.add(textP, BorderLayout.CENTER);
		southP.add(typingP, BorderLayout.SOUTH);
		
		//assemble north, center, south and east panel
		this.setLayout(new BorderLayout());
		this.add(northP, BorderLayout.NORTH);
		this.add(southP, BorderLayout.SOUTH);
		this.add(centerP, BorderLayout.CENTER);
		this.add(eastP, BorderLayout.EAST);
	}
	
	// All event from this panel add
	public void eventReg(){
		//click the create Room button
		createRoomB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CreateRoom cr = new CreateRoom();
			}
		});
		
		logoutB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ui.sendMessage(SC_CLOSE + DELIMETER + ui.getUsr().getId());
				ui.exit();
			}
		});
		
		submitB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				sendMessage(typingF.getText());
			}
		});
		typingF.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				sendMessage(typingF.getText());
			}
		});
		
	}
	
	
	//Each rooms created as JButton.
	public void createRoom(String roomNames){
		roomListP.removeAll();
		String[] roomName = roomNames.split(",");
		for (String eachRoom : roomName) {
			JButton roomBtn = new JButton(eachRoom);
			roomBtn.setPreferredSize(btnSize);
			roomListP.add(roomBtn);
			roomBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					ui.sendMessage(C_JOIN_ROOM + DELIMETER + eachRoom + DELIMETER + ui.getUsr().getId());
				}
			});
		}
		updateUI();
	}
	
	public void cleanRoom(){
		roomListP.removeAll();
		updateUI();
	}
	
	public void sendMessage(String message){
		if (message.trim().length() != 0) {
			ui.sendMessage(SC_WMESSAGE + DELIMETER + ui.getUsr().getName() + DELIMETER + message);
			typingF.setText("");
		}

	}
	
	public void inputMessage(String id, String message){
		try {
			doc.insertString(doc.getLength(), id + " : " + message + "\n", null);
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void setUserList(String userInfo){
		listModel.clear();
		String[] users = userInfo.split("/");
		for (String user : users) {
			String[] tokens = user.split(",");
			if (tokens.length != 1) {
				listModel.addElement(tokens[1]);
			}
		}
	}
	public static void main(String[] args) {
		JFrame frm = new JFrame();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.add(new WaitingP());
		frm.pack();
		System.out.println(frm.getSize().toString());
		frm.setVisible(true);
		
		
	}
}

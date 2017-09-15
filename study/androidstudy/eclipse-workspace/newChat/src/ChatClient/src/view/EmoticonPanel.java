package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;

import common.MessageType;

public class EmoticonPanel extends JDialog implements MessageType{
	
	JButton emoticonB1, emoticonB2, emoticonB3, emoticonB4, emoticonB5, emoticonB6, emoticonB7, emoticonB8, emoticonB9, 
			emoticonB10, emoticonB11, emoticonB12, emoticonB13, emoticonB14, emoticonB15, emoticonB16;
	Icon emoticonI1, emoticonI2, emoticonI3, emoticonI4, emoticonI5, emoticonI6, emoticonI7, emoticonI8, emoticonI9,
		 emoticonI10, emoticonI11, emoticonI12, emoticonI13, emoticonI14, emoticonI15, emoticonI16;
	
	MainClientUI ui;
	
	
	public EmoticonPanel(){
		setTitle("Emoticon");
		emoticonI1 = new ImageIcon(getClass().getResource("/image/e1.png"));
		emoticonI2 = new ImageIcon(getClass().getResource("/image/e2.png"));
		emoticonI3 = new ImageIcon(getClass().getResource("/image/e3.png"));
		emoticonI4 = new ImageIcon(getClass().getResource("/image/e4.png"));
		emoticonI5 = new ImageIcon(getClass().getResource("/image/e5.png"));
		emoticonI6 = new ImageIcon(getClass().getResource("/image/e6.png"));
		emoticonI7 = new ImageIcon(getClass().getResource("/image/e7.png"));
		emoticonI8 = new ImageIcon(getClass().getResource("/image/e8.png"));
		emoticonI9 = new ImageIcon(getClass().getResource("/image/e9.png"));
		
		emoticonB1 = new JButton(emoticonI1);
		emoticonB2 = new JButton(emoticonI2);
		emoticonB3 = new JButton(emoticonI3);
		emoticonB4 = new JButton(emoticonI4);
		emoticonB5 = new JButton(emoticonI5);
		emoticonB6 = new JButton(emoticonI6);
		emoticonB7 = new JButton(emoticonI7);
		emoticonB8 = new JButton(emoticonI8);
		emoticonB9 = new JButton(emoticonI9);
		
		eventRegist();

		setLocationRelativeTo(null);
		setSize(400,400);
		setVisible(true);
		
		setComponent();
		
	}
	//setter 
	public void setUi(MainClientUI ui) {
		this.ui = ui;
	}

	public void setComponent(){
		setLayout(new GridLayout(3, 3));
		add(emoticonB1);
		add(emoticonB2);
		add(emoticonB3);
		add(emoticonB4);
		add(emoticonB5);
		add(emoticonB6);
		add(emoticonB7);
		add(emoticonB8);
		add(emoticonB9);
	}
	
	public void exit(){
		this.setVisible(false);
		this.dispose();
	}
	
	// send emoticon to server
	public void sendEmoticon(String emoticonName){
		
		ui.sendMessage(SC_EMOTICON + DELIMETER + ui.getChatroomP().getRoomName() + DELIMETER + emoticonName + DELIMETER + ui.getUsr().getName());
		exit();
	}
	
	public void eventRegist(){
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				exit();
			}
		});
		
		emoticonB1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendEmoticon("e1.png");
			}
		});
		emoticonB2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendEmoticon("e2.png");
			}
		});
		emoticonB3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendEmoticon("e3.png");
				}
		});
		emoticonB4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendEmoticon("e4.png");
			}
		});
		emoticonB5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendEmoticon("e5.png");
			}
		});
		emoticonB6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendEmoticon("e6.png");
			}
		});
		emoticonB7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendEmoticon("e7.png");
			}
		});
		emoticonB8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendEmoticon("e8.png");
			}
		});
		emoticonB9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendEmoticon("e9.png");
			}
		});
		
	}
	
	
	
}

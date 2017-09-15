package test05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame implements ActionListener{
	private JButton btn = new JButton("´©¸£À¸½Ã¿ë");

	public MyFrame() {
		add(btn);

		btn.addActionListener(this);
		
		setLayout(new FlowLayout());
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("´­·È¾û¤Ð¤Ð");
	}
}
package test02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	private JButton btn;
	
	public MyFrame() {
		System.out.println("JFrame 상속받아서 MyFrame 설계하기");
		
		setLayout(new FlowLayout());
		
		btn = new JButton("버트으은");
		add(btn);
		
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
}


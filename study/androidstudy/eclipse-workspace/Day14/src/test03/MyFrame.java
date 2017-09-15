package test03;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	private JPanel panel;
	private JButton btn01;
	private JButton btn02;
	
	public MyFrame() {
		btn01 = new JButton("버튼1");
		btn02 = new JButton("버튼2");
		panel = new JPanel();
		
		btn01.setEnabled(false);
		
		panel.add(btn01);
		panel.add(btn02);
		
		panel.setBackground(Color.YELLOW);

		this.add(panel);
		
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}

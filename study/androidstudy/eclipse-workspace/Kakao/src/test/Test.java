package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JFrame{
	private JButton btn;
	private JPanel panel;
	
	public Test() {
		btn = new JButton("클릭해보세요");
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JPanel room = new JPanel();	
			}
		});
	}	
}

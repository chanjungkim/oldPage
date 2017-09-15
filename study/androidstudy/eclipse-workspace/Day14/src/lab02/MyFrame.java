package lab02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	private JButton[] btns;
	private JPanel panel;
	
	public MyFrame() {
		btns= new JButton[10];
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		for(int i = 0 ; i < btns.length ; i++) {
			btns[i] = new JButton("Button"+i);
			panel.add(btns[i]);
		}
		
		add(panel);
		
		setSize(421, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}

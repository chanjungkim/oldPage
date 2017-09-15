package test04;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame extends JFrame{
	private MyPanel myPanel = new MyPanel();
	private JPanel panel = new JPanel();

	public MyFrame() {
		panel.setLayout(new BoxLayout(panel, 1));
		
		panel.add(myPanel);
		
		add(panel);
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
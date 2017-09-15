package myTest01;

import javax.swing.JFrame;
import javax.swing.JPanel;

import test01.MyPanel;

public class MyFrame extends JFrame{
	private JPanel panel = new JPanel();
	private AppletImage img = new AppletImage();
	
	public MyFrame() {
		img.init();
		panel = new MyPanel();
		panel.add(img);
		
		add(panel);
		
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}

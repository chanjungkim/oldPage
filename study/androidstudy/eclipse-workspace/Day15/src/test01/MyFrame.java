package test01;

import javax.swing.JFrame;

class MyFrame extends JFrame{
	private MyPanel panel;
	
	public MyFrame() {
		panel = new MyPanel();
		
		add(panel);
		
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
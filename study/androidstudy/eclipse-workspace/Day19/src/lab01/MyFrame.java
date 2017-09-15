package lab01;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	private MyPanel panel = new MyPanel();
	public MyFrame() {
		setTitle("My Game");
		add(panel);
		setSize(500, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame();
	}
}

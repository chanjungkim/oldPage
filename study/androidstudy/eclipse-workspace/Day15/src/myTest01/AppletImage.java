package myTest01;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JApplet;

public class AppletImage extends JApplet{
	private Image img;

	@Override
	public void init() {
		img = getImage(getCodeBase(), "http://img1.ezday.co.kr/cache/board/2011/04/14/fc1c7293bc6d253e6249081312788b9f.JPG");
		System.out.println(getCodeBase());
		
		setSize(500, 500);
	}
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}

}

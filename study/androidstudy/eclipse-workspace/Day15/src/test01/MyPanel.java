package test01;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.pink);
		
		g.drawRect(10, 10, 50, 50);
	}
}

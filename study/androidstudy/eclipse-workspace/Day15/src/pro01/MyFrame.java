package pro01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private MyPanel myPanel;
	private JPanel panel; 
	private JPanel btnPanel;
	private JButton leftBtn;
	private JButton rightBtn;
	public MyFrame() {
		myPanel = new MyPanel();
		panel = new JPanel();
		btnPanel = new JPanel();
		leftBtn = new JButton("왼쪽으로 이동");
		rightBtn = new JButton("오른쪽으로 이동");
						
		leftBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				myPanel.x-=50;
			}
		});
		rightBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myPanel.x+=50;
			}
		});
		
		myPanel.setLayout(new BorderLayout());
		panel.setLayout(new BoxLayout(panel, 1));
		btnPanel.add(leftBtn);
		btnPanel.add(rightBtn);
		panel.add(myPanel);
		panel.add(btnPanel);
		add(panel);
		
		setSize(400, 300);
		setTitle("박스 움직이기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private int x = getWidth();
		private int y = 20;
		private Graphics graphic;
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			graphic = g;
			setBackground(Color.YELLOW);
			
			graphic.setColor(Color.RED);
			graphic.fillRect(x, y, 30, 150);
			
			repaint();
		}
	}
}

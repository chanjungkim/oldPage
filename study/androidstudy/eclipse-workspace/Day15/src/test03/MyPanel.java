package test03;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
	private int rectX=10, rectY=10;
	private int width=50, height=50;
	private Color color=Color.RED;
	private JPanel scorePanel = new JPanel();
	private JLabel score= new JLabel("");
	private JPanel panel = new JPanel();
	public MyPanel() {
		setFocusable(true);
		requestFocus();
		
		addMouseListener(new MyMouseListener());
	}
		
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.pink);
		
		g.setColor(color);
		g.fillRoundRect(rectX, rectY, width, height, 90, 90);
		
		g.drawRect(10, 10, 50, 50);
		g.fillRect(100, 100, 50, 50);
	}
	class MyMouseListener implements MouseListener{
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println(e.getButton()+"마우스가 클릭(눌렸다떼졌)되었어요.");
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println(e.getButton()+"마우스가 눌렸어요1.");
		}
		@Override
		public void mouseExited(MouseEvent e) {
			System.out.println(e.getButton()+"마우스가 창밖으로 나갔어요.");
		}
		@Override
		public void mousePressed(MouseEvent e) {
			if(e.getButton() == 1) {
				Random random = new Random();
				int r = random.nextInt(256);
				int g = random.nextInt(256);
				int b = random.nextInt(256);
				width=50;
				height=50;
						
				color = new Color(r, b, g);
			}else if(e.getButton()==3){
				width+=10;
				height+=10;
			}
			rectX=e.getX();
			rectY=e.getY();
			
			repaint();
			System.out.println(e.getButton()+"마우스가 눌렸어요2.");
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println(e.getButton()+"마우스가 떼졌어요2.");
		}
	}
}


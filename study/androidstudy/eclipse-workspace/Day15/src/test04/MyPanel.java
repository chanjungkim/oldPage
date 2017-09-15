package test04;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	private int rectX=10, rectY=10;
	private int width=0, height=0;
	private int xTemp=0, yTemp=0;
	private Color color=Color.RED;
	
	public MyPanel() {
		MyPaintListener listener = new MyPaintListener();
		
		setFocusable(true);
		requestFocus();
		
		addMouseListener(listener);
		addMouseMotionListener(listener);
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
	class MyPaintListener implements MouseListener, MouseMotionListener{
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println(e.getButton()+"마우스가 클릭(눌렸다떼졌)되었어요.");
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println(e.getButton()+"마우스가 들어왔어요.");
		}
		@Override
		public void mouseExited(MouseEvent e) {
			System.out.println(e.getButton()+"마우스가 창밖으로 나갔어요.");
		}
		@Override
		public void mousePressed(MouseEvent e) {
			rectX = xTemp = e.getX();
			rectY = yTemp = e.getY();
			System.out.println(e.getButton()+"마우스가 눌렸어요2.");
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println(e.getButton()+"마우스가 떼졌어요2.");
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			if(e.getX() > rectX && e.getY() > rectY) {
				rectX = xTemp;
				rectY = yTemp;
				
				width = e.getX() - rectX;
				height = e.getY() - rectY;
			}else if(e.getX() < rectX && e.getY() < rectY){
				rectX = e.getX();
				rectY = e.getY();
				width = xTemp-e.getX();
				height = yTemp-e.getY();
			}else if(e.getX() < rectX){
				rectX = e.getX();
				rectY = yTemp;
				width = xTemp-e.getX();
				height = e.getY()-yTemp;
			}else{
				rectX = xTemp;
				rectY = e.getY();
				width = e.getX()-xTemp;
				height = yTemp-e.getY();				
			}
			repaint();
		}
		@Override
		public void mouseMoved(MouseEvent e) {

			// TODO Auto-generated method stub
			
		}
	}
}


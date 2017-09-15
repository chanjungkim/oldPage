package test02;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	private int rectX=10, rectY=10;
	private int width=50, height=50;
	private Color color=Color.RED;
	public MyPanel() {

		setFocusable(true);
		requestFocus();
		
		addKeyListener(new MyKeyListener());      // 키에 반응만함. 텍스트가 들어가진 않음.
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
	
	class MyKeyListener implements KeyListener{
		@Override
		public void keyPressed(KeyEvent e) {
			//System.out.println(e.getKeyChar()+"키가 눌렸어요");
			if(e.getKeyCode()==KeyEvent.VK_UP) {
				rectY-=20;
			}else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
				rectY+=20;
			}else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
				rectX-=20;
			}else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
				rectX+=20;
			}else if(e.getKeyCode()==KeyEvent.VK_W) {
				height+=10;
				width+=10;
			}else if(e.getKeyCode()==KeyEvent.VK_E) {
				height-=10;
				width-=10;
			}else if(e.getKeyCode()==KeyEvent.VK_Q) {
				Random r = new Random();
				int rColor = r.nextInt(256);
				int gColor = r.nextInt(256);
				int bColor = r.nextInt(256);
				color = new Color(rColor, gColor, bColor);
			}
			
			repaint();
			System.out.println(e.getKeyCode()+", "+e.getKeyChar()+", "+e.isControlDown());
		}
		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println(e.getKeyChar()+"키가 떼졌어요");
		}
		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println(e.getKeyChar()+"키가 써졌어요");
		}
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
			System.out.println(e.getButton()+"마우스가 떼졌어요1.");
		}
		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println(e.getButton()+"마우스가 눌렸어요2.");
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println(e.getButton()+"마우스가 떼졌어요2.");
		}
	}
	class MyKeyListener2 extends KeyAdapter{ // 보통은 클래스 상속받지 않고 인터페이스를 주로씀
		@Override
		public void keyPressed(KeyEvent e) {
			// 키가 눌렸을 때 실행 할 문장 적기
		}
	}
}


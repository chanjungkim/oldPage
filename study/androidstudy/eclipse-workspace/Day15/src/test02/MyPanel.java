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
		
		addKeyListener(new MyKeyListener());      // Ű�� ��������. �ؽ�Ʈ�� ���� ����.
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
			//System.out.println(e.getKeyChar()+"Ű�� ���Ⱦ��");
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
			System.out.println(e.getKeyChar()+"Ű�� �������");
		}
		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println(e.getKeyChar()+"Ű�� �������");
		}
	}
	class MyMouseListener implements MouseListener{
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println(e.getButton()+"���콺�� Ŭ��(���ȴٶ���)�Ǿ����.");
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println(e.getButton()+"���콺�� ���Ⱦ��1.");
		}
		@Override
		public void mouseExited(MouseEvent e) {
			System.out.println(e.getButton()+"���콺�� �������1.");
		}
		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println(e.getButton()+"���콺�� ���Ⱦ��2.");
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println(e.getButton()+"���콺�� �������2.");
		}
	}
	class MyKeyListener2 extends KeyAdapter{ // ������ Ŭ���� ��ӹ��� �ʰ� �������̽��� �ַξ�
		@Override
		public void keyPressed(KeyEvent e) {
			// Ű�� ������ �� ���� �� ���� ����
		}
	}
}


package lab01;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class MyPanel extends JPanel implements KeyListener{
	Enermy enermy;
	SpaceShip spaceship;
	Missile[] missile = new Missile[100];
	int count=0;
	
	public MyPanel() {
		super();
		this.addKeyListener(this);
		this.requestFocus();
		setFocusable(true);
		enermy = new Enermy("C:\\Users\\student\\eclipse-workspace\\Day19\\src\\lab01\\enermy.png");
		spaceship = new SpaceShip("C:\\Users\\student\\eclipse-workspace\\Day19\\src\\lab01\\spaceship.png");
		for(int i = 0 ; i < 100 ; i++) {
			missile[i] = new Missile("C:\\Users\\student\\eclipse-workspace\\Day19\\src\\lab01\\missile.png");
		}
		class MyThread extends Thread{
			public void run() {
				while(true) {
					enermy.update();
					spaceship.update();
					for(int i = 0 ; i < 100 ; i++) {
						missile[i].update();
					}
					
					repaint();
					try {
						Thread.sleep(10);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
				
				//enermy.img.getWidth()/2;
			}
		}
		Thread t = new MyThread();
		t.start();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		enermy.draw(g);
		spaceship.draw(g);
		for(int i = 0 ; i < 100 ; i++) {
			missile[i].draw(g);
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		spaceship.keyPressed(e);
		missile[count].keyPressed(e, spaceship.x, spaceship.y);
		count++;
		if(count > 99) {
			count=0;
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}
}

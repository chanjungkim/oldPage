package test;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test extends JFrame{
    private boolean isPressed = false;
    private JLabel lb = new JLabel("ffff");
    private JButton diceBtn = new JButton("Click!");
    private JPanel panel = new JPanel();
    private int i = 0;
    public Test() {
    	diceBtn.addMouseListener(new MouseListener() {
    		@Override
    		public void mousePressed(MouseEvent e) {
    			isPressed = true;
    			while(isPressed) {
    				changeText();
    			}
    		}
    		@Override
    		public void mouseReleased(MouseEvent e) {
    			isPressed=false;
        		
    		}
    		@Override
    		public void mouseClicked(MouseEvent e) {
    			// TODO Auto-generated method stub
    			
    		}
    		@Override
    		public void mouseEntered(MouseEvent e) {
    			// TODO Auto-generated method stub
    			
    		}
    		@Override
    		public void mouseExited(MouseEvent e) {
    			// TODO Auto-generated method stub
    			
    		}
    	});
    	panel.setLayout(new BoxLayout(panel, 1));
    	panel.add(lb);
    	panel.add(diceBtn);
    	add(panel);
    	setSize(400, 400);
    	setVisible(true);
    }
    public void changeText() {
		lb.setText(Integer.toString(i));
		repaint();
			try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(i++);
		if(i==10) i = 0;
    }
    public static void main(String[] args) {
		new Test();
	}
}
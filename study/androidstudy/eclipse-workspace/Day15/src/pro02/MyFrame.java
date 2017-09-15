package pro02;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private final String EN = "Don't cry before you are hurt.";
	private final String KO = "다치기도 전에 울지말라.";
	private JLabel lb;
	private JPanel panel;
	
	public MyFrame() {
		lb = new JLabel("Don't cry before you are hurt.");
		panel = new JPanel();
		
		lb.setFont(new Font("돋움", Font.BOLD ,50));
		
		MouseListener listener = new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lb.setText(KO);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lb.setText(EN);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lb.setText(KO);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lb.setText(EN);
			}
		};
		
		lb.addMouseListener(listener); 
		
		panel.add(lb);
		add(panel);
		
		setTitle("My Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		pack();
	}
}

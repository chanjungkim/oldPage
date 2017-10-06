package mission01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	private JPanel panel;
	private JButton redBtn;
	private JButton blueBtn;
	
	public MyFrame() {
		panel = new JPanel();
		redBtn = new JButton("RED");
		blueBtn = new JButton("BLUE");
		
		redBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Color color = new Color(255, 0, 0);
				panel.setBackground(color);
			}
		});
		
		blueBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Color color = new Color(0, 0, 255);
				panel.setBackground(color);
			}
		});
		panel.add(redBtn);
		panel.add(blueBtn);
		
		this.add(panel);
		
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
	}
	
}

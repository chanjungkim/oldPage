package mission02;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	private JPanel numPanel;
	private JPanel btnPanel;
	private JPanel panel;
	private JButton countBtn;
	private JButton resetBtn;
	private JLabel numLabel;
	private int num;
	
	public MyFrame() {
		numPanel = new JPanel();
		btnPanel = new JPanel();
		panel = new JPanel();
		countBtn = new JButton("COUNT");
		numLabel = new JLabel("0");
		resetBtn = new JButton("RESET");

		numLabel.setFont(new Font("굴림", Font.BOLD, 100));
		
		countBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				num++;
				numLabel.setText(Integer.toString(num));
			}
		});
		resetBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				num = 0;
				numLabel.setText("0");
			}
		});
		
		panel.setLayout(new BoxLayout(panel, 1));
		
		numPanel.add(numLabel);
		btnPanel.add(countBtn);
		btnPanel.add(resetBtn);
		
		panel.add(numPanel);
		panel.add(btnPanel);
		
		add(panel);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		pack();
	}
}

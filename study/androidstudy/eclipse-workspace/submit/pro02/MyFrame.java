package pro02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyFrame extends JFrame {
	private JPanel panel = new JPanel();
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	private JLabel lb1 = new JLabel("원금: ");
	private JLabel lb2 = new JLabel("이자: ");
	private JTextArea originalMoney = new JTextArea("0", 1, 5);
	private JTextArea interestRatio = new JTextArea("0", 1, 5); 
	private JTextArea resultArea = new JTextArea("0", 1, 5);
	private JButton btn = new JButton("결과");
	
	public MyFrame() {
		
		panel.setLayout(new BoxLayout(panel, 1));
		
		btn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				resultArea.setText(Double.toString(Integer.parseInt(originalMoney.getText())+Integer.parseInt(originalMoney.getText())*Double.parseDouble(interestRatio.getText())));
			}
		});
		
		panel1.add(lb1);
		panel1.add(originalMoney);
		panel2.add(lb2);
		panel2.add(interestRatio);
		panel3.add(btn);
		panel3.add(resultArea);
		
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		
		add(panel);
		
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		setVisible(true);
	}
}

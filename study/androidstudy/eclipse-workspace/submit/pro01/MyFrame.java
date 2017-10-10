package pro01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyFrame extends JFrame{
	private JTextArea inputArea, outputArea;
	private JLabel lb = new JLabel("마일을 입력하세요.");
	private JButton btn = new JButton("계산");
	private JPanel panel = new JPanel();
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	
	public MyFrame(){
		inputArea = new JTextArea("0", 1, 5);
		outputArea = new JTextArea("0", 1, 5);
		
		btn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				outputArea.setText(Double.toString(Double.parseDouble(inputArea.getText())*1.609)+"km");
			}
		});
		
		panel.setLayout(new BoxLayout(panel, 1));
		
		panel1.add(lb);
		panel1.add(inputArea);
		panel2.add(btn);
		panel3.add(outputArea);
		
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		
		add(panel);
		
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(true);
	}
}

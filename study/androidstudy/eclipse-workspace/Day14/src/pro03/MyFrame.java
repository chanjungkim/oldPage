package pro03;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	private JPanel panel;
	private JPanel statusPanel;
	private JPanel numPanel;
	private JTextField statusField;
	private JButton cBtn;
	private JButton[] calBtns;
	
	public MyFrame() {
		panel = new JPanel();
		statusPanel = new JPanel();
		numPanel = new JPanel();
		statusField = new JTextField("23");
		statusPanel.setLayout(new BorderLayout());
		numPanel.setLayout(new GridLayout(5, 4));
		panel.setLayout(new BoxLayout(panel, 1));
		calBtns = new JButton[20];
		
		calBtns[0] = new JButton("C");
		calBtns[1] = new JButton("C");
		calBtns[1].setVisible(false);
		calBtns[2] = new JButton("C");
		calBtns[2].setVisible(false);
		calBtns[3] = new JButton("C");
		calBtns[3].setVisible(false);
		calBtns[4] = new JButton("7");
		calBtns[5] = new JButton("8");
		calBtns[6] = new JButton("9");
		calBtns[7] = new JButton("/");
		calBtns[8] = new JButton("4");
		calBtns[9] = new JButton("5");
		calBtns[10] = new JButton("6");
		calBtns[11] = new JButton("*");
		calBtns[12] = new JButton("1");
		calBtns[13] = new JButton("2");
		calBtns[14] = new JButton("3");
		calBtns[15] = new JButton("-");
		calBtns[16] = new JButton("0");
		calBtns[17] = new JButton("+/-");
		calBtns[18] = new JButton("=");
		calBtns[19] = new JButton("+");
		
		statusPanel.add(statusField);
		for(JButton s : calBtns) {
			numPanel.add(s);
		}
		
		add(statusPanel);
		add(numPanel);

		
		setTitle("°è»ê±â");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}

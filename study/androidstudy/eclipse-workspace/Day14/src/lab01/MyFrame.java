package lab01;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	private JLabel selectLabel;
	private JButton comboPizzaBtn;
	private JButton potatoPizzaBtn;
	private JButton bulgogiPizzaBtn;
	private JPanel panel;
	private JPanel labelPanel;
	private JPanel btnPanel;
	
	public MyFrame() {
		selectLabel = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
		comboPizzaBtn = new JButton("콤보 피자");
		potatoPizzaBtn = new JButton("포테이토 피자");
		bulgogiPizzaBtn = new JButton("불고기 피자");
		panel = new JPanel();
		labelPanel = new JPanel();
		btnPanel = new JPanel();
		
		labelPanel.add(selectLabel);
		labelPanel.setBackground(Color.CYAN);
		
		btnPanel.add(comboPizzaBtn);
		btnPanel.add(potatoPizzaBtn);
		btnPanel.add(bulgogiPizzaBtn);
		btnPanel.setBackground(Color.GREEN);
		
		panel.add(labelPanel);
		panel.add(btnPanel);
		panel.setBackground(Color.BLUE);
		add(panel);

		setSize(400,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}

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
		selectLabel = new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�. ������ ������ �����Ͻÿ�.");
		comboPizzaBtn = new JButton("�޺� ����");
		potatoPizzaBtn = new JButton("�������� ����");
		bulgogiPizzaBtn = new JButton("�Ұ�� ����");
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

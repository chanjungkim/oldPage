package pro02;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	private JPanel panel;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JFrame frame;
	private JLabel label1;
	private JLabel label2;
	private JTextField moneyInputField;
	private JTextField ratioInputField;
	private JButton btn;
	private JTextField resultField;
	
	public MyFrame() {
		label1 = new JLabel("������ �Է��Ͻÿ�.");
		label2 = new JLabel("������ �Է��Ͻÿ�.");
		btn = new JButton("��ȯ");
		moneyInputField = new JTextField("1000");
		ratioInputField = new JTextField("7.5");
		resultField = new JTextField("���ڴ� �� 75�����Դϴ�.");

		panel = new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		
		panel.setLayout(new BoxLayout(panel, 1));

		panel1.add(label1);
		panel1.add(moneyInputField);
		panel2.add(label2);
		panel2.add(ratioInputField);
		panel3.add(btn);
		panel4.add(resultField);
		
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		panel.add(panel4);	
		
		add(panel);
		setTitle("���� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}

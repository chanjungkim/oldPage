package pro01;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	private JButton btn;
	private JTextField outputField;
	private JLabel lb;
	private JTextField inputField;
	private JPanel panel;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	public JFrame f;
	
	public MyFrame(){
		btn = new JButton("��ȯ");
		inputField = new JTextField("1");
		outputField = new JTextField("1������ 1.6ų�ι����Դϴ�.");
		lb = new JLabel("�Ÿ��� ���� ������ �Է��Ͻÿ�");
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel = new JPanel();
		
		panel.setLayout(new BoxLayout(panel, 1));
		
		panel1.add(lb);
		panel2.add(inputField);
		panel2.add(btn);
		panel3.add(outputField);
				
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		
		add(panel);
		setTitle("������ ų�ι��ͷ� ��ȯ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}

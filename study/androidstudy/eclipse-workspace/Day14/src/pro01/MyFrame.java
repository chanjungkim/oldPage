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
		btn = new JButton("변환");
		inputField = new JTextField("1");
		outputField = new JTextField("1마일은 1.6킬로미터입니다.");
		lb = new JLabel("거리를 마일 단위로 입력하시오");
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
		setTitle("마일을 킬로미터로 변환");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}

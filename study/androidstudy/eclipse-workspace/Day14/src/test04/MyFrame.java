package test04;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	private JPanel panel;
	private JLabel lb;
	private JTextField textField;
	
	public MyFrame() {
		panel = new JPanel();
		lb = new JLabel("핸드폰 번호를 입력하세요.");
		textField = new JTextField(15);

		textField.setText("변경 불가한 기본값");
		
		panel.add(lb);
		panel.add(textField);
		
		add(panel);
		
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame();
	}
}

package pro03;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	private JPanel panel = new JPanel();
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JLabel one = new JLabel("0");
	private JLabel two = new JLabel("0");
	private JLabel three = new JLabel("0");
	private JButton btn = new JButton("갱신");
	
	public MyFrame() {
		
		one.setFont(new Font("돋움", Font.BOLD, 100));
		two.setFont(new Font("돋움", Font.BOLD, 100));
		three.setFont(new Font("돋움", Font.BOLD, 100));

		btn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Random r = new Random();
				int newOne = r.nextInt(10);
				int newTwo = r.nextInt(10);
				int newThree = r.nextInt(10);
				
				if(newOne == 7 && newTwo == 7 && newThree == 7){
					one.setText("*");
					two.setText("*");
					three.setText("*");
					System.out.println("당첨되었습니다.");
				}else{
					one.setText(Integer.toString(newOne));
					two.setText(Integer.toString(newTwo));
					three.setText(Integer.toString(newThree));
				}
			}
		});
		
		panel.setLayout(new BoxLayout(panel, 1));
		
		panel1.add(one);
		panel1.add(two);
		panel1.add(three);
		
		panel2.add(btn);
		
		panel.add(panel1);
		panel.add(panel2);
		
		add(panel);
		
		setTitle("슬롯머신");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		setVisible(true);
	}
}

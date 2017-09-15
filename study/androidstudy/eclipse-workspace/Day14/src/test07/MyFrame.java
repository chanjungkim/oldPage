package test07;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	private JButton[] btns;
	private JPanel panelBtns;
	
	public MyFrame() {
		panelBtns = new JPanel();
		btns = new JButton[5];
		
		// JPanel�� �⺻ ��ġ�����ڰ� FlowLayout���� �Ǿ�����.
		panelBtns.setBackground(Color.YELLOW);
		
		panelBtns.setLayout(new GridLayout(0, 3));  // GridLayout�� ���� �� ���� �־����. �ƴϸ� ���� 1, ���� n
		
		for(int i = 0 ; i < btns.length ; i++) {
			btns[i] = new JButton("��ư"+i);
			panelBtns.add(btns[i]);
		}
		
		add(panelBtns);
				
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		setVisible(true);
		pack();
	}
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}

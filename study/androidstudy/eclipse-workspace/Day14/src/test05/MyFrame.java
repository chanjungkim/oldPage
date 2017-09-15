package test05;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	private JButton[] btns;
	private JPanel panelBtns;
	
	public MyFrame() {
		panelBtns = new JPanel();
		btns = new JButton[5];
		
		// JPanel은 기본 배치관리자가 FlowLayout으로 되어있음.
		panelBtns.setLayout(new FlowLayout());
		
		// JFanel(not JPanel)은 기본 배치관리자가 FlowLayout으로 되어있음.		
		setLayout(new BorderLayout());
		//setLayout(new FlowLayout());  // 색을 넣어 확인해보면 필요한 만큼을 제외하고 회색(Default)로 되어 있음.
		
		for(int i = 0 ; i < btns.length ; i++) {
			btns[i] = new JButton("버튼"+i);
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

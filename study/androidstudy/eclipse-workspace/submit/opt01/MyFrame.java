package opt01;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyFrame extends JFrame {
	private JPanel panel = new JPanel();
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JTextArea resultArea = new JTextArea("");
	private JButton[] btns = new JButton[20];
	private int spare;
	private char op;
	
	public MyFrame() {
		panel.setLayout(new BoxLayout(panel, 1));
		panel1.setLayout(new BorderLayout());
		resultArea.setEditable(false);
		panel2.setLayout(new GridLayout(5, 4));
		btns[0] = new JButton("C");
		btns[1] = new JButton("");
		btns[1].setVisible(false);
		btns[1].setEnabled(false);
		btns[2] = new JButton("");
		btns[2].setVisible(false);
		btns[2].setEnabled(false);
		btns[3] = new JButton("");
		btns[3].setVisible(false);
		btns[3].setEnabled(false);
		btns[4] = new JButton("7");
		btns[5] = new JButton("8");
		btns[6] = new JButton("9");
		btns[7] = new JButton("/");
		btns[8] = new JButton("4");
		btns[9] = new JButton("5");
		btns[10] = new JButton("6");
		btns[11] = new JButton("X");
		btns[12] = new JButton("1");
		btns[13] = new JButton("2");
		btns[14] = new JButton("3");
		btns[15] = new JButton("%");
		btns[16] = new JButton("0");
		btns[17] = new JButton("+");
		btns[18] = new JButton("-");
		btns[19] = new JButton("=");
		
		ButtonListener listener = new ButtonListener();
		btns[0].addActionListener(listener);
		btns[4].addActionListener(listener);
		btns[5].addActionListener(listener);
		btns[6].addActionListener(listener);
		btns[7].addActionListener(listener);
		btns[8].addActionListener(listener);
		btns[9].addActionListener(listener);
		btns[10].addActionListener(listener);
		btns[11].addActionListener(listener);
		btns[12].addActionListener(listener);
		btns[13].addActionListener(listener);
		btns[14].addActionListener(listener);
		btns[15].addActionListener(listener);
		btns[16].addActionListener(listener);
		btns[17].addActionListener(listener);
		btns[18].addActionListener(listener);
		btns[19].addActionListener(listener);

		panel1.add(resultArea);
		for(JButton i : btns){
			panel2.add(i);
		}
		panel.add(panel1);
		panel.add(panel2);
		
		add(panel);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(true);
		pack();
	}
	class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton selected = (JButton) e.getSource();
			char input = selected.getText().charAt(0);
			if(input == 'C'){
				resultArea.setText("");
			}else{
				switch(input){
				case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
					resultArea.setText(resultArea.getText()+input);
					break;
				case '%':
					spare = Integer.parseInt(resultArea.getText());
					resultArea.setText("");
					op = '%';
					break;
				case 'X':
					spare = Integer.parseInt(resultArea.getText());
					resultArea.setText("");
					op = 'X';
					break;
				case '/':
					spare = Integer.parseInt(resultArea.getText());
					resultArea.setText("");
					op = '/';
					break;
				case '+':
					spare = Integer.parseInt(resultArea.getText());
					resultArea.setText("");
					op = '+';
					break;
				case '-':
					spare = Integer.parseInt(resultArea.getText());
					resultArea.setText("");
					op = '-';
					break;
				case '=':
					switch(op){
					case '%':
						resultArea.setText(Integer.toString(spare%Integer.parseInt(resultArea.getText())));
						break;
					case 'X':
						resultArea.setText(Integer.toString(spare*Integer.parseInt(resultArea.getText())));
						break;
					case '/':
						resultArea.setText(Integer.toString(spare/Integer.parseInt(resultArea.getText())));
						break;
					case '+':
						resultArea.setText(Integer.toString(spare+Integer.parseInt(resultArea.getText())));
						break;
					case '-':
						resultArea.setText(Integer.toString(spare-Integer.parseInt(resultArea.getText())));
						break;
					}
				}
			}
		}
	}
}

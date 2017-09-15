package lab01;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	private JPanel panel;
	private JPanel searchPanel;
	private JPanel controlPanel;
	private JLabel lb;
	private JTextField search;
	private JTextField add;
	private JTextField remove;
	private JTextField result;
	private EnglishDic dic;
	
	public MyFrame() {
		panel = new JPanel();
		searchPanel = new JPanel();
		controlPanel = new JPanel();
		lb = new JLabel("My Dictionary");
		search = new JTextField("�˻��ϼ���.");
		add = new JTextField("(�߰�)���� �ѱ���");
		remove = new JTextField("������ ���� �ܾ �Է��ϼ���.");
		result = new JTextField("����Դϴ�.");
		dic = new EnglishDic();
		
		search.setSize(5, 1);
		result.setSize(5, 1);
		
		search.setEditable(true);
		result.setEditable(false);
		
		
		// �˻�
		search.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				search.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(search.getText().equals(""))
					search.setText("�˻��ϼ���.");
			}
		});
		search.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.VK_ENTER == e.getKeyCode()) {
						result.setText(EnglishDic.getMean(search.getText()));
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		
		// �߰�
		add.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				add.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(add.getText().equals("") | add.getText().equals("�߰��Ǿ����ϴ�."))
					add.setText("(�߰�)���� �ѱ���");
			}
		});
		add.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.VK_ENTER == e.getKeyCode()) {
					StringTokenizer st = new StringTokenizer(add.getText());
					String en = st.nextToken();
					String ko = st.nextToken();
					
					add.setText(EnglishDic.add(en, ko));
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		remove.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				remove.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(remove.getText().equals("") | remove.getText().equals("�����Ǿ����ϴ�."))
					remove.setText("������ ���ܾ �Է��ϼ���.");
			}
		});
		
		remove.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.VK_ENTER == e.getKeyCode()) {
					StringTokenizer st = new StringTokenizer(add.getText());
					String en = st.nextToken();

					remove.setText(EnglishDic.remove(en));
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		// ����
		panel.setLayout(new BoxLayout(panel, 1));
		
		searchPanel.add(search);
		searchPanel.add(result);
		
		controlPanel.add(add);
		controlPanel.add(remove);
		
		panel.add(lb);
		panel.add(searchPanel);
		panel.add(controlPanel);
		
		add(panel);
		
		setTitle("My Dictionary!");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}
}

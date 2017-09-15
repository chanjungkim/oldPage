package myMemo;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Main extends JFrame{
	private JTextArea tx;

	private JMenuBar menuBar;

	private JMenu pile = new JMenu("����");
	private JMenuItem newMake = new JMenuItem("���θ����", KeyEvent.VK_T);
	private JMenuItem open = new JMenuItem("����", KeyEvent.VK_T);
	private JMenuItem save = new JMenuItem("����", KeyEvent.VK_T);
	private JMenuItem anotherSave = new JMenuItem("�ٸ� �̸����� ����", KeyEvent.VK_T);
	private JMenuItem setPage = new JMenuItem("������ ����", KeyEvent.VK_T);
	private JMenuItem print = new JMenuItem("�μ�", KeyEvent.VK_T);
	private JMenuItem close = new JMenuItem("������", KeyEvent.VK_T);
	
	private JMenu edit = new JMenu("����");
	private JMenuItem cancel = new JMenuItem("�������", KeyEvent.VK_T);
	private JMenuItem cut = new JMenuItem("�߶󳻱�", KeyEvent.VK_T);
	private JMenuItem copy = new JMenuItem("����", KeyEvent.VK_T);
	private JMenuItem paste = new JMenuItem("�ٿ��ֱ�", KeyEvent.VK_T);
	private JMenuItem delete = new JMenuItem("����", KeyEvent.VK_T);
	private JMenuItem find = new JMenuItem("ã��", KeyEvent.VK_T);
	private JMenuItem findNext = new JMenuItem("���� ã��", KeyEvent.VK_T);
	private JMenuItem replace = new JMenuItem("�ٲٱ�", KeyEvent.VK_T);
	private JMenuItem move = new JMenuItem("�̵�", KeyEvent.VK_T);
	private JMenuItem selectAll = new JMenuItem("��� ����", KeyEvent.VK_T);
	private JMenuItem timeAndDate = new JMenuItem("�ð�/��¥", KeyEvent.VK_T);

	private JMenu form = new JMenu("����");
	private JMenuItem autoLine = new JMenuItem("�ڵ� �� �ٲ�", KeyEvent.VK_T);
	private JMenuItem font = new JMenuItem("�۲�", KeyEvent.VK_T);

	private JMenu show = new JMenu("����");
	private JMenuItem statusBar = new JMenuItem("���� ã��", KeyEvent.VK_T);

	private JMenu help = new JMenu("����");
	private JMenuItem showHelp = new JMenuItem("���� ����", KeyEvent.VK_T);
	private JMenuItem info = new JMenuItem("�޸��� ����", KeyEvent.VK_T);

	private JPanel panel;
	
	public Main() {
		
		
		tx = new JTextArea();
		menuBar = new JMenuBar();
		
		panel = new JPanel();
		
		// Function
		save.addActionListener(new ActionListener()  {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		// Layout
		pile.add(newMake);
		pile.add(open);
		pile.add(save);
		pile.add(anotherSave);
		pile.add(setPage);
		pile.add(print);
		pile.add(close);
		
		edit.add(cancel);
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(delete);
		edit.add(find);
		edit.add(findNext);
		edit.add(replace);
		edit.add(move);
		edit.add(selectAll);
		edit.add(timeAndDate);
		
		form.add(autoLine);
		form.add(font);
		
		show.add(statusBar);
		
		help.add(showHelp);
		help.add(info);
		
		menuBar.add(pile);
		menuBar.add(edit);
		menuBar.add(form);
		menuBar.add(show);
		menuBar.add(help);
		
		this.setJMenuBar(menuBar);

		panel.setLayout(new BorderLayout());
		panel.add(menuBar, "North");
		panel.add(tx, "Center");

		
		add(panel);
		
		setTitle("�޸���");
		setSize(800,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Main();
	}
}

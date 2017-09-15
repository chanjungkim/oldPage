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

	private JMenu pile = new JMenu("파일");
	private JMenuItem newMake = new JMenuItem("새로만들기", KeyEvent.VK_T);
	private JMenuItem open = new JMenuItem("열기", KeyEvent.VK_T);
	private JMenuItem save = new JMenuItem("저장", KeyEvent.VK_T);
	private JMenuItem anotherSave = new JMenuItem("다른 이름으로 저장", KeyEvent.VK_T);
	private JMenuItem setPage = new JMenuItem("페이지 설정", KeyEvent.VK_T);
	private JMenuItem print = new JMenuItem("인쇄", KeyEvent.VK_T);
	private JMenuItem close = new JMenuItem("끝내기", KeyEvent.VK_T);
	
	private JMenu edit = new JMenu("편집");
	private JMenuItem cancel = new JMenuItem("실행취소", KeyEvent.VK_T);
	private JMenuItem cut = new JMenuItem("잘라내기", KeyEvent.VK_T);
	private JMenuItem copy = new JMenuItem("복사", KeyEvent.VK_T);
	private JMenuItem paste = new JMenuItem("붙여넣기", KeyEvent.VK_T);
	private JMenuItem delete = new JMenuItem("삭제", KeyEvent.VK_T);
	private JMenuItem find = new JMenuItem("찾기", KeyEvent.VK_T);
	private JMenuItem findNext = new JMenuItem("다음 찾기", KeyEvent.VK_T);
	private JMenuItem replace = new JMenuItem("바꾸기", KeyEvent.VK_T);
	private JMenuItem move = new JMenuItem("이동", KeyEvent.VK_T);
	private JMenuItem selectAll = new JMenuItem("모두 선택", KeyEvent.VK_T);
	private JMenuItem timeAndDate = new JMenuItem("시간/날짜", KeyEvent.VK_T);

	private JMenu form = new JMenu("서식");
	private JMenuItem autoLine = new JMenuItem("자동 줄 바꿈", KeyEvent.VK_T);
	private JMenuItem font = new JMenuItem("글꼴", KeyEvent.VK_T);

	private JMenu show = new JMenu("보기");
	private JMenuItem statusBar = new JMenuItem("다음 찾기", KeyEvent.VK_T);

	private JMenu help = new JMenu("도움말");
	private JMenuItem showHelp = new JMenuItem("도움말 보기", KeyEvent.VK_T);
	private JMenuItem info = new JMenuItem("메모장 정보", KeyEvent.VK_T);

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
		
		setTitle("메모장");
		setSize(800,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Main();
	}
}

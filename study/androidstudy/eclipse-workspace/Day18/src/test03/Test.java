package test03;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> wordList = new ArrayList<>(); // ArrayList�� ���� ����� ����� ������� �ڷ����� ������ �� �ֵ��� ���ɼ��� ����ΰ� ����� �ٽ� ��ɸ� ����
		// ������ �������� ���� �������� ����
		
		System.out.println(wordList.size());
		
		wordList.add("yangyu");
		wordList.add("�ȳ��ϼ���");
		wordList.add("���");
		wordList.add(2, "�ٳ���");
		wordList.add("hungry");
		
		System.out.println(wordList.size());
			
		for(int i = 0 ; i < wordList.size(); i++) {
			System.out.println("�ƹ���: "+wordList.get(i));
		}
	}
}

package test04;

import java.util.HashSet;
import java.util.Iterator;

public class Test2 {
	public static void main(String[] args) {
		HashSet<String> words = new HashSet<>();
		
		words.add("�ܾ�");
		words.add("���");
		words.add("�ȳ�");
		words.add("�ܾ�");
		
		System.out.println(words);
		
		Iterator<String> wordIter = words.iterator();
		
		while(wordIter.hasNext()) {
			System.out.println("�ϳ��� >> "+wordIter.next());
		}
	}
}

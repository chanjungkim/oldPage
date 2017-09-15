package test04;

import java.util.HashSet;
import java.util.Iterator;

public class Test2 {
	public static void main(String[] args) {
		HashSet<String> words = new HashSet<>();
		
		words.add("단어");
		words.add("사과");
		words.add("안녕");
		words.add("단어");
		
		System.out.println(words);
		
		Iterator<String> wordIter = words.iterator();
		
		while(wordIter.hasNext()) {
			System.out.println("하나씩 >> "+wordIter.next());
		}
	}
}

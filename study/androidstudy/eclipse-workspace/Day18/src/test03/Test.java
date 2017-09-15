package test03;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> wordList = new ArrayList<>(); // ArrayList를 만든 사람은 사용할 사람들이 자료형을 선택할 수 있도록 가능성을 열어두고 공통된 핵심 기능만 설계
		// 오른쪽 안적으면 왼쪽 참조변수 따라감
		
		System.out.println(wordList.size());
		
		wordList.add("yangyu");
		wordList.add("안녕하세요");
		wordList.add("사과");
		wordList.add(2, "바나나");
		wordList.add("hungry");
		
		System.out.println(wordList.size());
			
		for(int i = 0 ; i < wordList.size(); i++) {
			System.out.println("아무말: "+wordList.get(i));
		}
	}
}

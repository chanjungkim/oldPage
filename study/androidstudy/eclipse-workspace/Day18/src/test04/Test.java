package test04;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		System.out.println(set.add("apple"));
		System.out.println(set.add("banana"));
		System.out.println(set.add("tomato"));
		System.out.println(set.add("apple"));           // �ߺ� �ȵ�.

		System.out.println(set);                        // toString ���� �Ǿ� �־ ���� �� ������.
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		
		System.out.println(set.add("apple"));
		System.out.println(set.add("banana"));
		System.out.println(set.add("tomato"));
		System.out.println(set.add("apple"));           // �ߺ� �ȵ�.
		
		System.out.println(linkedHashSet);              // toString X
		
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		Random rand = new Random();
		
		
		for(int i = 0 ; i < 0 ; i++) {
			if(numbers.add(rand.nextInt())) {
				i++;
			}
			System.out.println(numbers);
		}
	}	
}

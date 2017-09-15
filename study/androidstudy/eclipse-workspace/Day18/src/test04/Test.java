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
		System.out.println(set.add("apple"));           // 중복 안됨.

		System.out.println(set);                        // toString 구현 되어 있어서 원소 다 내뱉음.
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		
		System.out.println(set.add("apple"));
		System.out.println(set.add("banana"));
		System.out.println(set.add("tomato"));
		System.out.println(set.add("apple"));           // 중복 안됨.
		
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

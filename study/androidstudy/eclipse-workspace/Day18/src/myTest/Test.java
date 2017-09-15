package myTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		LinkedList<Integer> lList = new LinkedList<Integer>();
		
		for(int i = 0 ; i < 5 ; i++) {
			aList.add(i);
			lList.add(i);
		}
		aList.remove(2);
		lList.remove(2);
		
		System.out.println(aList.get(2));
		System.out.println(lList.get(2));		
	}
}

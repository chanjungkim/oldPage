package pro04;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
		Person[] p = new Person[5];
		
		p[0] = new Person("장동건", 172.3);
		p[1] = new Person("김찬중", 180.0);
		p[2] = new Person("김현중", 190.2);
		p[3] = new Person("이윤우", 168.5);
		p[4] = new Person("소찬호", 170.2);
		
		getMaximum(p).printPersonInfo();
	}
	public static Person getMaximum(Person[] p) {
		Arrays.sort(p);		
		return p[p.length-1];
	}
}

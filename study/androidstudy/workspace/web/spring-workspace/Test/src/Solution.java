import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		long min = sc.nextLong();
		long max = sc.nextLong();
		
		sc.nextLine();
		
		HashSet<Long> list = new HashSet<>();
		
		for(long i = 2 ; i <= Math.sqrt(max) ; i++) {
			list.add((long)Math.pow(i, 2));
		}
//		for(long l : list) {
//			System.out.println(l);
//		}
		long res = max - min + 1 - list.size();

		if(min < 2) {
			res--;
		}	
		
		System.out.println(res);
	}
}

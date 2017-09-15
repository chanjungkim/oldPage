package my;

import java.io.IOException;
import java.util.Scanner;

public class Main01 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int a = (int) sc.next().charAt(0);
		int s = System.in.read();
		
		System.out.println(a);
		System.out.println(s);
		
		sc.close();
	}
}

package my;

import java.util.Scanner;

public class Pro04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] hexa2bin =	{
				"0000", "0001", "0010", "0011",
			  "0100", "0101", "0110", "0111",
			  "1000", "1001", "1010", "1011",
			  "1100", "1101", "1110", "1111"};
		
		System.out.print("16진수 문자열을 입력하시오: ");
		String str = sc.next();
		System.out.println("\""+str+"\"에 대한 이진수는 ");
		int len = str.length()-1;
		
		for(int i = 0, a = 0 ; i < len+1; i++) {
			a = str.charAt(i);
			if( a < 58) {
				System.out.print(hexa2bin[a-48]+" ");
			}else {
				System.out.print(hexa2bin[a-87]+" ");
			}
		}
		System.out.println("입니다.");
		
		sc.close();
	}
}

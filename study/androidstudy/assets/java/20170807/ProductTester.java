package pro01;

import java.util.Scanner;

public class ProductTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int len = str.length()-1;
		int temp = len;
		while( temp >= 0 ) {
			if(len > 5) {
				System.out.println("잘못된 물품 번호: 이름이 너무 깁니다.");
				break;
			}else if(len < 5) {
				System.out.println("잘못된 물품 번호: 이름이 너무 짧습니다.");
				break;
			}
			
			if( len < 2 ) {
				if( (int)str.charAt(temp) < 65 || ((int)str.charAt(temp) > 90 && (int)str.charAt(temp) < 96) || (int)str.charAt(temp) > 122) {
					System.out.println("잘못된 물품 번호: 틀린 알파벳");
					break;
				}
			} else if( len > 2 ) {
				if( (int)str.charAt(temp) < 48 && (int)str.charAt(temp) > 57) {
					System.out.println("잘못된 물품 번호: 틀린 번호");
					break;
				}
			}
			temp--;
		}
		
		System.out.println("정상입니다.");
		sc.close();
	}
}
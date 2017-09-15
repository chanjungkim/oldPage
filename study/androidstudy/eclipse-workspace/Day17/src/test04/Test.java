package test04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("나눗셈 프로그램을 진행합니다.");
		
		try {
			System.out.print("숫자1 입력 >> ");
			n1 = sc.nextInt();
			System.out.print("숫자2 입력 >> ");
			n2 = sc.nextInt();
			
			System.out.println("몫: "+ (n1/n2));
			System.out.println("나머지: "+ (n1%n2));
		} catch (ArithmeticException e) {
			System.out.println("두번째 숫자는 0 안돼!!");
		} finally{
			System.out.println("프로그램을 종료합니다.");  // 자원 반납. 무조건 실행됨.
		}
		
//		try {
//			System.out.print("숫자1 입력 >> ");
//			n1 = sc.nextInt();
//			System.out.print("숫자2 입력 >> ");
//			n2 = sc.nextInt();
//			
//			System.out.println("몫: "+ (n1/n2));
//			System.out.println("나머지: "+ (n1%n2));
//		} catch (ArithmeticException e) {
//			System.out.println("두번째 숫자는 0 안돼!!");
//		} 
//
//		System.out.println("프로그램을 종료합니다.");   // 예외 발생시 실행 안되고 종료됨.

	}
}

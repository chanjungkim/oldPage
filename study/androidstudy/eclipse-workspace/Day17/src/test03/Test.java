package test03;

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
		} catch (InputMismatchException e) {
			System.out.println("숫자.. 숫자를 입력하라고 숫자!!!");
		} catch (Exception e) {
			System.out.println("예상하진 못했지만 예외가 발생했네요..");
			System.out.println("관리자 연락처: ssungujin@naver.com");
		}
		
		/*
			catch (Exception e) {
				System.out.println("예상하진 못했지만 예외가 발생했네요..");
				System.out.println("관리자 연락처: ssungujin@naver.com");
			}catch (ArithmeticException e) {
				System.out.println("두번째 숫자는 0 안돼!!");
			} catch (InputMismatchException e) {
				System.out.println("숫자.. 숫자를 입력하라고 숫자!!!");
			} catch (Exception e) {
				System.out.println("예상하진 못했지만 예외가 발생했네요..");
				System.out.println("관리자 연락처: ssungujin@naver.com");
			}
			
			부모 먼저 나오면 밑에 에러뜸 unreachable
		*/
		System.out.println("프로그램을 종료합니다.");
	}
}

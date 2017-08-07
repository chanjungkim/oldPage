import java.util.Scanner;

public class Pro02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2의 배수 3의 배수 5의배수 판별기예염. 숫자를 입력해봐염: ");
		int a = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println(a + "은 "+2+"의 배수예염.");
		} else if (a % 3 == 0) {
			System.out.println(a + "은 "+3+"의 배수예염.");			
		} else if ( a % 5 == 0) {
			System.out.println(a + "은 "+5+"의 배수예염.");			
		}
		
		sc.close();
	}
}

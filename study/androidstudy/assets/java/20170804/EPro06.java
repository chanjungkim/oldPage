import java.util.Scanner;

public class EPro06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("다섯 개의 정수를 입력하시오: ");
		int sum = 0;
		int a = 0;
		
		for(int i = 0 ; i < 5 ; i++) {
			do {
				System.out.println(i+1+"번 째 숫자를 입력하시오.");
				a = sc.nextInt();
				if( a < 1) {
					System.out.println("입력값이 0이하입니다.");
				}
			}while( a < 1);
			
			sum+=a;
		}
		
		System.out.println("합: "+sum);
		
		sc.close();
	}
}

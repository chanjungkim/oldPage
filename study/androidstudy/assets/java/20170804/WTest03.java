import java.util.Scanner;

public class WTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 99999;
		int a1, a2, a3, a4=0;
		do {
			System.out.print("10000보다 작은 정수를 입력하시오:");
			a = sc.nextInt();
			
			a4 = a % 10;
			a -= a4;
			a3 = a % 100;
			a -= a3;
			a2 = a % 1000;
			a -= a2;
			a1 = a % 10000;
	
		}while( a >= 10000);
		
		System.out.println("천의 자리: "+a1/1000);
		System.out.println("백의 자리: "+a2/100);
		System.out.println("십의 자리: "+a3/10);
		System.out.println("일의 자리: "+a4);
		
		sc.close();
	}
}

import java.util.Scanner;

public class WTest10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("피보나치 수열 구하기 - 몇 까지?: ");
		long a = sc.nextInt();
		long a1 = 0, a2 = 1, t = 0;
		if ( a < 3)
			System.out.println(a-1);
		else { 
			while(a > 0) {
				System.out.println(a1);
				t = a1+a2;
				a1 = a2;
				a2 = t;
				a--;
			}
		}
		
		sc.close();
	}
}

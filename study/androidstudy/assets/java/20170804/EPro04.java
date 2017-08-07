import java.util.Scanner;

public class EPro04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		System.out.println();
		int n = sc.nextInt();
		int s;
		System.out.println("역순 결과: ");
		while( n > 0) {
			s=n%10;
			n/=10;
			
			System.out.print(s);
		}
		
		sc.close();
	}
}

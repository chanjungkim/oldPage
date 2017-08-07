import java.util.Scanner;

public class EPro10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		int t=0;
		int sum = 0;
		while( num > 0 ) {
			t=num%10;
			num/=10;
			sum+=t;
		}
		
		System.out.println("각 자릿수 합: "+sum);
		
		sc.close();
	}
}

import java.util.Scanner;

public class Pro04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 수를 입력하세염.: ");
		int b = sc.nextInt();
		int a = sc.nextInt();

		int v = 0;
		int r = 0;
		
		if( a == 0) {
			System.out.println("나눌 슈 없어염.");
		} else {
			v = b / a;
			r = b % a;
			
			System.out.println("몫은 " + v + "나머지는 " + r+"이에염.");
		}

		
		sc.close();
	}
}

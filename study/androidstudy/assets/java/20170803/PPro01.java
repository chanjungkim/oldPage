import java.util.Scanner;

public class PPro01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int a = sc.nextInt();
		System.out.print("정수를 입력하시오: ");
		int b = sc.nextInt();
		System.out.print("정수를 입력하시오: ");
		int c = sc.nextInt();
		int t=0;
		System.out.print("정렬된 숫자: ");
		
		if(a < b) {
			t = b;
			b = a;
			a = t;
		}else {
			if(b < c) {
				t = b;
				b = a;
				a = t;
			}
		}
						
		System.out.println(a+" "+b+" "+c);
		
		sc.close();
	}
}

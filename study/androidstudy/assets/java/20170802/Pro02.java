import java.util.Scanner;

public class Pro02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오.:");
		int a = sc.nextInt();

		System.out.print("정수를 입력하시오.:");
		int b = sc.nextInt();
		
		int m = a/b;
		int r = a%b;
		
		System.out.println(a+"을 "+b+"로 나눈 몫은 "+m+"이고 나머지는 "+r+"입니다.");
				
		sc.close();
	}
}
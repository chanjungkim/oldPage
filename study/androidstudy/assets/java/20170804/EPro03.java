import java.util.Scanner;

public class EPro03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		int count = 0;

		while( n > 0) {
			count++;
			n/=10;
		}
		System.out.println("입력하신 정수는 "+count+"자리 수입니다.");
		
		sc.close();
	}
}

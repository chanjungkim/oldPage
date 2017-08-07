import java.util.Scanner;

public class WTest07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		if(a < 0) {
			System.out.println("ERROR!!!");
		}
		else{
			System.out.println("3의 배수 찾기 시작");
			for(int i = 1 ; i <= a ; i++) {
				if( i % 3 == 0 ) {
					System.out.println(i);
				}
			}
			System.out.println("끝");
		}
		
		sc.close();
	}
}

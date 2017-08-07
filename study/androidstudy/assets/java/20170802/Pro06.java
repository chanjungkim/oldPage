import java.util.Scanner;

public class Pro06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 100원 50원 10원의 갯수를 순서대로 입력하시오.: ");
		int m500 = sc.nextInt()*500;
		int m100 = sc.nextInt()*100;
		int m50 = sc.nextInt()*50;
		int m10 = sc.nextInt()*10;

		int total = m500+m100+m50+m10;
			
		System.out.println("총 금액은 "+total+"입니다.");
		sc.close();
	}
}
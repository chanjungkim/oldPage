import java.util.Scanner;

public class PPro03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력하시오: ");
		double h = sc.nextDouble();

		System.out.print("몸무게를 입력하시오: ");
		double w = sc.nextDouble();
		
		double st = (h - 100) * 0.9;
		
		if( w > st )
			System.out.println("과체중입니다.");
		else if ( w == st)
			System.out.println("표준체중입니다.");
		else {
			System.out.println("저체중입니다.");
		}
		
		sc.close();
	}
}

import java.util.Scanner;

public class Pro09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사용자로부터 물체에 주어진 힘을 입력하시오.:");
		double power = sc.nextDouble();
		
		System.out.println("물체의 면접을 입력하시오.: ");
		double area = sc.nextDouble();
		
		double strengthOfPressure = power/area;
		
		System.out.println("압력의 세기는 "+strengthOfPressure+"입니다.");
		sc.close();
	}
}
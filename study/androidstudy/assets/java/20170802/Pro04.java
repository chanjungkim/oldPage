import java.util.Scanner;

public class Pro04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원기둥 밑면의 반지름을 입력하시오.: ");
		double r = sc.nextDouble();
		System.out.print("원기둥 높이를 입력하시오.: ");
		double h = sc.nextDouble();
		double volume = 3.14*Math.pow(r, 2)*h;
		
		System.out.println("원기둥의 부피는 "+volume+"입니다.");
				
		sc.close();
	}
}
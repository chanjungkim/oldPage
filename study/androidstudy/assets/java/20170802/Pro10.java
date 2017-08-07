import java.util.Scanner;

public class Pro10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("AC의 길이를 입력하시오.:");
		double ac = sc.nextDouble();
		
		System.out.print("AE의 길이를 입력하시오.:");
		double ae = sc.nextDouble();
		
		System.out.print("BC의 길이를 입력하시오.:");
		double bc = sc.nextDouble();
		
		double de = (ae*bc)/ac;
		
		System.out.println("DE의 길이는 "+de+"입니다.");
		sc.close();
	}
}
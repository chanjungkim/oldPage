import java.util.Scanner;

public class WTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("세 개의 정수를 입력하시오: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("평균: "+((a+b+c)/(double)3));
		
		sc.close();
	}
}

import java.util.Scanner;

public class Pro10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("AC�� ���̸� �Է��Ͻÿ�.:");
		double ac = sc.nextDouble();
		
		System.out.print("AE�� ���̸� �Է��Ͻÿ�.:");
		double ae = sc.nextDouble();
		
		System.out.print("BC�� ���̸� �Է��Ͻÿ�.:");
		double bc = sc.nextDouble();
		
		double de = (ae*bc)/ac;
		
		System.out.println("DE�� ���̴� "+de+"�Դϴ�.");
		sc.close();
	}
}
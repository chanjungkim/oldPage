import java.util.Scanner;

public class Pro09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����ڷκ��� ��ü�� �־��� ���� �Է��Ͻÿ�.:");
		double power = sc.nextDouble();
		
		System.out.println("��ü�� ������ �Է��Ͻÿ�.: ");
		double area = sc.nextDouble();
		
		double strengthOfPressure = power/area;
		
		System.out.println("�з��� ����� "+strengthOfPressure+"�Դϴ�.");
		sc.close();
	}
}
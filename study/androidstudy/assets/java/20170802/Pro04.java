import java.util.Scanner;

public class Pro04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �ظ��� �������� �Է��Ͻÿ�.: ");
		double r = sc.nextDouble();
		System.out.print("����� ���̸� �Է��Ͻÿ�.: ");
		double h = sc.nextDouble();
		double volume = 3.14*Math.pow(r, 2)*h;
		
		System.out.println("������� ���Ǵ� "+volume+"�Դϴ�.");
				
		sc.close();
	}
}
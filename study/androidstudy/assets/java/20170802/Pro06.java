import java.util.Scanner;

public class Pro06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500�� 100�� 50�� 10���� ������ ������� �Է��Ͻÿ�.: ");
		int m500 = sc.nextInt()*500;
		int m100 = sc.nextInt()*100;
		int m50 = sc.nextInt()*50;
		int m10 = sc.nextInt()*10;

		int total = m500+m100+m50+m10;
			
		System.out.println("�� �ݾ��� "+total+"�Դϴ�.");
		sc.close();
	}
}
import java.util.Scanner;

public class Pro04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� �Է��ϼ���.: ");
		int b = sc.nextInt();
		int a = sc.nextInt();

		int v = 0;
		int r = 0;
		
		if( a == 0) {
			System.out.println("���� �� ���.");
		} else {
			v = b / a;
			r = b % a;
			
			System.out.println("���� " + v + "�������� " + r+"�̿���.");
		}

		
		sc.close();
	}
}

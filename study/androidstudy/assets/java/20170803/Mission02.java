import java.util.Scanner;

public class Mission02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���(0~100): ");
		int score = sc.nextInt();
		int a = 0;
		char d;
		a = score/10;

		switch(a) {
		case 9 :
			d = 'A';
			break;
		case 8 :
			d = 'B';
			break;
		case 7 :
			d = 'C';
			break;
		case 6 :
			d = 'D';
			break;
		case 5 :
			d = 'E';
			break;
		default :
			d = 'F';
			break;
		}
		// �ڹٿ����� case 90 ... 100 �� ���� ���� �Ұ���
		
		System.out.println("����� ������ "+d+"�Դϴ�.");
		sc.close();
	}
}

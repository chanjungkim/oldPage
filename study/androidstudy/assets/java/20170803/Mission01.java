import java.util.Scanner;

public class Mission01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� ù ���� ��������: ");
		int a = sc.nextInt();

		System.out.print("��� �ұ?(1:���� 2:���� 3:���� 4:������ 5:������): ");
		int x = sc.nextInt();
		
		System.out.print("����� �� �� ° ���� ��������: ");
		int b = sc.nextInt();
		
		switch(x) {
		case 1:
			x = a+b;
			break;
		case 2:
			x = a-b;
			break;
		case 3:
			x = a*b;
			break;
		case 4:
			if( b == 0) {
				x=-1;
				System.out.println("0���� ���� �� ���µ���;;;");
				break;
			}
			x = a/b;
			break;
		case 5:
			x = a%b;
			break;
		default:
			System.out.println("�߸��� �Է�... ���α׷� ����...");
			break;
		}
		
		System.out.println("�����: "+x);
		
		sc.close();
	}
}

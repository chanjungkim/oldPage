import java.util.Scanner;

public class EPro03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int n = sc.nextInt();
		int count = 0;

		while( n > 0) {
			count++;
			n/=10;
		}
		System.out.println("�Է��Ͻ� ������ "+count+"�ڸ� ���Դϴ�.");
		
		sc.close();
	}
}

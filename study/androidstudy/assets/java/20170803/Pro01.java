import java.util.Scanner;

public class Pro01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		int a = 0 ; int b = 0;
		
		do {
			int i = 0;
			System.out.print("�ȳ��ϼ���. ���� ���⿹��. ù ���ڸ� �Է��ϼ���.: ");
			a = sc.nextInt();
			int t = 0;
			
			System.out.print("���ϴ� ����� �غ��ƿ�.(1:����, 2:����, 3:����, 4:������, 5:������): ");
			i = sc.nextInt();

			System.out.print("�� �� ° ���ڸ� �Է��ϼ���.: ");
			b = sc.nextInt();
			
			if( i == 1) {
				t = a + b;
			} else if ( i == 2 ){
				t = a - b;
			} else if ( i == 3) {
				t = a * b;
			} else if ( i == 4) {
				t = a / b;
			} else {
				t = a % b;
			}
			
			System.out.print("������� "+t+"��. ���� �ҷ���?(1:�� 2:�ƴϿ�): ");
			if( sc.nextInt() != 2) {
				System.out.println("������~");
			}
		}
		while( flag );
		
		sc.close();
	}
}
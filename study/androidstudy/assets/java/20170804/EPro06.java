import java.util.Scanner;

public class EPro06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ټ� ���� ������ �Է��Ͻÿ�: ");
		int sum = 0;
		int a = 0;
		
		for(int i = 0 ; i < 5 ; i++) {
			do {
				System.out.println(i+1+"�� ° ���ڸ� �Է��Ͻÿ�.");
				a = sc.nextInt();
				if( a < 1) {
					System.out.println("�Է°��� 0�����Դϴ�.");
				}
			}while( a < 1);
			
			sum+=a;
		}
		
		System.out.println("��: "+sum);
		
		sc.close();
	}
}

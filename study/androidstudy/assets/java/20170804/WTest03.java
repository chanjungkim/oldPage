import java.util.Scanner;

public class WTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 99999;
		int a1, a2, a3, a4=0;
		do {
			System.out.print("10000���� ���� ������ �Է��Ͻÿ�:");
			a = sc.nextInt();
			
			a4 = a % 10;
			a -= a4;
			a3 = a % 100;
			a -= a3;
			a2 = a % 1000;
			a -= a2;
			a1 = a % 10000;
	
		}while( a >= 10000);
		
		System.out.println("õ�� �ڸ�: "+a1/1000);
		System.out.println("���� �ڸ�: "+a2/100);
		System.out.println("���� �ڸ�: "+a3/10);
		System.out.println("���� �ڸ�: "+a4);
		
		sc.close();
	}
}

import java.util.Scanner;

public class EPro10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
		int t=0;
		int sum = 0;
		while( num > 0 ) {
			t=num%10;
			num/=10;
			sum+=t;
		}
		
		System.out.println("�� �ڸ��� ��: "+sum);
		
		sc.close();
	}
}

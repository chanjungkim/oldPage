import java.util.Scanner;

public class EPro04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է�: ");
		System.out.println();
		int n = sc.nextInt();
		int s;
		System.out.println("���� ���: ");
		while( n > 0) {
			s=n%10;
			n/=10;
			
			System.out.print(s);
		}
		
		sc.close();
	}
}

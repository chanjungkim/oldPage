import java.util.Scanner;

public class Pro02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�.:");
		int a = sc.nextInt();

		System.out.print("������ �Է��Ͻÿ�.:");
		int b = sc.nextInt();
		
		int m = a/b;
		int r = a%b;
		
		System.out.println(a+"�� "+b+"�� ���� ���� "+m+"�̰� �������� "+r+"�Դϴ�.");
				
		sc.close();
	}
}
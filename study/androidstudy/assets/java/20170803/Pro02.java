import java.util.Scanner;

public class Pro02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2�� ��� 3�� ��� 5�ǹ�� �Ǻ��⿹��. ���ڸ� �Է��غ���: ");
		int a = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println(a + "�� "+2+"�� �������.");
		} else if (a % 3 == 0) {
			System.out.println(a + "�� "+3+"�� �������.");			
		} else if ( a % 5 == 0) {
			System.out.println(a + "�� "+5+"�� �������.");			
		}
		
		sc.close();
	}
}

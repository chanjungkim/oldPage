import java.util.Scanner;

public class WTest04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� ������?: ");
		String name = sc.next();
		System.out.print("���̴� �� ���̿���?: ");
		int age = sc.nextInt();
		
		System.out.println("����� �̸��� "+name+"�̰� ���̴� "+age+"���̱���.");
		sc.close();
	}
}

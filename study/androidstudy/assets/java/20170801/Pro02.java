import java.util.Scanner;

public class Pro02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ��: ");
		int r = sc.nextInt();
		System.out.print("");
		
		System.out.print("��ǰ�� �Ѿ�: ");
		int p = sc.nextInt();
	
		System.out.print("�ΰ���: ");
		int tax = p/10;
		System.out.println(tax);
		
		System.out.print("�ܵ�: ");
		int total = r-p;
		System.out.println(total);
		
		sc.close();
	}
}

import java.util.Scanner;

public class Pro05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ���� �ʺ� ���� ������ �Է��Ͻÿ�: ");
		int l = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		double volume = l*w*h;
		
		String say = (l >= 100 | w >= 100 | h >= 100)? "�ʹ� Ŀ��.":("������ ü���� "+volume+"�Դϴ�.");
		
		System.out.println(say);
		sc.close();
	}
}
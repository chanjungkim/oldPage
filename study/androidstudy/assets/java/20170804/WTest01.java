import java.util.Scanner;

public class WTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� ������ �Է��Ͻÿ�: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("���: "+((a+b+c)/(double)3));
		
		sc.close();
	}
}

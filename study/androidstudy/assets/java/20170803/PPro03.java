import java.util.Scanner;

public class PPro03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű�� �Է��Ͻÿ�: ");
		double h = sc.nextDouble();

		System.out.print("�����Ը� �Է��Ͻÿ�: ");
		double w = sc.nextDouble();
		
		double st = (h - 100) * 0.9;
		
		if( w > st )
			System.out.println("��ü���Դϴ�.");
		else if ( w == st)
			System.out.println("ǥ��ü���Դϴ�.");
		else {
			System.out.println("��ü���Դϴ�.");
		}
		
		sc.close();
	}
}

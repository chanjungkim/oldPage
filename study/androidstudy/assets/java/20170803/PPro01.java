import java.util.Scanner;

public class PPro01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		int a = sc.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		int b = sc.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		int c = sc.nextInt();
		int t=0;
		System.out.print("���ĵ� ����: ");
		
		if(a < b) {
			t = b;
			b = a;
			a = t;
		}else {
			if(b < c) {
				t = b;
				b = a;
				a = t;
			}
		}
						
		System.out.println(a+" "+b+" "+c);
		
		sc.close();
	}
}

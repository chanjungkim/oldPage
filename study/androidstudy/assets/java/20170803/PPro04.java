import java.util.Scanner;

public class PPro04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� ������ �Է��ϼ���: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int min = 0;
		
		if(a < b) {
			if ( a < c) min = a;
		}else if(c < b){
			min = c;
		}else {
			min = b;
		}
		
		System.out.println("���� ���� ���� "+min+"�Դϴ�.");
		
		sc.close();
	}
}

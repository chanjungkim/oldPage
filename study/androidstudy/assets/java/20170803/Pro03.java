import java.util.Scanner;

public class Pro03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String l = sc.next();

		if( (int)l.charAt(0) > 96) {
			System.out.println("�ҹ��ڿ���.");
		} else {
			System.out.println("�빮�ڿ���");
		}
		
		sc.close();
	}
}

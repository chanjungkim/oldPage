import java.util.Scanner;

public class PPro02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char c = sc.next().charAt(0);
		
		switch(c){
		case 'a':	case 'e': case 'i': case 'o': case 'u':
			System.out.println("�����Դϴ�.");
			break;
		default:
			System.out.println("�����Դϴ�.");
			break;
		}
		
		sc.close();
	}
}

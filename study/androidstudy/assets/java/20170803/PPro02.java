import java.util.Scanner;

public class PPro02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char c = sc.next().charAt(0);
		
		switch(c){
		case 'a':	case 'e': case 'i': case 'o': case 'u':
			System.out.println("모음입니다.");
			break;
		default:
			System.out.println("자음입니다.");
			break;
		}
		
		sc.close();
	}
}

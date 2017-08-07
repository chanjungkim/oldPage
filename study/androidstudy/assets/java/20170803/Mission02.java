import java.util.Scanner;

public class Mission02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세욥(0~100): ");
		int score = sc.nextInt();
		int a = 0;
		char d;
		a = score/10;

		switch(a) {
		case 9 :
			d = 'A';
			break;
		case 8 :
			d = 'B';
			break;
		case 7 :
			d = 'C';
			break;
		case 6 :
			d = 'D';
			break;
		case 5 :
			d = 'E';
			break;
		default :
			d = 'F';
			break;
		}
		// 자바에서는 case 90 ... 100 과 같은 연산 불가능
		
		System.out.println("당신의 학점은 "+d+"입니다.");
		sc.close();
	}
}

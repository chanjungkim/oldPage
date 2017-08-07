import java.util.Scanner;

public class Mission01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계산할 첫 값을 넣으세욤: ");
		int a = sc.nextInt();

		System.out.print("어떻게 할까염?(1:덧셈 2:뺄셈 3:곱셈 4:나눗셈 5:나머지): ");
		int x = sc.nextInt();
		
		System.out.print("계산할 두 번 째 값을 넣으세욤: ");
		int b = sc.nextInt();
		
		switch(x) {
		case 1:
			x = a+b;
			break;
		case 2:
			x = a-b;
			break;
		case 3:
			x = a*b;
			break;
		case 4:
			if( b == 0) {
				x=-1;
				System.out.println("0으로 나눌 수 없는데욤;;;");
				break;
			}
			x = a/b;
			break;
		case 5:
			x = a%b;
			break;
		default:
			System.out.println("잘못된 입력... 프로그램 종료...");
			break;
		}
		
		System.out.println("결과값: "+x);
		
		sc.close();
	}
}

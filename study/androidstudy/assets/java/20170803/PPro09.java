import java.util.Scanner;

public class PPro09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("하나의 문자를 입력하시오.(+ - * /): ");
		char c = sc.next().charAt(0);
		System.out.print("두 개의 숫자를 입력하시오.:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res = 0;
		switch(c) {
		case '+':
			res = a + b;
			break;
		case '-':
			res = a - b;
			break;
		case '*':
			res = a * b;
			break;
		case '/':
			if(b == 0) break;
			res = a / b;
			break;
		default:
			res=-1;
			break;
		}
		
		System.out.println(res);
		sc.close();
	}
}

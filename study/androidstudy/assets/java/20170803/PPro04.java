import java.util.Scanner;

public class PPro04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("세 개의 정수를 입력하세욤: ");
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
		
		System.out.println("가장 작은 값은 "+min+"입니다.");
		
		sc.close();
	}
}

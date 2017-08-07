import java.util.Scanner;

public class Pro02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int start = 0;
		boolean flag = true;
		
		do {
			if(start != 0) {
				System.out.println("계속하시겠습니까?(Y/N)");
				String c = sc.next();
				if( c.equalsIgnoreCase("y")) {
					start = 0;
					continue;
				} else if( c.equalsIgnoreCase("n")){
					break;
				}
			}
			
			System.out.println("원의 반지름을 입력하시오.: ");
			double r = sc.nextInt();
			r = Math.PI * Math.pow(r, 2);	
			
			System.out.println("원의 반지름은 "+r+"입니다.");
			
			start = 1;
		}while(flag);
		
		System.out.println("계산을 종료합니다.");
		
		sc.close();
	}
}

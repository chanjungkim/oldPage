import java.util.Scanner;

public class EPro05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int sum = 0;
		while(a!=0){
			System.out.print("더할 수를 입력하시오: ");
			a = sc.nextInt();
			if( a < 0) {
				continue;
			}
			sum+=a;
			
			System.out.println("총 합: "+sum);
		}
		
		System.out.println("종료합니다.");
		sc.close();
	}
}

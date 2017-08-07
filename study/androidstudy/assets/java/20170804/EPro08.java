import java.util.Scanner;

public class EPro08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("한 정수를 입력하시오: ");
		int a = sc.nextInt();
		
		for(int i = a ; i <= a+10 ; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		sc.close();
		
	}
}

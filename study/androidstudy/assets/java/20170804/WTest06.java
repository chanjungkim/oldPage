import java.util.Scanner;

public class WTest06 {
	public static void main(String[] args) {
		final int PRODUCT = 100;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 개 구입할 거예요?: ");
		int num = sc.nextInt();
		int price = 0;
		
		if(num >= 10) {
			price = num*(PRODUCT-PRODUCT/10);
		}else {
			price = num*PRODUCT;
		}
		
		System.out.println("가격은 "+price+"입니다.");
		
		sc.close();
	}
}

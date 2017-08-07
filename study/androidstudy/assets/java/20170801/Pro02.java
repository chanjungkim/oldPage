import java.util.Scanner;

public class Pro02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("¹ÞÀº µ·: ");
		int r = sc.nextInt();
		System.out.print("");
		
		System.out.print("»óÇ°ÀÇ ÃÑ¾×: ");
		int p = sc.nextInt();
	
		System.out.print("ºÎ°¡¼¼: ");
		int tax = p/10;
		System.out.println(tax);
		
		System.out.print("ÀÜµ·: ");
		int total = r-p;
		System.out.println(total);
		
		sc.close();
	}
}

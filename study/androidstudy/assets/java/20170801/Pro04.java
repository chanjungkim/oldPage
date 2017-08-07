import java.util.*;

public class Pro04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("È­¾¾¸¦ ÀÔ·ÂÇÏ½Ã¿À: ");
		double f = sc.nextDouble();
		
		double res = toC(f);
		
		System.out.println("¼·¾¾ ¿Âµµ´Â: "+res);

		sc.close();
	}
	public static double toC(double f) {
		double c = (double) 5/9*(f-32); 
		
		return c;
	}
}

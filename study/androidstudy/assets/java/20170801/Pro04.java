import java.util.*;

public class Pro04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ȭ���� �Է��Ͻÿ�: ");
		double f = sc.nextDouble();
		
		double res = toC(f);
		
		System.out.println("���� �µ���: "+res);

		sc.close();
	}
	public static double toC(double f) {
		double c = (double) 5/9*(f-32); 
		
		return c;
	}
}

import java.util.*;

public class Pro03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구의 반지름을 입력하시오: ");
		double r = sc.nextDouble();
		double v = (4/3)*Math.pow(r, 3);
		
		System.out.println(v);
		
		sc.close();
				
	}
}

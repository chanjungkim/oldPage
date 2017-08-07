import java.util.*;

public class Pro01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("마일을 입력하시오.: ");
		int m = sc.nextInt();
		double sum;
		sum = m * 1.609;
		
		System.out.println(m+"마일은 "+sum+"킬로미터입니다.");
		sc.close();
	}
}

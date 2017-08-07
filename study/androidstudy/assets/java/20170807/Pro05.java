import java.util.Scanner;

public class Pro05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int len = str.length()-1;
		
		while(len >= 0) {
			System.out.print(str.charAt(len));
			len--;
		}
		
		System.out.println();
		
		sc.close();
	}
}

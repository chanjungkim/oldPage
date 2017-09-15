import java.util.Scanner;

public class Pro04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int count = 1;
		int len = str.length();
		
		while(len > 0) {
			if(str.charAt(len-1) == ' ') {
				count++;
			}
			
			len--;
		}
	
		System.out.println(count);
		sc.close();
	}
}

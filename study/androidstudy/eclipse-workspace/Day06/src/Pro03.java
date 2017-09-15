import java.util.Scanner;

public class Pro03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int len = str.length()-1;
		int charCount = 0;
		int numCount = 0;
		int spaceCount = 0;
		while(len > 0) {
			if( (int)str.charAt(len) > 64 || ((int)str.charAt(len) < 91 && (int)str.charAt(len) > 95) || (int)str.charAt(len) < 123)
					charCount++;
			if( (int)str.charAt(len) > 47 && (int)str.charAt(len) < 58)
					numCount++;
			if( str.charAt(len) == ' ')
				spaceCount++;
			len--;
		}
		System.out.println("¹®ÀÚ °¹¼ö: "+charCount+" ¼ýÀÚ °¹¼ö: "+numCount+" °ø¹é °¹¼ö: " +spaceCount);
		sc.close();
	}
}
import java.util.Scanner;

public class Pro06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int len = str.length()-1;
		int temp = len+1;
		int count = 0;
		while(len >= 0) {
			char a = str.charAt(len);
			switch(a) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				count++;
				break;
			}
			len--;
		}
		
		System.out.println("������ ������ "+(temp-count)+" ������ ������ "+count+"�Դϴ�.");
		
		sc.close();
	}
}

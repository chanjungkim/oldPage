import java.util.Scanner;

public class Pro05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상자의 길이 너비 높이 순으로 입력하시오: ");
		int l = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		double volume = l*w*h;
		
		String say = (l >= 100 | w >= 100 | h >= 100)? "너무 커요.":("상자의 체적은 "+volume+"입니다.");
		
		System.out.println(say);
		sc.close();
	}
}
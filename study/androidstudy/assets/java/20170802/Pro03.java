import java.util.Scanner;

public class Pro03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű�� �Է��Ͻÿ�.:");
		double h = sc.nextDouble();
		int feet = (int)h/(12*(int)2.54);
		double inch = h/(2.54);
		
		System.out.println(h+"cm�� "+feet+"��Ʈ  "+inch+"��ġ�Դϴ�.");
				
		sc.close();
	}
}
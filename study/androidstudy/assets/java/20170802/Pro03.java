import java.util.Scanner;

public class Pro03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력하시오.:");
		double h = sc.nextDouble();
		int feet = (int)h/(12*(int)2.54);
		double inch = h/(2.54);
		
		System.out.println(h+"cm는 "+feet+"피트  "+inch+"인치입니다.");
				
		sc.close();
	}
}
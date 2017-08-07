import java.util.Scanner;

public class WTest04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름이 뭐예요?: ");
		String name = sc.next();
		System.out.print("나이는 몇 살이에요?: ");
		int age = sc.nextInt();
		
		System.out.println("당신의 이름은 "+name+"이고 나이는 "+age+"살이군요.");
		sc.close();
	}
}

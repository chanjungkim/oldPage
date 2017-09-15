import java.util.Scanner;

public class Pro07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		do {
			System.out.print("사용할 ID: ");
			String id = sc.next();
			System.out.print("해당 ID의 PW: ");
			String pw = sc.next();

			System.out.print("로그인 ID: ");
			String idToCheck = sc.next();
			System.out.print("로그인 ID의 PW: ");
			String pwToCheck = sc.next();
			
			if( id.equals(idToCheck) && pw.equals(pwToCheck)) {
				System.out.println("로그인 되었습니다.");
				flag = false;
			}else {
				System.out.println("일치하지 않습니다. 다시 시도해주세요.");
			}
		}while(flag);
		
		sc.close();
	}
}

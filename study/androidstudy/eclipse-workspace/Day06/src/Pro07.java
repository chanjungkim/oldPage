import java.util.Scanner;

public class Pro07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		do {
			System.out.print("����� ID: ");
			String id = sc.next();
			System.out.print("�ش� ID�� PW: ");
			String pw = sc.next();

			System.out.print("�α��� ID: ");
			String idToCheck = sc.next();
			System.out.print("�α��� ID�� PW: ");
			String pwToCheck = sc.next();
			
			if( id.equals(idToCheck) && pw.equals(pwToCheck)) {
				System.out.println("�α��� �Ǿ����ϴ�.");
				flag = false;
			}else {
				System.out.println("��ġ���� �ʽ��ϴ�. �ٽ� �õ����ּ���.");
			}
		}while(flag);
		
		sc.close();
	}
}

import java.util.Scanner;

public class EPro05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int sum = 0;
		while(a!=0){
			System.out.print("���� ���� �Է��Ͻÿ�: ");
			a = sc.nextInt();
			if( a < 0) {
				continue;
			}
			sum+=a;
			
			System.out.println("�� ��: "+sum);
		}
		
		System.out.println("�����մϴ�.");
		sc.close();
	}
}

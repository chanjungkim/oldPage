import java.util.Scanner;

public class EPro01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int a = sc.nextInt();
		
		System.out.print("��� ���: ");
		for(int i = 1 ; i <= a ; i++) {
			if(a % i == 0) 
				System.out.print(i+" ");
		}
		
		sc.close();
	}
}

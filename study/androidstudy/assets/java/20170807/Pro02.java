import java.util.Scanner;

public class Pro02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int start = 0;
		boolean flag = true;
		
		do {
			if(start != 0) {
				System.out.println("����Ͻðڽ��ϱ�?(Y/N)");
				String c = sc.next();
				if( c.equalsIgnoreCase("y")) {
					start = 0;
					continue;
				} else if( c.equalsIgnoreCase("n")){
					break;
				}
			}
			
			System.out.println("���� �������� �Է��Ͻÿ�.: ");
			double r = sc.nextInt();
			r = Math.PI * Math.pow(r, 2);	
			
			System.out.println("���� �������� "+r+"�Դϴ�.");
			
			start = 1;
		}while(flag);
		
		System.out.println("����� �����մϴ�.");
		
		sc.close();
	}
}

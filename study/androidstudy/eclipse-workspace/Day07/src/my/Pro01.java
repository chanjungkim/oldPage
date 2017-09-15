package my;

import java.io.IOException;
import java.util.Scanner;

public class Pro01 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		do {
			System.out.print("�¼��� �����Ͻðڽ��ϱ�?(1 �Ǵ� 0)");
			int yesNo = sc.nextInt();
			int[] seats = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			int[] reservedSeats = new int[10];

		
			if( yesNo == 1 ) {
				System.out.println("������ ���� ���´� ������ �����ϴ�.");
				System.out.println("--------------------------");
				for(int i: seats) {
					System.out.print(i+" ");
				}
				System.out.println("");
				System.out.println("--------------------------");
				System.out.print("");
				
				for(int i = 0 ; i < 10 ; i++) {
					reservedSeats[i] = sc.nextInt();
				}
				System.out.println("");
				System.out.print("�� �� ° �¼��� �����Ͻðڽ��ϱ�?");
				int whichOne = System.in.read()-48;
				
				if( reservedSeats[whichOne-1] == 0 ) {
					reservedSeats[whichOne] = 1;
					System.out.println("����Ǿ����ϴ�.");
				}else {
					System.out.println("�� á���. �ٽ� �õ��غ�����.");
				}
			}else {
				System.out.println("�����մϴ�.");
				flag = false;
				break;
			}
		}while(flag);
		sc.close();
	}
}

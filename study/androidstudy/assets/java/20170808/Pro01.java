package my;

import java.io.IOException;
import java.util.Scanner;

public class Pro01 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		do {
			System.out.print("좌석을 예약하시겠습니까?(1 또는 0)");
			int yesNo = sc.nextInt();
			int[] seats = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			int[] reservedSeats = new int[10];

		
			if( yesNo == 1 ) {
				System.out.println("현재의 예약 상태는 다음과 같습니다.");
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
				System.out.print("몇 번 째 좌석을 예약하시겠습니까?");
				int whichOne = System.in.read()-48;
				
				if( reservedSeats[whichOne-1] == 0 ) {
					reservedSeats[whichOne] = 1;
					System.out.println("예약되었습니다.");
				}else {
					System.out.println("꽉 찼어요. 다시 시도해보세요.");
				}
			}else {
				System.out.println("종료합니다.");
				flag = false;
				break;
			}
		}while(flag);
		sc.close();
	}
}

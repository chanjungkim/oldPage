package my;

import java.util.Scanner;

public class Pro03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생의 수를 입력하시오: ");
		int studentNums = sc.nextInt();
		int[] studentArr = new int[studentNums];
		
		for(int i = 0 ; i < studentNums ; i++) {
			System.out.print("학생 "+(i+1)+"의 성적을 입력하시오: ");
			do{
				studentArr[i] = sc.nextInt();
				if(studentArr[i] > 100) {
					System.out.println("잘못된 성적입니다. 다시 입력하시오.");
					System.out.print("학생 "+(i+1)+"의 성적을 입력하시오: ");
				}else {
					break;
				}
			}while(true);
		}
		
		double e = 0;
		for(int i : studentArr) {
			e+=i;
		}
		e = e/studentNums;
		
		System.out.println("성적 평균은 "+e+"입니다.");
		
		sc.close();
	}
}

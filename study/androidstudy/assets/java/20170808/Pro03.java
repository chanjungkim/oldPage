package my;

import java.util.Scanner;

public class Pro03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л��� ���� �Է��Ͻÿ�: ");
		int studentNums = sc.nextInt();
		int[] studentArr = new int[studentNums];
		
		for(int i = 0 ; i < studentNums ; i++) {
			System.out.print("�л� "+(i+1)+"�� ������ �Է��Ͻÿ�: ");
			do{
				studentArr[i] = sc.nextInt();
				if(studentArr[i] > 100) {
					System.out.println("�߸��� �����Դϴ�. �ٽ� �Է��Ͻÿ�.");
					System.out.print("�л� "+(i+1)+"�� ������ �Է��Ͻÿ�: ");
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
		
		System.out.println("���� ����� "+e+"�Դϴ�.");
		
		sc.close();
	}
}

package pro01;

import java.util.Scanner;

public class ProductTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int len = str.length()-1;
		int temp = len;
		while( temp >= 0 ) {
			if(len > 5) {
				System.out.println("�߸��� ��ǰ ��ȣ: �̸��� �ʹ� ��ϴ�.");
				break;
			}else if(len < 5) {
				System.out.println("�߸��� ��ǰ ��ȣ: �̸��� �ʹ� ª���ϴ�.");
				break;
			}
			
			if( len < 2 ) {
				if( (int)str.charAt(temp) < 65 || ((int)str.charAt(temp) > 90 && (int)str.charAt(temp) < 96) || (int)str.charAt(temp) > 122) {
					System.out.println("�߸��� ��ǰ ��ȣ: Ʋ�� ���ĺ�");
					break;
				}
			} else if( len > 2 ) {
				if( (int)str.charAt(temp) < 48 && (int)str.charAt(temp) > 57) {
					System.out.println("�߸��� ��ǰ ��ȣ: Ʋ�� ��ȣ");
					break;
				}
			}
			temp--;
		}
		
		System.out.println("�����Դϴ�.");
		sc.close();
	}
}
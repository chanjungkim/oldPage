package test04;

public class Test04 {
	public static void main(String[] args) {
		String sample;
		
		sample = new String("Hello String test~!");
		
		char r1 = sample.charAt(1);
		
		System.out.println("1�� ° �ܾ��Դϴ�: "+r1);
		
		for(int i = 0 ; i < sample.length() ; i++) {
			System.out.println("���� ����: "+sample.charAt(i));
		}
		
		String s1 = new String("apple");
		String s2 = new String("apple");
		String s3 = new String("Apple");
		
		System.out.println("Case 1:");
		if(s1 == s2) {
			System.out.println("���� �ܾ��Դϴ�.");
		}else {
			System.out.println("�ٸ� �ܾ��Դϴ�.");
		}
		
		System.out.println("Case 2:");
		if(s1.equals(s2)) {
			System.out.println("���� �ܾ��Դϴ�.");
		} else {
			System.out.println("�ٸ� �ܾ��Դϴ�.");
		}
		
		System.out.println("Case 3:");
		if(s1.equals(s3)) {
			System.out.println("���� �ܾ��Դϴ�. ");
		}else {
			System.out.println("�ٸ� �ܾ��Դϴ�. ");
		}
	
		if(s1.equalsIgnoreCase(s3)) {
			System.out.println("���� �ܾ��Դϴ�. ");
		}else {
			System.out.println("�ٸ� �ܾ��Դϴ�. ");
		}
	}
}

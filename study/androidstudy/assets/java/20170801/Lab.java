import java.util.*;

public class Lab {
	public static void main(String[] args) {
		double w;
		double h;
		double area;
		double perimeter;
		
		w = 10.0;
		h = 5.0;
		
		area = w*h;
		perimeter = 2*(w+h);
		
		System.out.println("�簢���� ����: "+area);
		System.out.println("�簢���� �ѷ�: "+perimeter);
		
		// 1. Box���� Rectangle �����ϸ� Ŭ������ �������� ������ �����ϸ� �ƹ��ϵ� �Ͼ�� �ʴ´�.
		// 2
		System.out.print("�簢���� ����: "+area+" �簢���� �ѷ�: "+perimeter);
		
		// 3. println�� ��� �Ŀ� ���� �ٷ� �Ѿ��, print�� �� �ٸ� ����Ѵ�.
		System.out.println();
		System.out.println();
		System.out.print("�簢���� ����: "+area+" �簢���� �ѷ�: "+perimeter);
		System.out.println();
		System.out.println();
		
		// 4
		Scanner sc = new Scanner(System.in);
		w = sc.nextDouble();
		h = sc.nextDouble();
		
		area = w*h;
		perimeter = 2*(w+h);
		
		System.out.println("�簢���� ����: "+area+" �簢���� �ѷ�: "+perimeter);
		
		sc.close();
	}
}

// 1. 3, /* �ּ� */�� �ùٸ���
/*
 * 2. ������ ���� �ۼ��ؾ��Ѵ�.
 * class MyProgram{  // public -> class
 *    public class void main(String args[]){ // ��� �ٿ��� semi-colon ���� 
 *       int x, y;
 *       x = 10;  
 *       y = 20;  
 *       int sum; // sum ���� ������ �ȵǾ���.
 *       sum = x + y; 
 *       System.out.println("����"+sum); // system�� �ƴ� �빮�ڷ� System��. '�� �ƴ� "��.
 *    } // main �޼ҵ� �ݴ� ��ȣ ����
 * }
*/
package pro02;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomerVO customer = null;
		BankDAO dao = new BankDAO();
		
		String name;
		String accountNumber;
		String password;
		long money;
		
		boolean flag = true;
		
        while(flag) {
            System.out.println("-- Welcome to ChanBank ~!--");
            System.out.println("1: ���� 2: �Ա�  3: ��� 4: ��ü 5: �ܾ� ��ȸ 6: ����-1:����");
            System.out.print("select>>");
            int select = sc.nextInt();

            switch(select) {
            case 1: // ���� 
            	customer = new CustomerVO();
            	System.out.print("������ �Է��ϼ���: ");
            	customer.setName(sc.next());
            	System.out.print("��й�ȣ�� �Է��ϼ���: ");
            	customer.setPw(sc.next());
            	dao.signUp(customer);
            	
            	System.out.println(); // �� ���� ���, ���¹�ȣ, 
                break;
            case 2: // �Ա�
            	System.out.print("������ �Է��ϼ���: ");
            	name = sc.next();
            	System.out.print("�Ա��� ���¸� �Է��ϼ���: ");
            	accountNumber= sc.next();
            	System.out.print("�Ա��� �ݾ��� �Է��ϼ���: ");
            	money = sc.nextLong();
            	System.out.println(); // �ܾ� ��� 
                break;
            case 3: // ���
            	System.out.print("������ �Է��ϼ���: ");
            	name = sc.next();
            	System.out.print("����� ���¸� �Է��ϼ���: ");
            	accountNumber= sc.next();
            	System.out.print("��й�ȣ�� �Է��ϼ���: ");
            	password= sc.next();
            	System.out.print("����� �ݾ��� �Է��ϼ���: ");
            	money = sc.nextLong();
            	System.out.println(); // �ܾ� ��� 

            	break;
            case 4: // ��ü
            	System.out.print("������ �Է��ϼ���: ");
            	name = sc.next();
            	System.out.print("���¸� �Է��ϼ���: ");
            	accountNumber= sc.next();
            	System.out.print("��й�ȣ�� �Է��ϼ���: ");
            	password= sc.next();
            	
            	System.out.print("�޴� ������ �Է��ϼ���: ");
            	String receiverName = sc.next();
            	System.out.print("��ü�� ���¸� �Է��ϼ���: ");
            	String accountNumberToReceive = sc.next();
            	System.out.print("��ü�� �ݾ��� �Է��ϼ���: ");
            	money = sc.nextLong();

            	System.out.println(); // �ܾ� ��� 

                break;
            case 5: // �ܾ� ��ȸ
            	System.out.println(); // �ܾ� ��� 

            	break;
            case 6:// ����
            	System.out.println("������ �Է��ϼ���: ");
            	name = sc.next();
            	System.out.println("������ ���¸� �Է��ϼ���: ");
            	accountNumber = sc.next();
            	System.out.println("��й�ȣ�� �Է��ϼ���: ");
            	password = sc.next();
            	System.out.println(name+"���� ���¸� ���� �����Ͻðڽ��ϱ�?: ");
            	break;
            case -1: // ����
            	flag = false;
            	break;
            }
        }// end while
        System.out.println("å ���� ���α׷��� �����մϴ�.bye");     
	}
}

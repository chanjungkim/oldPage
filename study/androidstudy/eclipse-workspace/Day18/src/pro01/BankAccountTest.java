package pro01;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountTest {
	static String name;
	static String pw;
	static String accountNumber;
	static int money;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<BankAccount> ba = new ArrayList<BankAccount>();
		
		while (true) {
			System.out.println("\n -- 1:���� 2:�Ա� 3:��� 4:�۱� 5:������ȸ 6:�������� -1:���� -- ");
			System.out.print(" -- select >");
			int select = input.nextInt();

			if (select == -1)
				break;

			switch (select) {
			case 1:
				System.out.print("����: ");				
				name = input.next();
				System.out.print("��й�ȣ: ");
				pw = input.next();
				System.out.print("�Ա��� �ݾ�: ");
				money = input.nextInt();
				ba.add(new BankAccount(name, pw, money));
				System.out.print("== ���� �Ϸ� ==");
				ba.get(BankAccount.getCustomerCount()-1).printAccount();
				break;
			case 2: // �Ա�
				System.out.print("����: ");				
				name = input.next();
				System.out.print("���¹�ȣ: ");				
				accountNumber = input.next();
				System.out.print("�Ա��� �ݾ�: ");
				money = input.nextInt();
				for(int i = 0 ; i < ba.size() ; i++) {
					if(name.equals(ba.get(i).getOwnerName()) && accountNumber.equals(ba.get(i).getAccountNumber())) {
						ba.get(i).deposit(money);
						System.out.println("== �Ա� �Ϸ� ==");
						ba.get(i).printAccount();
						break;
					}
				}
				System.out.println("�߸��� ����");
				break;
			case 3:
				System.out.print("����: ");				
				name = input.next();
				System.out.print("���¹�ȣ: ");				
				accountNumber = input.next();
				System.out.print("��й�ȣ: ");
				pw = input.next();
				System.out.print("����� �ݾ�: ");
				money = input.nextInt();
				for(int i = 0 ; i < ba.size() ; i++) {
					if(name.equals(ba.get(i).getOwnerName()) && accountNumber.equals(ba.get(i).getAccountNumber()) && ba.get(i).passwordCheck(pw)) {
						ba.get(i).withdraw(pw, money);
						System.out.println("== ��� �Ϸ� ==");
						System.out.println("��� �ݾ�: "+money);
						ba.get(i).printAccount();
						break;
					}
				}
				System.out.println("�߸��� ����");

				break;
			case 4: 
				System.out.print("����: ");				
				name = input.next();
				System.out.print("���¹�ȣ: ");				
				accountNumber = input.next();
				System.out.print("��й�ȣ: ");
				pw = input.next();

				System.out.println("�޴���: ");
				String toWhom = input.next();
				System.out.println("�޴°���: ");
				String toWhere = input.next();
				System.out.print("�۱��� �ݾ�: ");
				money = input.nextInt();

				for(int i = 0 ; i < ba.size() ; i++) {
					if(name.equals(ba.get(i).getOwnerName()) && accountNumber.equals(ba.get(i).getAccountNumber()) && ba.get(i).passwordCheck(pw)) {
						for(int j = 0 ; j < ba.size(); j++) {
							if(toWhom.equals(ba.get(j).getOwnerName()) && toWhere.equals(ba.get(j).getAccountNumber())) {
								ba.get(i).transferTo(ba.get(j), pw, money);
								System.out.println("== �۱� �Ϸ� ==");
								System.out.println("�۱� �ݾ�: "+money);
								ba.get(i).printAccount();
								break;
							}
						}
					}
				}
				System.out.println("�߸��� ����");
				break;
				
			case 5: // ���� ��ȸ
				System.out.print("����: ");				
				name = input.next();
				System.out.print("���¹�ȣ: ");				
				accountNumber = input.next();
				System.out.print("��й�ȣ: ");
				pw = input.next();
				
				for(int i = 0 ; i < ba.size() ; i++) {
					if(name.equals(ba.get(i).getOwnerName()) && accountNumber.equals(ba.get(i).getAccountNumber()) && ba.get(i).passwordCheck(pw)) {
						ba.get(i).printAccount();
						break;
					}
				}
				System.out.println("�߸��� ����");
				break;
			case 6: // ���� ����
				System.out.print("����: ");				
				name = input.next();
				System.out.print("���¹�ȣ: ");				
				accountNumber = input.next();
				System.out.print("��й�ȣ: ");
				pw = input.next();
				
				for(int i = 0 ; i < ba.size() ; i++) {
					if(name.equals(ba.get(i).getOwnerName()) && accountNumber.equals(ba.get(i).getAccountNumber()) && ba.get(i).passwordCheck(pw)) {
						ba.remove(ba.get(i).getCustomerCount()-1);
						System.out.println(name+"���°� �����Ǿ����ϴ�.");
						break;
					}
				}
				System.out.println("�߸��� ����");
			default:
				System.out.println("�Է��� �߸��Ǿ����ϴ�.");
			}
		}
	}
}

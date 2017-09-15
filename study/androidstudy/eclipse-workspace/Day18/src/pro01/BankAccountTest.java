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
			System.out.println("\n -- 1:가입 2:입금 3:출금 4:송금 5:계좌조회 6:계좌해지 -1:종료 -- ");
			System.out.print(" -- select >");
			int select = input.nextInt();

			if (select == -1)
				break;

			switch (select) {
			case 1:
				System.out.print("성함: ");				
				name = input.next();
				System.out.print("비밀번호: ");
				pw = input.next();
				System.out.print("입금할 금액: ");
				money = input.nextInt();
				ba.add(new BankAccount(name, pw, money));
				System.out.print("== 가입 완료 ==");
				ba.get(BankAccount.getCustomerCount()-1).printAccount();
				break;
			case 2: // 입금
				System.out.print("성함: ");				
				name = input.next();
				System.out.print("계좌번호: ");				
				accountNumber = input.next();
				System.out.print("입금할 금액: ");
				money = input.nextInt();
				for(int i = 0 ; i < ba.size() ; i++) {
					if(name.equals(ba.get(i).getOwnerName()) && accountNumber.equals(ba.get(i).getAccountNumber())) {
						ba.get(i).deposit(money);
						System.out.println("== 입금 완료 ==");
						ba.get(i).printAccount();
						break;
					}
				}
				System.out.println("잘못된 정보");
				break;
			case 3:
				System.out.print("성함: ");				
				name = input.next();
				System.out.print("계좌번호: ");				
				accountNumber = input.next();
				System.out.print("비밀번호: ");
				pw = input.next();
				System.out.print("출금할 금액: ");
				money = input.nextInt();
				for(int i = 0 ; i < ba.size() ; i++) {
					if(name.equals(ba.get(i).getOwnerName()) && accountNumber.equals(ba.get(i).getAccountNumber()) && ba.get(i).passwordCheck(pw)) {
						ba.get(i).withdraw(pw, money);
						System.out.println("== 출금 완료 ==");
						System.out.println("출금 금액: "+money);
						ba.get(i).printAccount();
						break;
					}
				}
				System.out.println("잘못된 정보");

				break;
			case 4: 
				System.out.print("성함: ");				
				name = input.next();
				System.out.print("계좌번호: ");				
				accountNumber = input.next();
				System.out.print("비밀번호: ");
				pw = input.next();

				System.out.println("받는이: ");
				String toWhom = input.next();
				System.out.println("받는계좌: ");
				String toWhere = input.next();
				System.out.print("송금할 금액: ");
				money = input.nextInt();

				for(int i = 0 ; i < ba.size() ; i++) {
					if(name.equals(ba.get(i).getOwnerName()) && accountNumber.equals(ba.get(i).getAccountNumber()) && ba.get(i).passwordCheck(pw)) {
						for(int j = 0 ; j < ba.size(); j++) {
							if(toWhom.equals(ba.get(j).getOwnerName()) && toWhere.equals(ba.get(j).getAccountNumber())) {
								ba.get(i).transferTo(ba.get(j), pw, money);
								System.out.println("== 송금 완료 ==");
								System.out.println("송금 금액: "+money);
								ba.get(i).printAccount();
								break;
							}
						}
					}
				}
				System.out.println("잘못된 정보");
				break;
				
			case 5: // 계좌 조회
				System.out.print("성함: ");				
				name = input.next();
				System.out.print("계좌번호: ");				
				accountNumber = input.next();
				System.out.print("비밀번호: ");
				pw = input.next();
				
				for(int i = 0 ; i < ba.size() ; i++) {
					if(name.equals(ba.get(i).getOwnerName()) && accountNumber.equals(ba.get(i).getAccountNumber()) && ba.get(i).passwordCheck(pw)) {
						ba.get(i).printAccount();
						break;
					}
				}
				System.out.println("잘못된 정보");
				break;
			case 6: // 계좌 해지
				System.out.print("성함: ");				
				name = input.next();
				System.out.print("계좌번호: ");				
				accountNumber = input.next();
				System.out.print("비밀번호: ");
				pw = input.next();
				
				for(int i = 0 ; i < ba.size() ; i++) {
					if(name.equals(ba.get(i).getOwnerName()) && accountNumber.equals(ba.get(i).getAccountNumber()) && ba.get(i).passwordCheck(pw)) {
						ba.remove(ba.get(i).getCustomerCount()-1);
						System.out.println(name+"계좌가 해지되었습니다.");
						break;
					}
				}
				System.out.println("잘못된 정보");
			default:
				System.out.println("입력이 잘못되었습니다.");
			}
		}
	}
}

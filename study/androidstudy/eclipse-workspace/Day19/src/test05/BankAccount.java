package test05;

public class BankAccount {
	private int balance;
	
	public synchronized void deposit(int money) {
		balance += money;
		if(balance<0) {
			System.out.println("�ܾ� ���̳ʽ�!!?: "+balance);
		}
	}
	
	public synchronized void withdraw(int money) {
		balance -= money;
		if(balance<0) {
			System.out.println("�ܾ� ���̳ʽ�!!?: "+balance);
		}
	}
}

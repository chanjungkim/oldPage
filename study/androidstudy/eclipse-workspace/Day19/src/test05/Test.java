package test05;

public class Test {
	public static void main(String[] args) {
		BankAccount a = new BankAccount();
		
		MoneyThread t1 = new MoneyThread(a);
		MoneyThread t2 = new MoneyThread(a);
		
		t1.start();
		t2.start();
	}
}

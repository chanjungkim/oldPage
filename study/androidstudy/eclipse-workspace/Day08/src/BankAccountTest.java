
class BankAccount {
	private int balance;
	
	void withdraw(int money) {
		balance-=money;
	}
	void deposit(int money) {
		balance+=money;
	}
	int getBalance() {
		return balance;
	}
	void printBalance() {
		System.out.println(balance);
	}
	public int transfer(int amount, BankAccount otherAccount) {
		balance-=amount;
		return balance;
	}
}
public class BankAccountTest{
	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount();
		BankAccount ba2 = new BankAccount();
		
		ba1.deposit(100000);
		ba1.withdraw(20000);
		ba1.printBalance();
		ba1.transfer(50000, ba2);
		ba1.printBalance();
		ba2.printBalance();
	}
}

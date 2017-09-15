package lab01;

public class BankAccount {
	int balance;
	void deposit(int amount) {
		balance+=amount;
	}
	void withdraw(int amount) {
		if(this.balance < 0 | this.balance < amount) {
			System.out.println("잔고가 부족합니다. 거래 취소됨.");
		}else {
			balance-=amount;
		}
	}
	int getBalance() {
		System.out.println(balance);
		
		return balance;
	}
	double addInterest(int amount) {
		double interest = amount + ((double)amount*0.075);

		return interest;
	}
}
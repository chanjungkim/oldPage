package Pro05;

public class BankAccount {
	private String name;
	private String accountNumber;
	private String balance;
	private String interestRatio;
	
	public BankAccount() {
		this(null, null, null, null);
	}
	public BankAccount(String name, String accountNumber, String balance, String interestRatio) {
		this.name=name;
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.interestRatio=interestRatio;
	}
	public String toString() {
		return name+" "+accountNumber+" "+balance+" "+interestRatio;
	}
}

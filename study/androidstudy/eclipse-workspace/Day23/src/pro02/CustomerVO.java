package pro02;

public class CustomerVO {
	private String name;
	private String pw;
	private String bankAccount;
	private long balance;
	private static long customerNumber=0;
	public CustomerVO() {
		name  = "ȫ�浿";
		pw = "1234";
		bankAccount ="";
		balance = 0;
		customerNumber++;
	}

	public CustomerVO(String name, String pw, String bankAccount, long balance) {
		super();
		this.name = name;
		this.pw = pw;
		this.bankAccount = bankAccount;
		this.balance = balance;
		customerNumber++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "�̸�: "+ name + "\n��й�ȣ: " + pw + "\n���¹�ȣ: " + bankAccount + "\n�ܾ�: " + balance;
	}
}

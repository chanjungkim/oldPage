package Pro05;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount();
		BankAccount ba2 = new BankAccount("±èÂùÁß", "32878734", "1¾ï", "0.5%");
		
		System.out.println(ba1);
		System.out.println(ba2);
	}
}

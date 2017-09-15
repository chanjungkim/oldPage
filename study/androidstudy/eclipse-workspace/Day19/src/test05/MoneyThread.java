package test05;

public class MoneyThread extends Thread{
	private BankAccount account;
	
	public MoneyThread(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < 10000000 ; i++) {
			account.deposit(1000);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			account.withdraw(1000);
		}
	}
}

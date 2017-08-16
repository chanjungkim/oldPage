import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount[] ba = new BankAccount[100];
        // ���α׷� ���࿡ �ʿ��� ���� ����
         
        while (true) {
            System.out.println("\n -- 1:���� 2:�Ա� 3:��� 4:�۱� 5:������ȸ 6:�������� -1:���� -- ");
            System.out.print(" -- select >");
            
            int select = input.nextInt();
 
            if (select == -1)
                break;
 
            switch (select) {
            case 1: // ����
            	System.out.print("�̸�:");
            	String name = input.next();
            	System.out.print("��й�ȣ:");
            	String pw = input.next();
            	System.out.print("�Ա��� �ݾ�:");
            	int money = input.nextInt();
            	ba[BankAccount.getCustomerCount()] = new BankAccount(name, pw, money);
            	System.out.println("=======���ԿϷ�=======");
            	ba[BankAccount.getCustomerCount()-1].printAccount();
                break;
            case 2: // �Ա�
            	boolean found = false;
            	System.out.print("�Ա��� �ݾ�:");
            	int m = input.nextInt();
            	System.out.print("�Ա��� ���� ��ȣ:");
            	String accountNumber = input.next();
            	System.out.print("������:");
            	String ownerName = input.next();
            	int i = 0;
            	for(; i < BankAccount.getCustomerCount() ; i++) {
            		if(ba[i].getAccountNumber().equals(accountNumber) && ba[i].getOwnerName().equals(ownerName)) {
            			found = true;
            			break;
            		}
            	}
            	if(found) {
            		ba[i].deposit(m);
            		System.out.println("=======�Ա� �Ϸ�=======");
            		System.out.println("�Ѿ�: "+ba[i].getBalance());
            		System.out.println("==�̿����ּż� �����մϴ�.==");
            	}
            	else System.out.print("=�Ա� ����: �߸��� �����Դϴ�.=");
                break;
            case 3: // ���
            	boolean found2 = false;
            	System.out.print("����� �̸�:");
            	String userName = input.next();
            	System.out.print("����� ���� ��ȣ:");
            	String accountNumberToWithdraw = input.next();
            	System.out.print("��й�ȣ:");
            	String password = input.next();
            	System.out.print("����� �ݾ�:");
            	int moneyToWithraw = input.nextInt();
            	int j = 0;
            	for(; j < BankAccount.getCustomerCount() ; j++) {
            		if(ba[j].getAccountNumber().equals(accountNumberToWithdraw) && ba[j].getOwnerName().equals(userName) && ba[j].passwordCheck(password)) {
            			found2 = true;
            			break;
            		}
            	}            	
            	if(found2) {
            		ba[j].withdraw(password, moneyToWithraw);
            		System.out.println("=======��� �Ϸ�=======");
            		System.out.println("�Ѿ�: "+ba[j].getBalance());
            		System.out.println("==�̿����ּż� �����մϴ�.==");
            	}
            	else System.out.println("=��� ����: �߸��� �����Դϴ�.=");
                break;
            case 4: // �۱�
            	boolean senderFounder = false;
            	boolean receiverFounder =false;
            	
            	System.out.print("����� �̸�:");
            	String userName2 = input.next();
            	System.out.print("��й�ȣ:");
            	String password2 = input.next();
            	System.out.print("�޴� ��� �̸�:");
            	String receiver = input.next();
            	System.out.print("���� ���� ��ȣ:");
            	String receiverNumber = input.next();
            	System.out.print("�۱��� �ݾ�:");
            	int moneyToSend = input.nextInt();
            	int s = 0;
            	int k = 0;
            	for(; s < BankAccount.getCustomerCount() ; s++) {
            		if(ba[s].getOwnerName().equals(userName2) && ba[s].passwordCheck(password2)) {
            			senderFounder=true;
            			break;
            	}
           		for(; k < BankAccount.getCustomerCount() ; k++)
            		if(ba[k].getAccountNumber().equals(receiverNumber) && ba[k].getOwnerName().equals(receiver)) {
            			receiverFounder = true;
            			break;
            		}
            	}            	
            	if(senderFounder && receiverFounder) {
            		ba[s].transferTo(ba[k], password2, moneyToSend);
            		System.out.println("=======��� �Ϸ�=======");
            		System.out.println("�Ѿ�: "+ba[s].getBalance());
            		System.out.println("==�̿����ּż� �����մϴ�.==");
            	}
            	else if(receiverFounder) System.out.println("==������ ��� ������ �߸��Ǿ����ϴ�.==");
            	else if(senderFounder) System.out.println("==�޴� ��� ������ �߸��Ǿ����ϴ�.==");           		
            	else System.out.println("==�Է� ������ �߸��Ǿ����ϴ�.==");
            	
                break;
            case 5: // ���� ��ȸ
            	boolean found3 = false;
            	System.out.print("����� �̸�:");
            	String myName = input.next();
            	System.out.print("Ȯ���� ���� ��ȣ:");
            	String accountNumberToCheck = input.next();
            	System.out.print("��й�ȣ:");
            	String myPassword = input.next();
            	int l = 0;
            	for(; l < BankAccount.getCustomerCount() ; l++) {
            		if(ba[l].getAccountNumber().equals(accountNumberToCheck) && ba[l].getOwnerName().equals(myName) && ba[l].passwordCheck(myPassword)) {
            			found3 = true;
            			break;
            		}
            	}            	
            	if(found3) {
            		System.out.println("=======��  ��=======");
            		System.out.println("�Ѿ�: "+ba[l].getBalance());
            		System.out.println("==�̿����ּż� �����մϴ�.==");
            	}
            	else System.out.println("=��ȸ ����: �߸��� �����Դϴ�.=");
                break;
            case 6: // ���� ����
            	boolean found4 = false;
            	System.out.print("����� �̸�:");
            	String myNameToDelete = input.next();
            	System.out.print("Ȯ���� ���� ��ȣ:");
            	String accountNumberToDelete = input.next();
            	System.out.print("��й�ȣ:");
            	String myPasswordToDelete = input.next();
            	int o = 0;
            	for(; o < BankAccount.getCustomerCount() ; o++) {
            		if(ba[o].getAccountNumber().equals(accountNumberToDelete) && ba[o].getOwnerName().equals(myNameToDelete) && ba[o].passwordCheck(myPasswordToDelete)) {
            			found4 = true;
            			break;
            		}
            	}            	
            	if(found4) {
            		System.out.println("== ���°� �����Ǿ����ϴ�.==");
            		System.out.println("==�̿����ּż� �����մϴ�.==");
            	}
            	else System.out.println("=���� ���� ����: �߸��� �����Դϴ�.=");
            	break;
            default:
                System.out.println("�Է��� �߸��Ǿ����ϴ�.");
            }
        }
        input.close();
    }
}

//package test01;

/*
* ����       : ���� ���¸� �����ϰ�, �Ա� ����� ������ Ŭ����
* �ۼ���  : ������
* ���� ����    : 2017-08-11
*/

class BankAccount{
  private String ownerName;       // ���� ������ �̸�
  private String accountNumber;   // ���� ��ȣ
  private String password;        // ��й�ȣ(�������� ������ �ƴϹǷ� int ������� ����)
  private int balance;            // �ܾ� ����
   
  private static final int acNumSeed=11111; // ���¹�ȣ�� �ο��ϱ����� �⺻��
  private static int customerCount=0; // ȸ�� ��
  public static int getCustomerCount(){
	  return customerCount;
  }
/////////////////////////////////////////////////////////   
  public BankAccount(String name, String pw, int init_money){
      // ������� �̸�, ��й�ȣ, �ʱ�ݾ��� �Է¹޾Ƽ� ������� ��ü�� ����.
      this.ownerName = name;
      this.password = pw;
      this.balance = init_money;
      this.accountNumber = (acNumSeed+customerCount)+"";
      customerCount++;
  }
  // �Ա� �޼ҵ�
  public boolean deposit(int money){
      if(money>0){
          balance+=money;
          return true;
      }else{
          System.out.println("�Աݾ� ������ �̻��մϴ�.");
          return false;
      }
  }
  // ��� �޼ҵ�
  public boolean withdraw(String password, int money){
      if(balance<money){
          System.out.println("�ܾ׺���");
          return false;
      }else if(!passwordCheck(password)){
          System.out.println("��й�ȣ ����");
          return false;
      }else{
          this.balance -= money;
          return true;
      }
  }
  // ��й�ȣ Ȯ�� �޼ҵ�
  public boolean passwordCheck(String password){
      return (this.password.equals(password));
  }
  // �۱� �޼ҵ�
  public void transferTo(BankAccount other, String password, int money){
      if(this.withdraw(password,money)){
          other.deposit(money);
      }
  }
//////getter/setter/////////////////////////////////////////////////////////////    
  public String getOwnerName() {
      return ownerName;
  }
  public String getAccountNumber() {
      return accountNumber;
  }
  public int getBalance() {
      return balance;
  }
  public void setPassword(String password) {
      this.password = password;
  }

////////////////////////////////////////////////////////////////////////////////
  public void printAccount(){
      System.out.println("***********���� ����**************");
      System.out.println("* ������ : "+ownerName);
      System.out.println("* ���¹�ȣ : "+accountNumber);
      System.out.println("* �ܾ� : "+balance);
      System.out.println("**********************************");
  }
   
  @Override
  public String toString() {
      // TODO Auto-generated method stub
      return super.toString();
  }
}
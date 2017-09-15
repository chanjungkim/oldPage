import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount[] ba = new BankAccount[100];
        // 프로그램 진행에 필요한 변수 선언
         
        while (true) {
            System.out.println("\n -- 1:가입 2:입금 3:출금 4:송금 5:계좌조회 6:계좌해지 -1:종료 -- ");
            System.out.print(" -- select >");
            
            int select = input.nextInt();
 
            if (select == -1)
                break;
 
            switch (select) {
            case 1: // 가입
            	System.out.print("이름:");
            	String name = input.next();
            	System.out.print("비밀번호:");
            	String pw = input.next();
            	System.out.print("입금할 금액:");
            	int money = input.nextInt();
            	ba[BankAccount.getCustomerCount()] = new BankAccount(name, pw, money);
            	System.out.println("=======가입완료=======");
            	ba[BankAccount.getCustomerCount()-1].printAccount();
                break;
            case 2: // 입금
            	boolean found = false;
            	System.out.print("입금할 금액:");
            	int m = input.nextInt();
            	System.out.print("입금할 계좌 번호:");
            	String accountNumber = input.next();
            	System.out.print("예금주:");
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
            		System.out.println("=======입금 완료=======");
            		System.out.println("총액: "+ba[i].getBalance());
            		System.out.println("==이용해주셔서 감사합니다.==");
            	}
            	else System.out.print("=입금 실패: 잘못된 정보입니다.=");
                break;
            case 3: // 출금
            	boolean found2 = false;
            	System.out.print("사용자 이름:");
            	String userName = input.next();
            	System.out.print("출금할 계좌 번호:");
            	String accountNumberToWithdraw = input.next();
            	System.out.print("비밀번호:");
            	String password = input.next();
            	System.out.print("출금할 금액:");
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
            		System.out.println("=======출금 완료=======");
            		System.out.println("총액: "+ba[j].getBalance());
            		System.out.println("==이용해주셔서 감사합니다.==");
            	}
            	else System.out.println("=출금 실패: 잘못된 정보입니다.=");
                break;
            case 4: // 송금
            	boolean senderFounder = false;
            	boolean receiverFounder =false;
            	
            	System.out.print("사용자 이름:");
            	String userName2 = input.next();
            	System.out.print("비밀번호:");
            	String password2 = input.next();
            	System.out.print("받는 사람 이름:");
            	String receiver = input.next();
            	System.out.print("보낼 계좌 번호:");
            	String receiverNumber = input.next();
            	System.out.print("송금할 금액:");
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
            		System.out.println("=======출금 완료=======");
            		System.out.println("총액: "+ba[s].getBalance());
            		System.out.println("==이용해주셔서 감사합니다.==");
            	}
            	else if(receiverFounder) System.out.println("==보내는 사람 정보가 잘못되었습니다.==");
            	else if(senderFounder) System.out.println("==받는 사람 정보가 잘못되었습니다.==");           		
            	else System.out.println("==입력 정보가 잘못되었습니다.==");
            	
                break;
            case 5: // 계좌 조회
            	boolean found3 = false;
            	System.out.print("사용자 이름:");
            	String myName = input.next();
            	System.out.print("확인할 계좌 번호:");
            	String accountNumberToCheck = input.next();
            	System.out.print("비밀번호:");
            	String myPassword = input.next();
            	int l = 0;
            	for(; l < BankAccount.getCustomerCount() ; l++) {
            		if(ba[l].getAccountNumber().equals(accountNumberToCheck) && ba[l].getOwnerName().equals(myName) && ba[l].passwordCheck(myPassword)) {
            			found3 = true;
            			break;
            		}
            	}            	
            	if(found3) {
            		System.out.println("=======잔  금=======");
            		System.out.println("총액: "+ba[l].getBalance());
            		System.out.println("==이용해주셔서 감사합니다.==");
            	}
            	else System.out.println("=조회 실패: 잘못된 정보입니다.=");
                break;
            case 6: // 계좌 해지
            	boolean found4 = false;
            	System.out.print("사용자 이름:");
            	String myNameToDelete = input.next();
            	System.out.print("확인할 계좌 번호:");
            	String accountNumberToDelete = input.next();
            	System.out.print("비밀번호:");
            	String myPasswordToDelete = input.next();
            	int o = 0;
            	for(; o < BankAccount.getCustomerCount() ; o++) {
            		if(ba[o].getAccountNumber().equals(accountNumberToDelete) && ba[o].getOwnerName().equals(myNameToDelete) && ba[o].passwordCheck(myPasswordToDelete)) {
            			found4 = true;
            			break;
            		}
            	}            	
            	if(found4) {
            		System.out.println("== 계좌가 해지되었습니다.==");
            		System.out.println("==이용해주셔서 감사합니다.==");
            	}
            	else System.out.println("=계좌 해지 실패: 잘못된 정보입니다.=");
            	break;
            default:
                System.out.println("입력이 잘못되었습니다.");
            }
        }
        input.close();
    }
}

//package test01;

/*
* 개요       : 은행 계좌를 생성하고, 입금 출금이 가능한 클래스
* 작성자  : 양유진
* 개발 일자    : 2017-08-11
*/

class BankAccount{
  private String ownerName;       // 계좌 소유주 이름
  private String accountNumber;   // 계좌 번호
  private String password;        // 비밀번호(덧셈뺄셈 계산용이 아니므로 int 사용하지 않음)
  private int balance;            // 잔액 정보
   
  private static final int acNumSeed=11111; // 계좌번호를 부여하기위한 기본값
  private static int customerCount=0; // 회원 수
  public static int getCustomerCount(){
	  return customerCount;
  }
/////////////////////////////////////////////////////////   
  public BankAccount(String name, String pw, int init_money){
      // 사용자의 이름, 비밀번호, 초기금액을 입력받아서 은행계좌 객체를 생성.
      this.ownerName = name;
      this.password = pw;
      this.balance = init_money;
      this.accountNumber = (acNumSeed+customerCount)+"";
      customerCount++;
  }
  // 입금 메소드
  public boolean deposit(int money){
      if(money>0){
          balance+=money;
          return true;
      }else{
          System.out.println("입금액 정보가 이상합니다.");
          return false;
      }
  }
  // 출금 메소드
  public boolean withdraw(String password, int money){
      if(balance<money){
          System.out.println("잔액부족");
          return false;
      }else if(!passwordCheck(password)){
          System.out.println("비밀번호 오류");
          return false;
      }else{
          this.balance -= money;
          return true;
      }
  }
  // 비밀번호 확인 메소드
  public boolean passwordCheck(String password){
      return (this.password.equals(password));
  }
  // 송금 메소드
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
      System.out.println("***********계좌 정보**************");
      System.out.println("* 소유주 : "+ownerName);
      System.out.println("* 계좌번호 : "+accountNumber);
      System.out.println("* 잔액 : "+balance);
      System.out.println("**********************************");
  }
   
  @Override
  public String toString() {
      // TODO Auto-generated method stub
      return super.toString();
  }
}
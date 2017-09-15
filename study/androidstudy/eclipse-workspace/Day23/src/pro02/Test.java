package pro02;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomerVO customer = null;
		BankDAO dao = new BankDAO();
		
		String name;
		String accountNumber;
		String password;
		long money;
		
		boolean flag = true;
		
        while(flag) {
            System.out.println("-- Welcome to ChanBank ~!--");
            System.out.println("1: 가입 2: 입금  3: 출금 4: 이체 5: 잔액 조회 6: 해지-1:종료");
            System.out.print("select>>");
            int select = sc.nextInt();

            switch(select) {
            case 1: // 가입 
            	customer = new CustomerVO();
            	System.out.print("고객명을 입력하세요: ");
            	customer.setName(sc.next());
            	System.out.print("비밀번호를 입력하세요: ");
            	customer.setPw(sc.next());
            	dao.signUp(customer);
            	
            	System.out.println(); // 고객 정보 출력, 계좌번호, 
                break;
            case 2: // 입금
            	System.out.print("고객명을 입력하세요: ");
            	name = sc.next();
            	System.out.print("입금할 계좌를 입력하세요: ");
            	accountNumber= sc.next();
            	System.out.print("입금할 금액을 입력하세요: ");
            	money = sc.nextLong();
            	System.out.println(); // 잔액 출력 
                break;
            case 3: // 출금
            	System.out.print("고객명을 입력하세요: ");
            	name = sc.next();
            	System.out.print("출금할 계좌를 입력하세요: ");
            	accountNumber= sc.next();
            	System.out.print("비밀번호를 입력하세요: ");
            	password= sc.next();
            	System.out.print("출금할 금액을 입력하세요: ");
            	money = sc.nextLong();
            	System.out.println(); // 잔액 출력 

            	break;
            case 4: // 이체
            	System.out.print("고객명을 입력하세요: ");
            	name = sc.next();
            	System.out.print("계좌를 입력하세요: ");
            	accountNumber= sc.next();
            	System.out.print("비밀번호를 입력하세요: ");
            	password= sc.next();
            	
            	System.out.print("받는 고객명을 입력하세요: ");
            	String receiverName = sc.next();
            	System.out.print("이체할 계좌를 입력하세요: ");
            	String accountNumberToReceive = sc.next();
            	System.out.print("이체할 금액을 입력하세요: ");
            	money = sc.nextLong();

            	System.out.println(); // 잔액 출력 

                break;
            case 5: // 잔액 조회
            	System.out.println(); // 잔액 출력 

            	break;
            case 6:// 해지
            	System.out.println("고객명을 입력하세요: ");
            	name = sc.next();
            	System.out.println("해지할 계좌를 입력하세요: ");
            	accountNumber = sc.next();
            	System.out.println("비밀번호를 입력하세요: ");
            	password = sc.next();
            	System.out.println(name+"님의 계좌를 정말 해지하시겠습니까?: ");
            	break;
            case -1: // 종료
            	flag = false;
            	break;
            }
        }// end while
        System.out.println("책 관리 프로그램을 종료합니다.bye");     
	}
}

package pro02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BankDAO {
	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/java";
	private static final String DB_ID = "root";
	private static final String DB_PW = "sds1501";
	
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public BankDAO() {
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("jar파일 드라이버 로딩 오류");
			e.printStackTrace();
		}
	}
	
	// 1: 가입 2: 입금  3: 출금 4: 이체 5: 잔액 조회 6: 해지
	public CustomerVO signUp(CustomerVO customer) {
		
		return customer;
	}
	public void deposit() {
		
	}
	public void withdraw() {
		
	}
	public void transfer() {
		
	}
	
	public String balance() {
		long money = 0;
		return "잔액: "+money;
	}
	public void deleteAccount() {
		
	}
}
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
			System.out.println("jar���� ����̹� �ε� ����");
			e.printStackTrace();
		}
	}
	
	// 1: ���� 2: �Ա�  3: ��� 4: ��ü 5: �ܾ� ��ȸ 6: ����
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
		return "�ܾ�: "+money;
	}
	public void deleteAccount() {
		
	}
}
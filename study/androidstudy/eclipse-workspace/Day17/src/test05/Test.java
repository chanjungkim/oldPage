package test05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test2 {
	public static void main(String[] args) throws Exception {
		Connection con = null;
				
		try {	
			con = DriverManager.getConnection("�������ּ�", "���̵�", "�н�����");
		}catch(SQLException e){
			System.out.println("Ŀ�ؼ� �������");
		}finally {
			try {
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}

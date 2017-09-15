package test05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test2 {
	public static void main(String[] args) throws Exception {
		Connection con = null;
				
		try {	
			con = DriverManager.getConnection("아이피주소", "아이디", "패스워드");
		}catch(SQLException e){
			System.out.println("커넥선 연결실패");
		}finally {
			try {
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}

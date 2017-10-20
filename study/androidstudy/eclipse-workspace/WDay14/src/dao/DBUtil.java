package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBUtil {
	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/jsp";
	private static final String DB_PW = "sds1501";
	
	public static Connection makeConnection() {
		return null;
		
	}

	public static void closeCon(Connection con) {
		
	}

	public static void closePstmt(PreparedStatement pstmt) {
		
	}

	public static void closeRs(ResultSet rs) {
		// TODO Auto-generated method stub
		
	}
}

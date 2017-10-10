package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import vo.MessageVO;

public class MessageDao {
	private final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	private final String CONN_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String DB_ID = "test";
	private final String DB_PW = "sds1501";
	
	private static MessageDao instance;
	public static MessageDao getInstance() {
		if(instance == null) {
			instance = new MessageDao();
		}
		return instance;
	}
	
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
//	public BookDao() {
//		try {
//			Class.forName(DRIVER_NAME);
//		} catch (ClassNotFoundException e1) {
//			System.out.println("커넥션 연결 오류");
//			e1.printStackTrace();
//		}
//	}
	// 특별한 경우 -> private
	private MessageDao() {
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e1) {
			System.out.println("커넥션 연결 오류");
			e1.printStackTrace();
		}
	}

	// 리소스 연결, 해제 관련 메소드
	private void createConnection() {
		try {
			connection = DriverManager.getConnection(CONN_URL, DB_ID, DB_PW);
		} catch (SQLException e) {
			System.out.println("커넥션 연결 오류");
			e.printStackTrace();
		}
	}
	
	private void closePreparedStatement() {
		if(preparedStatement!=null) {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				System.out.println("preparedStatement close 오류");
				e.printStackTrace();
			}
		}
	}
	
	private void closeResultSet() {
		if(resultSet!=null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				System.out.println("resultSet close 오류");
				e.printStackTrace();
			}
		}
	}
	
	private void closeConnection() {
		if(connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("connection close 오류");
				e.printStackTrace();
			}
		}
	}
	
	public int insert(MessageVO message) {
		createConnection();
		String sql = "INSERT INTO MESSAGES(MESSAGE_NUM, TITLE, USERID, WRITEDATE, MESSAGE)"
				+" VALUES(book_id_seq.nextval, ?,?,?,?)";
		int result = 0;
		
		try {
			// 미완성 SQL 담아서  PreparedStatement 확보
			preparedStatement = connection.prepareStatement(sql);
					
			// 물음표 자리 데이터 지우기
			preparedStatement.setString(1, message.getTitle());
			preparedStatement.setString(2, message.getUserId());
			preparedStatement.setString(3, message.getWriteDate());
			preparedStatement.setString(4, message.getMessage());
		
			// SQL 실행
			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("dao insert 메소드 에러");
			e.printStackTrace();
		} finally {
			closePreparedStatement();
			closeConnection();
		}
		return result;
	}
	
	public List<MessageVO> selectAll() {
		List<MessageVO> messageList = new ArrayList<>();
		
		createConnection();
		
		String sql = "SELECT MESSAGE_NUM, TITLE, USERID, WRITEDATE, MESSAGE FROM MESSAGES";
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			int i = 0;
			while(resultSet.next()) {
				MessageVO msg = new MessageVO();
				msg.setMessageNum(resultSet.getInt(1));
				msg.setTitle(resultSet.getString(2));
				msg.setUserId(resultSet.getString(3));
				msg.setWriteDate(resultSet.getString(4));
				msg.setMessage(resultSet.getString(5));
				
				messageList.add(msg);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResultSet();
			closePreparedStatement();
			closeConnection();
		}
		
		return messageList;
	}
}

package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vo.BookVO;

public class BookDao {
	private final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	private final String CONN_URL = "jdbc:mysql://127.0.0.1:3306/java";
	private final String DB_ID = "root";
	private final String DB_PW = "sds1501";
	
	private static BookDao instance;
	public static BookDao getInstance() {
		if(instance == null) {
			instance = new BookDao();
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
	private BookDao() {
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
				System.out.println("ps close 오류");
				e.printStackTrace();
			}
		}
	}
	
	private void closeResultSet() {
		if(resultSet!=null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				System.out.println("rs close 오류");
				e.printStackTrace();
			}
		}
	}
	
	private void closeConnection() {
		if(connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("conn close 오류");
				e.printStackTrace();
			}
		}
	}
	
	public int insert(BookVO book) {
		createConnection();
		String sql = "INSERT INTO BOOKS(TITLE, PUBLISHER, PRICE, YEAR)"
				+" VALUE(?,?,?,?)";
		int result = 0;
		
		try {
			// 미완성 SQL 담아서  PreparedStatement 확보
			preparedStatement = connection.prepareStatement(sql);
			
			// 물음표 자리 데이터 지우기
			preparedStatement.setString(1,  book.getTitle());
			preparedStatement.setString(2, book.getPublisher());
			preparedStatement.setInt(3, book.getPrice());
			preparedStatement.setString(4, book.getYear());
			
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
	
	public List<BookVO> selectAll() {
		List<BookVO> bookList = new ArrayList<>();
		
		createConnection();
		
		String sql = "SELECT BOOK_ID, TITLE, PUBLISHER, PRICE, YEAR FROM BOOKS";
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			int i = 0;
			while(resultSet.next()) {
				BookVO b = new BookVO();
				b.setBookId(resultSet.getInt(1));
				b.setTitle(resultSet.getString(2));
				b.setPublisher(resultSet.getString(3));
				b.setPrice(resultSet.getInt(4));
				b.setYear(resultSet.getString(5));
				
				bookList.add(b);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResultSet();
			closePreparedStatement();
			closeConnection();
		}
		
		return bookList;
	}
}

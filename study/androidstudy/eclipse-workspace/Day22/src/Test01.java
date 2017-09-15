import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

///////////////////////////////////////////////////
//[데이터베이스 자바 프로그래밍 매뉴얼]
//1. 드라이버 로딩
//2. 커넥션 생성
//3. sql 명령어 작성
//4. Statement 또는 PreparedStatement 객체 확보
// 4.1 Statement 쓰는 경우
// 4.2 PreparedStatement 쓰는 경우
//5. 명령어 실행
// 5.1 insert, update, delete 명령어일 때
// 5.2 select 명령어일 때
//6. 결과값 확인 및 가공
//7. 사용한 자원 close 
///////////////////////////////////////////////////

public class Test01 {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
                 
        try {
            // 1. 드라이버 로딩
            Class.forName("com.mysql.jdbc.Driver");
             
            // 2. 커넥션 생성
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java", "root", "sds1501");
             
            // 3. sql 명령어
            String sql = "INSERT INTO BOOKS (TITLE,PUBLISHER,PRICE,YEAR)"+"VALUES('동근동근','찬중찬중',33000,2015)";
             
            // 4. Statement 객체 확보
            stmt = con.createStatement(); // 수레
             
            // 5.1 insert,update,delete : executeUpdate메소드(리턴int)
            int result = stmt.executeUpdate(sql);
            
            // 6. 결과값 확인
            System.out.println("쿼리 수행 결과: "+result);
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 로딩 오류");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        	// 7. 사용한 자원 반납
        	if(stmt != null) {
        		try{stmt.close();} catch(SQLException e){}
        	}
        	if(con != null) {
        		try{con.close();} catch(SQLException e){}
        	}
        }
    }
}
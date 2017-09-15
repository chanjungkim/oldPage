import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
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
public class Test04_Select {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
         
        final String DB_URL = 
                            "jdbc:mysql://127.0.0.1:3306/java";
        final String DB_ID = "root";
        final String DB_PW = "sds1501";
         
        try {
            Class.forName("com.mysql.jdbc.Driver");
             
            con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
             
            String sql = "SELECT BOOK_ID,TITLE,PRICE "
                        + "FROM BOOKS WHERE BOOK_ID=103";
             
            // pstmt는 sql 명령어 먼저 집어넣음 execute 할때 안넣음.
            pstmt = con.prepareStatement(sql);
             
    // sql명령어가 select 일때는 
    // executeUpdate:int가 아닌 executeQuery:ResultSet을 사용함
            rs = pstmt.executeQuery(); 
             
            if(rs.next()==true) {
                //조회결과 있음.
                int bookId = rs.getInt(1);
                String title = rs.getString(2);
                int price = rs.getInt(3);
                System.out.println(bookId+"-"+title+"-"+price);
            }else {
                //조회결과 없음.
                System.out.println("select 조회 결과 없음");
            }           
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 로딩 오류");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 7. 사용한 자원 반납
            if (rs != null) {
                try {rs.close();} catch (SQLException e) {}
            }           
            if (pstmt != null) {
                try {pstmt.close();} catch (SQLException e) {}
            }
            if (con != null) {
                try {con.close();} catch (SQLException e) {}
            }
        }
    }
}
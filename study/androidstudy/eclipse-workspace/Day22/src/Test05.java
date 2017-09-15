import java.sql.*;
 
public class Test05 {
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
             
            String sql = "SELECT BOOK_ID,TITLE,PRICE FROM BOOKS";
             
            // pstmt는 sql 명령어 먼저 집어넣음 execute 할때 안넣음.
            pstmt = con.prepareStatement(sql);
             
    // sql명령어가 select 일때는 
    // executeUpdate:int가 아닌 executeQuery:ResultSet을 사용함
            rs = pstmt.executeQuery(); 
             
            while(rs.next()) {
                //조회결과 있음.
//                int bookId = rs.getInt(1);
//                String title = rs.getString(2);
//                int price = rs.getInt(3);
                System.out.println(rs.getInt(1)+"-"+rs.getString(2)+"-"+rs.getInt(3));
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
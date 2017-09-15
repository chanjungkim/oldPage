import java.sql.*;
import java.util.Scanner;
 
public class Test03 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
         
        try {
            // 1. 드라이버 로딩
            Class.forName("com.mysql.jdbc.Driver");
             
            // 2. 커넥션 생성
            con = 
            DriverManager.getConnection
            ("jdbc:mysql://127.0.0.1:3306/java", "root", "sds1501");
             
            Scanner sc = new Scanner(System.in);
             
            System.out.print("제목:");
            String title = sc.nextLine();
            System.out.print("출판사:");
            String pub = sc.nextLine();
            System.out.print("출판년도:");
            String year = sc.nextLine();
            System.out.print("가격:");
            int price = sc.nextInt();
             
            // 3. sql 명령어
            String sql = 
            "INSERT INTO BOOKS (TITLE,PUBLISHER,PRICE,YEAR)"
            +"VALUES(?,?,?,?)";
             
            // 4.2 PreparedStatement 객체 확보
            pstmt = con.prepareStatement(sql);
             
            pstmt.setString(1, title);
            pstmt.setString(2, pub);
            pstmt.setInt(3, price);
            pstmt.setString(4, year);
             
            // 5.1 insert,update,delete : executeUpdate메소드(리턴int)
            int result = pstmt.executeUpdate();
             
            // 6. 결과값 확인
            System.out.println("쿼리 수행 결과:"+result);
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 로딩 오류");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 7. 사용한 자원 반납
            if(pstmt != null) {
                try {pstmt.close();} catch (SQLException e) {}
            }
            if(con != null) {
                try {con.close();} catch (SQLException e) {}
            }
        }
    }
}
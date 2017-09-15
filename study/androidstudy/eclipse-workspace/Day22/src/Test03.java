import java.sql.*;
import java.util.Scanner;
 
public class Test03 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
         
        try {
            // 1. ����̹� �ε�
            Class.forName("com.mysql.jdbc.Driver");
             
            // 2. Ŀ�ؼ� ����
            con = 
            DriverManager.getConnection
            ("jdbc:mysql://127.0.0.1:3306/java", "root", "sds1501");
             
            Scanner sc = new Scanner(System.in);
             
            System.out.print("����:");
            String title = sc.nextLine();
            System.out.print("���ǻ�:");
            String pub = sc.nextLine();
            System.out.print("���ǳ⵵:");
            String year = sc.nextLine();
            System.out.print("����:");
            int price = sc.nextInt();
             
            // 3. sql ��ɾ�
            String sql = 
            "INSERT INTO BOOKS (TITLE,PUBLISHER,PRICE,YEAR)"
            +"VALUES(?,?,?,?)";
             
            // 4.2 PreparedStatement ��ü Ȯ��
            pstmt = con.prepareStatement(sql);
             
            pstmt.setString(1, title);
            pstmt.setString(2, pub);
            pstmt.setInt(3, price);
            pstmt.setString(4, year);
             
            // 5.1 insert,update,delete : executeUpdate�޼ҵ�(����int)
            int result = pstmt.executeUpdate();
             
            // 6. ����� Ȯ��
            System.out.println("���� ���� ���:"+result);
        } catch (ClassNotFoundException e) {
            System.out.println("����̹� �ε� ����");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 7. ����� �ڿ� �ݳ�
            if(pstmt != null) {
                try {pstmt.close();} catch (SQLException e) {}
            }
            if(con != null) {
                try {con.close();} catch (SQLException e) {}
            }
        }
    }
}
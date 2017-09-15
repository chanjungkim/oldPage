import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
 
public class Test02 {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
         
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
            +"VALUES('"+title+"','"+pub+"',"+price+","+year+")";
             
            // 4. Statement ��ü Ȯ��
            stmt = con.createStatement();
             
            // 5.1 insert,update,delete : executeUpdate�޼ҵ�(����int)
            int result = stmt.executeUpdate(sql);
             
            // 6. ����� Ȯ��
            System.out.println("���� ���� ���:"+result);
        } catch (ClassNotFoundException e) {
            System.out.println("����̹� �ε� ����");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 7. ����� �ڿ� �ݳ�
            if(stmt != null) {
                try {stmt.close();} catch (SQLException e) {}
            }
            if(con != null) {
                try {con.close();} catch (SQLException e) {}
            }
        }
    }
}
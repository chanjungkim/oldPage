package test01_xml;
 
import vo.BookVO;
 
public class Test {
    public static void main(String[] args) {
        BookDao dao = new BookDao();
         
        BookVO book = new BookVO();
        book.setjTitle("�ڹ�");
        book.setjPublisher("SDS ���ǻ�");
        book.setjWriter("������");
        book.setjPrice(25000);
         
        System.out.println("insert ���:"+dao.insertBook(book));
         
        for(BookVO b: dao.selectList()) {
            System.out.println(b);
        }       
    }
}
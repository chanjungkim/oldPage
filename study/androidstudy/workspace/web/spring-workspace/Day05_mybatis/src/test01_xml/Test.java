package test01_xml;
 
import vo.BookVO;
 
public class Test {
    public static void main(String[] args) {
        BookDao dao = new BookDao();
         
        BookVO book = new BookVO();
        book.setjTitle("자바");
        book.setjPublisher("SDS 출판사");
        book.setjWriter("양유진");
        book.setjPrice(25000);
         
        System.out.println("insert 결과:"+dao.insertBook(book));
         
        for(BookVO b: dao.selectList()) {
            System.out.println(b);
        }       
    }
}
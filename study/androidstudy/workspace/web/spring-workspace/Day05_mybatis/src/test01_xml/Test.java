package test01_xml;
 
public class Test {
    public static void main(String[] args) {
        BookDao dao = new BookDao();
         
        BookVO book = new BookVO();
        book.setTitle("자바의 정석");
        book.setPublisher("SDS 출판사");
        book.setWriter("양유진");
        book.setPrice(25000);
         
        System.out.println("insert 결과:"+dao.insertBook(book));
         
        for(BookVO b: dao.selectList()) {
            System.out.println(b);
        }
         
         
    }
}
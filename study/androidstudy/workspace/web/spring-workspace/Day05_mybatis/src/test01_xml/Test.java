package test01_xml;
 
public class Test {
    public static void main(String[] args) {
        BookDao dao = new BookDao();
         
        BookVO book = new BookVO();
        book.setTitle("�ڹ��� ����");
        book.setPublisher("SDS ���ǻ�");
        book.setWriter("������");
        book.setPrice(25000);
         
        System.out.println("insert ���:"+dao.insertBook(book));
         
        for(BookVO b: dao.selectList()) {
            System.out.println(b);
        }
         
         
    }
}
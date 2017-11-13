import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import repository.BookDao;
import vo.BookVO;
 
public class Test {
    public static void main(String[] args) {
        // �Ʒ�ó�� new �ع����� Dao�� �����ϴ� 
        // SqlSessionTemplate ��ü�� ���� Dao�� ������.
        // �װ� �����.......
//      BookDao dao = new BookDao();
         
        ClassPathXmlApplicationContext context = 
                new ClassPathXmlApplicationContext
                        ("applicationContext.xml");             
        BookDao dao = context.getBean("dao", BookDao.class);
         
        for(BookVO b: dao.selectBookList()) {
            System.out.println(b);
        }
        BookVO book = new BookVO();
        book.setjTitle("���ο� å");
        book.setjPrice(10000);
        book.setjPublisher("���ǻ� ���");
        book.setjWriter("���� ����");
        
        System.out.println(dao.insert(book));
        System.out.println(book.getjBookNum());
    }
}
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import repository.BookDao;
import vo.BookVO;
 
public class Test {
    public static void main(String[] args) {
        // 아래처럼 new 해버리면 Dao가 의존하는 
        // SqlSessionTemplate 객체가 없는 Dao가 생성됨.
        // 그걸 어따써.......
//      BookDao dao = new BookDao();
         
        ClassPathXmlApplicationContext context = 
                new ClassPathXmlApplicationContext
                        ("applicationContext.xml");             
        BookDao dao = context.getBean("dao", BookDao.class);
         
        for(BookVO b: dao.selectBookList()) {
            System.out.println(b);
        }
        BookVO book = new BookVO();
        book.setjTitle("새로운 책");
        book.setjPrice(10000);
        book.setjPublisher("출판사 어디");
        book.setjWriter("저자 누구");
        
        System.out.println(dao.insert(book));
        System.out.println(book.getjBookNum());
    }
}
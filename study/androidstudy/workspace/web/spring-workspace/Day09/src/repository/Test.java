package repository;
 
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = 
            new ClassPathXmlApplicationContext("applicationContext.xml");
         
        BookService service = context.getBean(BookService.class);
         
        System.out.println
        ("å ��Ʈ �߰�:"+service.addBookSet());
    }
}
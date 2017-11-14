package test03;
 
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Test {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = 
                new ClassPathXmlApplicationContext
                    ("test03/applicationContext.xml");
         
//      Person p = context.getBean("boy", Person.class);
        Person p = context.getBean("ggg", Person.class);
        p.doSomething();
    }
}
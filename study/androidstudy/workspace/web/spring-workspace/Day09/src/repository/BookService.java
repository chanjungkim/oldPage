package repository;
 
import java.sql.SQLException;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
 
import vo.BookVO;
 
@Component("service")
public class BookService {
    @Autowired
    private BookDao dao;
    public void setDao(BookDao dao) {
        this.dao = dao;
    }
////////////////////////////////////////////////////
    @Transactional
    public boolean addBookSet() {
        boolean result = false;
 
        BookVO book = new BookVO("트랜잭션", "양유", 1000, "멀티캠퍼스");
        BookVO book2 = new BookVO("[부록]트랜잭션", "양유", 1000, "멀티캠퍼스");
 
        int result1 = dao.insert(book);
        System.out.println("첫번째 insert:"+result1);
     
        int n = 1/0; // 의도적 에러 발생
         
        int result2 = dao.insert(book2);
        System.out.println("두번째 insert:"+result1);
         
        if(result1>0 && result2>0)
            result = true;
        return result;
    }
}
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
 
        BookVO book = new BookVO("Ʈ�����", "����", 1000, "��Ƽķ�۽�");
        BookVO book2 = new BookVO("[�η�]Ʈ�����", "����", 1000, "��Ƽķ�۽�");
 
        int result1 = dao.insert(book);
        System.out.println("ù��° insert:"+result1);
     
        int n = 1/0; // �ǵ��� ���� �߻�
         
        int result2 = dao.insert(book2);
        System.out.println("�ι�° insert:"+result1);
         
        if(result1>0 && result2>0)
            result = true;
        return result;
    }
}
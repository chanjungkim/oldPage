package repository;
 
import java.util.List;
 
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
import repository.mapper.BookMapper;
import vo.BookVO;
 
@Component("dao")
public class BookDao {
    @Autowired
    private SqlSessionTemplate session;
     
    public void setSession(SqlSessionTemplate session) {
        this.session = session;
    }
////////////////////////////////////////////////////////
    public int insert(BookVO book) {
        BookMapper mapper = 
                session.getMapper(BookMapper.class);
        return mapper.insert(book);
    }
     
    public List<BookVO> selectBookList(){
        BookMapper mapper = 
                session.getMapper(BookMapper.class);
        return mapper.selectAll();
    }
}
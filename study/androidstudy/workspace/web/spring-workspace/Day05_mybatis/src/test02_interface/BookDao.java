package test02_interface;
 
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import vo.BookVO;
 
public class BookDao {
    private SqlSessionFactory factory;
     
    public BookDao() {
        // 마이바티스 설정파일 읽어들이기
        String resource = "test02_interface/conf.xml";
        InputStream is = null;
 
        try {
            is = Resources.getResourceAsStream(resource);
            factory = new SqlSessionFactoryBuilder()
                                            .build(is);
        } catch (IOException ex) {
            System.out.println("마이바티스 설정파일 에러");
            ex.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
 
    public int insertBook(BookVO book) {
        SqlSession session = factory.openSession(true);
        BookMapper mapper = session.getMapper(BookMapper.class);
        return session.insert("yyj.insert", book);
    }
     
    public List<BookVO> selectList(){
        SqlSession session = factory.openSession();
        BookMapper mapper = session.getMapper(BookMapper.class);
        return session.selectList("yyj.selectList");
    }
     
    public BookVO select(int bookNum) {
        SqlSession session = factory.openSession();
        BookMapper mapper = session.getMapper(BookMapper.class);
        return mapper.selectBook(bookNum);
    }
}
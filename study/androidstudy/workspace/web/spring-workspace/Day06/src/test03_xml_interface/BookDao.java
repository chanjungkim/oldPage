package test03_xml_interface;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import vo.BookVO;

public class BookDao {
	private SqlSessionFactory factory;
	
	public BookDao() {
		String resource = " test03_xml_interface";
	}

	public int insertBook(BookVO book) {
		SqlSession session = factory.openSession(true);
		BookMapper mapper = session.getMapper(BookMapper.class);
		return mapper.insert(book);
	}
	
	public List<BookVO> select(){
		SqlSession session = factory.openSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		session.i
		return mapper.selectList();
	}

}

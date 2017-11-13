package repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.mapper.BoardMapper;
import vo.ArticleVO;

@Component("dao")
public class BoardDao {
	@Autowired
	private SqlSessionTemplate session;
	
	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}
	
	public int insert(ArticleVO article) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.insert(article);
	}

	public List<ArticleVO> selectPage(int pageNum) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.selectPage(pageNum);
	}
	
	public List<ArticleVO> selectAll(){
		System.out.println("called selectAll");
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.selectAll();
	}
	
	public ArticleVO select(int article_num) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.select(article_num);
	}
	
	public ArticleVO update(int article_num) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.select(article_num);
	}
}

package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.BoardDao;
import vo.ArticleVO;

@Component
public class BoardService {
	
	@Autowired
	private BoardDao dao;
	
	public void setDao(BoardDao dao) {
		System.out.println("BoardService got a BoardDao Object");
		this.dao = dao;
	}
	
	//////////////////////////////////////////////
	
//	int one_page = 10;
	
	public List<ArticleVO> selectAll() {
//		int start_num = 0;
		System.out.println("service called selectAll()");
		return dao.selectAll();
	}
}

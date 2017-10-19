package service;

import java.util.Date;
import java.util.List;

import dao.BoardDao;
import vo.Article;
import vo.ArticlePage;

public class BoardService {
	private BoardDao dao = BoardDao.getInstance();
////////////////////////////////////////////////////////////	
	// singleton 패턴 적용
	private static BoardService instance = new BoardService();
	public static BoardService getInstance() {
		return instance;
	}
	private BoardService() {}
/////////////////////////////////////////////////////////////
	private static final int COUNT_PER_PAGE=10;
	public ArticlePage makePage(int page) {
		// 총 게시글의 갯수 DB 에서 조회
		int totalArticleCount = dao.selectArticleCount();

		// 총 페이지 수 계산
		int totalPage = totalArticleCount / COUNT_PER_PAGE;
		if (totalArticleCount % COUNT_PER_PAGE > 0) {
			totalPage++;
		}

		// 하단 시작 페이지
		int startPage = (page - 1) / 10 * 10 + 1;

		// 하단 끝 페이지
		int endPage = startPage + 9;
		if (endPage > totalPage) {
			endPage = totalPage;
		}

		// limit 시작행 계산
		int startRow = (page - 1) * COUNT_PER_PAGE;

		// DB 에서 현재 페이지에 보여질 게시글들 조회
		List<Article> articleList = dao.selectArticleList(startRow, COUNT_PER_PAGE);

		// 한 페이지에 보여질 모든 데이터 담아서 작업 완료
		return new ArticlePage
			(articleList, startPage, endPage, page, totalPage);
	}
	
	public boolean write(Article article) {
		article.setWriteTime(new Date());
		article.setReadCount(0);
		if(dao.insert(article)>0)
			return true;
		else
			return false;
	}
	
	public Article read(String loginId, int articleNum) {
		Article article = dao.select(articleNum);
		if(article==null || article.getWriter().equals(loginId)) {
			return article;
		} else {
			dao.updateReadCount(articleNum);
			article.setReadCount(article.getReadCount()+1);
			return article;
		}
	}
}








package service;

import java.util.Date;
import java.util.List;

import dao.BoardDao;
import vo.Article;
import vo.ArticlePageVO;

public class BoardService {
	private static final int COUNT_PER_PAGE = 10;

	private BoardDao dao = BoardDao.getInstance();
///////////////////////////////////////////////////////////

	private static BoardService instance = new BoardService();
	public static BoardService getInstance() {
		return instance;
	}
	private BoardService() {}
///////////////////////////////////////////////////////////	

	public ArticlePageVO makeArticlePage(int page) {
		int totalArticleCount = dao.selectArticleCount();
		int totalPage = totalArticleCount / COUNT_PER_PAGE;
		if(totalArticleCount%COUNT_PER_PAGE>0) {
			totalPage++;
		}
		
		// �ϴ� ���� ������
		int startPage = (page-1)/10*10 + 1;
		
		// �ϴ� �� ������
		int endPage = startPage+9;
		if(endPage>totalPage) {
			endPage = totalPage;
		}
		
		// limit ������ ���
		int startRow = (page-1)*10;
		
		// DB ���� ���� �������� ������ �Խñ۵� ��ȸ
		List<Article> articleList = 
			dao.selectArticleList(startRow, COUNT_PER_PAGE);
		
		// �� �������� ������ ��� ������ ��Ƽ� �۾� �Ϸ�
		return new ArticlePageVO
			(articleList, startPage, endPage, totalPage, page);
	}

	// ������ ������ �̿ϼ� article�� ������ �� ä���� DB���߰�
	public boolean writeArticle(Article article) {
		article.setReadCount(0);
		article.setWriteDate(new Date());
		
		// dao ���� �߰��۾� ��ų ����
		int insertResult = dao.insert(article);
		if(insertResult==1) {
			return true;
		}else {
			return false;
		}		
	}


	public Article readAndReadCount(int articleNum) {
		Article article = null;
		if(dao.updateReadCount(articleNum)==1) {

			article = dao.select(articleNum);
		}
		return article;
	}
	

	public Article readWithoutReadCount(int articleNum) {
		return dao.select(articleNum);
	}
	

	public boolean idCheckUpdate(Article updateArticle) {
		updateArticle.setWriteDate(new Date());
		

		if(dao.update(updateArticle)==1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean delete(int articleNum) {
		if(dao.delete(articleNum)==1) {
			return true;
		}else {
			return false;
		}
	}
}







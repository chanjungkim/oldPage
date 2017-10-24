package vo;

import java.util.List;

// �Խ��� ��Ϻ��⿡�� �� ȭ�鿡 ������ ������
public class ArticlePageVO {
	private List<Article> articleList;	// ������ �Խñ� ��ü
	private int startPage;	// ȭ�� �ϴ��� ���� ������
	private int endPage;	// ȭ�� �ϴ��� �� ������
	private int totalPage;	// �� ������ ��
	private int requestPage;// ���� �����ִ� ��û������
//////////////////////////////////////////////////////////
	public ArticlePageVO(List<Article> articleList, int startPage, int endPage, int totalPage, int requestPage) {
		this.articleList = articleList;
		this.startPage = startPage;
		this.endPage = endPage;
		this.totalPage = totalPage;
		this.requestPage = requestPage;
	}
	public ArticlePageVO() {
	}
//////////////////////////////////////////////////////////	
	public List<Article> getArticleList() {
		return articleList;
	}
	
	public void setArticleList(List<Article> articleList) {
		this.articleList = articleList;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getRequestPage() {
		return requestPage;
	}
	public void setRequestPage(int requestPage) {
		this.requestPage = requestPage;
	}
////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		return "ArticlePageVO [articleList=" + articleList + ", startPage=" + startPage + ", endPage=" + endPage
				+ ", totalPage=" + totalPage + ", requestPage=" + requestPage + "]";
	}
}

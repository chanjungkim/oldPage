package vo;

import java.sql.Timestamp;
import java.util.Date;

public class ArticleVO {
//	글번호, 게시날짜, 조회수, 작성자이름, 비밀번호, 제목, 내용
	private int jArticleNum;
	private Timestamp jDate;
	private int jView;
	private String jWriter;
	private String jPassword;
	private String jTitle;
	private String jContents;
	
	public ArticleVO() {
	}
	
	public ArticleVO(String jWriter, String jPassword, String jTitle, String jContents) {
		this.jDate = new Timestamp(System.currentTimeMillis());
		System.out.println("생성 날짜:"+jDate);
		this.jWriter = jWriter;
		this.jPassword = jPassword;
		this.jTitle = jTitle;
		this.jContents = jContents;
	}
	
	public ArticleVO(int jArticleNum, Timestamp jDate, int jView, String jWriter, String jPassword, String jTitle, String jContents) {
		this.jArticleNum = jArticleNum;
		this.jDate = jDate;
		this.jView = jView;
		this.jWriter = jWriter;
		this.jPassword = jPassword;
		this.jTitle = jTitle;
		this.jContents = jContents;
	}
	
	public int getjArticleNum() {
		return jArticleNum;
	}
	public void setjArticleNum(int jArticleNum) {
		this.jArticleNum = jArticleNum;
	}
	public String getjTitle() {
		return jTitle;
	}
	public void setjTitle(String jTitle) {
		this.jTitle = jTitle;
	}
	public String getjWriter() {
		return jWriter;
	}
	public void setjWriter(String jWriter) {
		this.jWriter = jWriter;
	}
	public Date getjDate() {
		return jDate;
	}
	public void setjDate(Timestamp jDate) {
		this.jDate = jDate;
	}
	public String getjContents() {
		return jContents;
	}
	public void setjContents(String jContents) {
		this.jContents = jContents;
	}
	public int getjView() {
		return jView;
	}
	public void setjView(int jView) {
		this.jView = jView;
	}
	
	public String getjPassword() {
		return jPassword;
	}
	public void setjPassword(String jPassword) {
		this.jPassword = jPassword;
	}
	@Override
	public String toString() {
		return "ArticleVO [jArticleNum=" + jArticleNum + ", jTitle=" + jTitle + ", jWriter=" + jWriter + ", jDate=" + jDate
				+ ", jPassword=" + jPassword + ", jContents=" + jContents + ", jView=" + jView + "]";
	}
	
	
	
}

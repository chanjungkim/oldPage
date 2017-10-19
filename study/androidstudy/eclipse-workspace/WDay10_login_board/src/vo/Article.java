package vo;

import java.util.Date;

public class Article {
	private int articleNum;
	private String title;
	private String writer;
	private int readCount;
	private Date writeTime;
	private String contents;
///////////////////////////////////////////////////////////	
	public Article(int articleNum, String title, String writer, int readCount, Date writeTime, String contents) {
		this.articleNum = articleNum;
		this.title = title;
		this.writer = writer;
		this.readCount = readCount;
		this.writeTime = writeTime;
		this.contents = contents;
	}
	public Article() {}
///////////////////////////////////////////////////////////	
	public int getArticleNum() {
		return articleNum;
	}
	public void setArticleNum(int articleNum) {
		this.articleNum = articleNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	public Date getWriteTime() {
		return writeTime;
	}
	public void setWriteTime(Date writeTime) {
		this.writeTime = writeTime;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
///////////////////////////////////////////////////////////	
	@Override
	public String toString() {
		return "Article [articleNum=" + articleNum + ", title=" + title + ", writer=" + writer + ", readCount="
				+ readCount + ", writeTime=" + writeTime + ", contents=" + contents + "]";
	}
}

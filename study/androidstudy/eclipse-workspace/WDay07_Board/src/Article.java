import java.sql.Timestamp;

public class Article {
	private int articleNum;
	private String title;
	private String writer;
	private int readCount;
	private String contents;
	private String password;
	private Timestamp writeDate;
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
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Timestamp getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Timestamp writeDate) {
		this.writeDate = writeDate;
	}
	@Override
	public String toString() {
		return "Article [articleNum=" + articleNum + ", title=" + title + ", writer=" + writer + ", readCount="
				+ readCount + ", contents=" + contents + ", password=" + password + ", writeDate=" + writeDate + "]";
	}
}

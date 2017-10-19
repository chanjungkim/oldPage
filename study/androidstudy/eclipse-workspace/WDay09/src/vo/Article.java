package vo;

import java.sql.Timestamp;
import java.util.Date;

// �Խñ� VO Ŭ����
public class Article {
	private int article_num;	// �� ��ȣ
	private String title;		// �� ����
	private String writer;		// �ۼ���
	private int readCount;		// ��ȸ��
	private String contents;	// �� ����
	private String password;	// �� ��й�ȣ
	private Date writeDate;		// �ۼ��Ͻ�
/////////////////////////////////////////////////////////
	// ������
	public Article(int aritlcleNum, String title, String writer, int readCount, String contents, String password,
			Timestamp writeDate) {
		this.article_num = aritlcleNum;
		this.title = title;
		this.writer = writer;
		this.readCount = readCount;
		this.contents = contents;
		this.password = password;
		this.writeDate = writeDate;
	}
	public Article() {
	}
//////////////////////////////////////////////////////////	
	public int getAritlcleNum() {
		return article_num;
	}
	public void setAritlcleNum(int aritlcleNum) {
		this.article_num = aritlcleNum;
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
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
///////////////////////////////////////////////////////////	
	@Override
	public String toString() {
		return "Article [aritlcleNum=" + article_num + ", title=" + title + ", writer=" + writer + ", readCount="
				+ readCount + ", contents=" + contents + ", password=" + password + ", writeDate=" + writeDate + "]";
	}	
}

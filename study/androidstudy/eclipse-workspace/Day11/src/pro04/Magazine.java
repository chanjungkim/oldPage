package pro04;

public class Magazine extends Book{
	private String publishedAt;
	
	public Magazine(String title, String numOfPages, String author, String publishedAt) {
		super(title, numOfPages, author);
		this.publishedAt = publishedAt;
	}
	public void setPublishedAt(String publishedAt) {
		this.publishedAt = publishedAt;
	}
	public String getPublishedAt(){
		return this.publishedAt;
	}
	public String toString() {
		return "제목: "+super.getTitle()+"\n페이지수: "+super.getNumOfPages()+"\n저자: "+super.getAuthor()
		+"\n출판일: "+this.publishedAt;
	}
	public static void main(String[] args) {
		Magazine mg = new Magazine("별주부전", "70", "토끼", "2007. 05. 05");
		
		System.out.println(mg);
	}
}

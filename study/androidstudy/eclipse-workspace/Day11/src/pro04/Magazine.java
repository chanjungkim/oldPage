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
		return "����: "+super.getTitle()+"\n��������: "+super.getNumOfPages()+"\n����: "+super.getAuthor()
		+"\n������: "+this.publishedAt;
	}
	public static void main(String[] args) {
		Magazine mg = new Magazine("���ֺ���", "70", "�䳢", "2007. 05. 05");
		
		System.out.println(mg);
	}
}

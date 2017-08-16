package pro04;

public class Book {
	private String title;
	private String numOfPages;
	private String author;
	
	public Book() {
		this("È«±æµ¿Àü", "10", "È«±æµ¿");
	}
	public Book(String title, String numOfPages, String author) {
		this.title = title;
		this.author = author;
		this.numOfPages = numOfPages;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setNumOfPages(String numOfPages) {
		this.numOfPages = numOfPages;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public String getNumOfPages() {
		return numOfPages;
	}
	public String getAuthor() {
		return author;
	}
}

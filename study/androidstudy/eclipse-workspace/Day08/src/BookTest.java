class Book {
	private String title, author;
	
	void setTitle(String name) {
		title = name;
	}
	void setAuthor(String name) {
		author = name;
	}
	String getTitle() {
		return title;
	}
	String getAuthor() {
		return author;
	}
}
public class BookTest{
	public static void main(String[] args) {
		Book bk = new Book();
		bk.setTitle("Chiup");
		bk.setAuthor("Hgosipo");
	}
}
package test01_xml;

public class BookVO {
	private int book_num;
	private String title;
	private String publisher;
	private String writer;
	private int price;
	
	public BookVO() {
	}
	
	public BookVO(int book_num, String title, String publisher, String writer, int price) {
		this.book_num = book_num;
		this.title = title;
		this.publisher = publisher;
		this.writer = writer;
		this.price = price;
	}
	
	public int getBookNum() {
		return book_num;
	}
	public void setBook_num(int book_num) {
		this.book_num = book_num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BookVO [BookNum=" + book_num + ", Title=" + title + ", Publisher=" + publisher + ", Writer="
				+ writer + ", Price=" + price + "]";
	}
}

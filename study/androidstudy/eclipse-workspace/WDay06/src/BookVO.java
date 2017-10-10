

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class BookVO
 */
@WebServlet("/BookVO")
public class BookVO extends HttpServlet {
	private int bookId;
	private String title;
	private String publisher;
	private int price;
	private String year;
	private static int counter = 0;
////////////////////////////////////////////////////////
////////////////////////////////////////////////////////
	private static final long serialVersionUID = 1L;
	
	public BookVO() {
		this(-1, null, null, -1, null);
		bookId=counter++;
	}
	
	public BookVO(String title, String publisher, int price, String year) {
		this(0, title, publisher, price, year);
	}
	
	public BookVO(int bookId, String title, String publisher, int price, String year) {
		this.bookId = bookId;
		this.title = title;
		this.publisher = publisher;
		this.price = price;
		this.year = year;
	}
		
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "BookVO [bookId=" + bookId + ", title=" + title + ", publisher=" + publisher + ", price=" + price
				+ ", year=" + year + "]";
	}
}

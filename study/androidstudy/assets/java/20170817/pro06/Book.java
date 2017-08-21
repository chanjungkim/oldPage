package pro06;

public class Book {
	private String number;
	private String title;
	private String author;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String toString() {
		return "������ȣ: "+this.number+" ����: "+this.title+" ����: "+this.author+" ";
	}
	@Override
	public boolean equals(Object obj) {
		if(((Book)obj).getNumber() == this.getNumber()) {
			return true;
		}
		return false;
	}
}

package test01_jdbc;

import vo.BookVO;

public class Test {
	public static void main(String[] args) {
		BookDao dao = new BookDao();
		
		BookVO book = new BookVO("제목3", "양유", 25000, "삼성SDS");
		int result = dao.insertBook(book);
		System.out.println("insert result:"+result);
		
		for(BookVO b: dao.selectAll()) {
			System.out.println(b);
		}
	}
}

package test02_spring;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import vo.BookVO;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가격:");
		int price = sc.nextInt();
		System.out.print("책 제목:");
		String title = sc.next();
		System.out.print("글쓴이:");
		String writer = sc.next();
		System.out.print("출판사:");
		String publisher = sc.next();
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test02_spring/applicationContext.xml");
		
		BookDaoSpring dao = context.getBean("dao", BookDaoSpring.class);
				
		BookVO book = new BookVO(title, writer, price, publisher);
		System.out.println("insert 결과"+dao.insert(book));
		
		List<BookVO> bookList = dao.selectBookList();
		for(BookVO b : bookList) {
			System.out.println(b);
		}
	}			
}

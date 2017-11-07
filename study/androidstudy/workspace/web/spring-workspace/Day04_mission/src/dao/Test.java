package dao;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("dao/applicationContext.xml");
		BookDao dao = context.getBean("dao",BookDao.class);
		BookVO book = new BookVO("홍길동이","홍길동", 3000, "홍길동출판");
		
		System.out.println("insert 결과: "+dao.insert(book));
		List<BookVO> list = dao.selectAll();
		for(BookVO b : list) {
			System.out.println(b);
		}
		System.out.println("update 결과: "+dao.updatePrice(book, 5000));
		list = dao.selectAll();
		for(BookVO b : list) {
			System.out.println(b);
		}
		System.out.print("검색할 책 번호: ");
		System.out.println(dao.selectByNum(sc.nextInt()));
		System.out.print("검색할 책 제목: ");
		System.out.println(dao.selectByTitle(sc.next()));
		System.out.print("삭제할 책 번호: ");
		System.out.println(dao.deleteByNum(sc.nextInt()));
		list = dao.selectAll();
		for(BookVO b : list) {
			System.out.println(b);
		}
		System.out.print("삭제할 책 제목: ");
		System.out.println(dao.deleteByTitle(sc.next()));
		list = dao.selectAll();
		for(BookVO b : list) {
			System.out.println(b);
		}
	}
}

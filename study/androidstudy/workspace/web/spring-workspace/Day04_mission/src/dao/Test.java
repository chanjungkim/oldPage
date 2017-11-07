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
		BookVO book = new BookVO("ȫ�浿��","ȫ�浿", 3000, "ȫ�浿����");
		
		System.out.println("insert ���: "+dao.insert(book));
		List<BookVO> list = dao.selectAll();
		for(BookVO b : list) {
			System.out.println(b);
		}
		System.out.println("update ���: "+dao.updatePrice(book, 5000));
		list = dao.selectAll();
		for(BookVO b : list) {
			System.out.println(b);
		}
		System.out.print("�˻��� å ��ȣ: ");
		System.out.println(dao.selectByNum(sc.nextInt()));
		System.out.print("�˻��� å ����: ");
		System.out.println(dao.selectByTitle(sc.next()));
		System.out.print("������ å ��ȣ: ");
		System.out.println(dao.deleteByNum(sc.nextInt()));
		list = dao.selectAll();
		for(BookVO b : list) {
			System.out.println(b);
		}
		System.out.print("������ å ����: ");
		System.out.println(dao.deleteByTitle(sc.next()));
		list = dao.selectAll();
		for(BookVO b : list) {
			System.out.println(b);
		}
	}
}

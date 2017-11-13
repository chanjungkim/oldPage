import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import repository.BoardDao;
import service.BoardService;
import vo.ArticleVO;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println(Math.pow(2, 80));
//		BoardDao dao = context.getBean(BoardDao.class);
		BoardService service = context.getBean(BoardService.class);
		
		System.out.println("- �ܼ� �Խ��� ���α׷� ���� -");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.�� ��Ϻ���(��������ȣ �Է�) 2.�� ���� 3.�� �б�(�� ��ȣ �Է�) 4.�� ���� �����ϱ� 5.�� �����ϱ�");
			System.out.println("select>>");
			
			int select = sc.nextInt();
			
			if(select == -1)
				break;
			
			switch(select) {
			case 1 :
				for (ArticleVO a : service.selectAll()) {
					System.out.println(a.getjArticleNum()+"|"+a.getjTitle()+"|"+a.getjWriter()+"|"+a.getjDate()+"|"+a.getjView());
				}
				break;
			case 2 : 
//				String title;
//				String writer;
//				String contents;
//				String password;
//				ArticleVO article = null;
//				
//				System.out.print("���� �Է�:");
//				title=sc.next();
//				System.out.print("�۾���:");
//				writer=sc.next();
//				System.out.print("����:");
//				contents=sc.next();
//				System.out.println("��й�ȣ:");
//				password=sc.next();
//				
//				article = new ArticleVO(title, writer, contents, password);
//				if(dao.insert(article) > 0) {
//					System.out.println("�� �ۼ� �Ϸ�!");
//				}else {
//					System.out.println("�� �ۼ� ����");
//				}
			}
		}
		sc.close();
		System.out.println("= �ܼ� ���α׷� ���� =");
	}
}

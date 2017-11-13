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
		
		System.out.println("- 콘솔 게시판 프로그램 시작 -");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.글 목록보기(페이지번호 입력) 2.글 쓰기 3.글 읽기(글 번호 입력) 4.글 내용 수정하기 5.글 삭제하기");
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
//				System.out.print("제목 입력:");
//				title=sc.next();
//				System.out.print("글쓴이:");
//				writer=sc.next();
//				System.out.print("내용:");
//				contents=sc.next();
//				System.out.println("비밀번호:");
//				password=sc.next();
//				
//				article = new ArticleVO(title, writer, contents, password);
//				if(dao.insert(article) > 0) {
//					System.out.println("글 작성 완료!");
//				}else {
//					System.out.println("글 작성 실패");
//				}
			}
		}
		sc.close();
		System.out.println("= 콘솔 프로그램 종료 =");
	}
}

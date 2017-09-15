package test02;
 
import java.util.List;
import java.util.Scanner;
 
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookVO book = null;
        BookDao dao = new BookDao();
         
        while(true) {
            System.out.println
                ("--메뉴중 하나를 선택하세요.--");
            System.out.println
                ("1:책추가 2:책검색 3:책목록보기 -1:종료");
            System.out.print
                ("select>>");
            int select = sc.nextInt();
             
            if(select == -1) // -1 종료
                break;
             
            switch(select) {
            case 1:// 책 추가
                sc.nextLine(); // 스캐너 버그때문에 의미없이 추가
                book = new BookVO();
                System.out.print("제목:");
                book.setTitle(sc.nextLine());
                System.out.print("출판사:");
                book.setPublisher(sc.nextLine());
                System.out.print("출판년도:");
                book.setYear(sc.nextLine());
                System.out.print("가격:");
                book.setPrice(sc.nextInt());
                 
                System.out.println
                ("책추가 결과:"+ dao.insertBook(book));
                break;
            case 2:// 책 검색
                System.out.print("검색할 책 번호:");
                int inputNum = sc.nextInt();
                 
                System.out.println
                ("검색결과:" + dao.selectBook(inputNum));
                break;
            case 3:// 책 목록보기
            	List<BookVO> bookList = dao.selectBookList();
            	System.out.println("-- 목록 시작 --");
            	for(BookVO b : bookList) {
            		System.out.println(b);
            	}
            	System.out.println("-- 목록 끝 --");
                break;
            }
        }// end while
        System.out.println("책 관리 프로그램을 종료합니다.bye");     
    }
}
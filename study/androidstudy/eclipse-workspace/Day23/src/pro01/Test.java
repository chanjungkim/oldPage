package pro01;
 
import java.util.List;
import java.util.Scanner;
 
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookVO book = null;
        BookDAO dao = new BookDAO();
         
        while(true) {
            System.out.println("--메뉴중 하나를 선택하세요.--");
            System.out.println("1:책 추가 2:책 수정 3:책 삭제 4:책 번호 검색 5:책 제목 검색 6:목록보기 -1:종료");
            System.out.print("select>>");
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
            case 2:// 책 수정
                System.out.print("수정할 책 제목:");
                sc.nextLine();
                String titleToEdit = sc.nextLine();
                System.out.print("변경할 가격: ");
                int priceToChange = sc.nextInt();
                System.out.println("수정된 결과:" + dao.editBookInfo(titleToEdit, priceToChange));
                break;
            case 3:// 책 삭제
                System.out.print("삭제할 책 제목:");
                sc.nextLine();
                String titleToDelete = sc.nextLine();
                System.out.print("정말로 "+titleToDelete+"을(를) 삭제하시겠습니까? YES:1 NO:0");
                int answer = sc.nextInt();
                if(answer == 1) {
                	dao.deleteBookByTitle(titleToDelete);
                    System.out.println(titleToDelete+"을(를) 삭제 하였습니다.");
                }else {
                	System.out.println("삭제 취소");
                }
            	break;
            case 4:// 책 검색(번호로)
                System.out.print("검색할 책 번호:");
                int inputNum = sc.nextInt();
                 
                System.out.println("검색결과:" + dao.findBookById(inputNum));
                break;
            case 5://책 제목 검색
                System.out.print("검색할 책 제목:");
                sc.nextLine();
                String inputTitle = sc.nextLine();
                 
                System.out.println("검색결과:" + dao.findBookByTitle(inputTitle));            	
            	break;
            case 6:// 책 목록보기
            	List<BookVO> bookList = dao.bookList();
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
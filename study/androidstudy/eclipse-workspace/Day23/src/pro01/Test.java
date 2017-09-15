package pro01;
 
import java.util.List;
import java.util.Scanner;
 
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookVO book = null;
        BookDAO dao = new BookDAO();
         
        while(true) {
            System.out.println("--�޴��� �ϳ��� �����ϼ���.--");
            System.out.println("1:å �߰� 2:å ���� 3:å ���� 4:å ��ȣ �˻� 5:å ���� �˻� 6:��Ϻ��� -1:����");
            System.out.print("select>>");
            int select = sc.nextInt();
             
            if(select == -1) // -1 ����
                break;
             
            switch(select) {
            case 1:// å �߰�
                sc.nextLine(); // ��ĳ�� ���׶����� �ǹ̾��� �߰�
                book = new BookVO();
                System.out.print("����:");
                book.setTitle(sc.nextLine());
                System.out.print("���ǻ�:");
                book.setPublisher(sc.nextLine());
                System.out.print("���ǳ⵵:");
                book.setYear(sc.nextLine());
                System.out.print("����:");
                book.setPrice(sc.nextInt());
                 
                System.out.println
                ("å�߰� ���:"+ dao.insertBook(book));
                break;
            case 2:// å ����
                System.out.print("������ å ����:");
                sc.nextLine();
                String titleToEdit = sc.nextLine();
                System.out.print("������ ����: ");
                int priceToChange = sc.nextInt();
                System.out.println("������ ���:" + dao.editBookInfo(titleToEdit, priceToChange));
                break;
            case 3:// å ����
                System.out.print("������ å ����:");
                sc.nextLine();
                String titleToDelete = sc.nextLine();
                System.out.print("������ "+titleToDelete+"��(��) �����Ͻðڽ��ϱ�? YES:1 NO:0");
                int answer = sc.nextInt();
                if(answer == 1) {
                	dao.deleteBookByTitle(titleToDelete);
                    System.out.println(titleToDelete+"��(��) ���� �Ͽ����ϴ�.");
                }else {
                	System.out.println("���� ���");
                }
            	break;
            case 4:// å �˻�(��ȣ��)
                System.out.print("�˻��� å ��ȣ:");
                int inputNum = sc.nextInt();
                 
                System.out.println("�˻����:" + dao.findBookById(inputNum));
                break;
            case 5://å ���� �˻�
                System.out.print("�˻��� å ����:");
                sc.nextLine();
                String inputTitle = sc.nextLine();
                 
                System.out.println("�˻����:" + dao.findBookByTitle(inputTitle));            	
            	break;
            case 6:// å ��Ϻ���
            	List<BookVO> bookList = dao.bookList();
            	System.out.println("-- ��� ���� --");
            	for(BookVO b : bookList) {
            		System.out.println(b);
            	}
            	System.out.println("-- ��� �� --");
                break;
            }
        }// end while
        System.out.println("å ���� ���α׷��� �����մϴ�.bye");     
    }
}
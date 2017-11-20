package service;
 
import java.util.Date;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
import repository.BoardDao;
import vo.BoardPageVO;
import vo.BoardVO;
 
@Component
public class BoardService {
    @Autowired
    private BoardDao dao;
//////////////////////////////////////////////////////
    // �� �������� ������ ���� ����
    private static final int COUNT_PER_PAGE = 10;
     
    public BoardPageVO makeBoardPage(int currentPage) {
        // �Խñ� �� ����
        int totalCount = dao.selectCount();
         
        // �� �������� ���
        int totalPage = totalCount/COUNT_PER_PAGE;
        if(totalCount%COUNT_PER_PAGE!=0) {
            totalPage++;
        }
         
        // ȭ�� �ϴ��� ������ ��ũ(����)
        int startPage = (currentPage-1)/10*10+1;
         
        // ȭ�� �ϴ��� ������ ��ũ(��)
        int endPage = startPage+9;
        if(totalPage < endPage) {
            endPage = totalPage;
        }
         
        // �� ��ȸ �� ���� ��ȣ ���
        int startRow = (currentPage-1)*COUNT_PER_PAGE;
         
        // DB���� ������ �Խñ� ��� ��ȸ
        List<BoardVO> boardList = 
                dao.selectList(startRow, COUNT_PER_PAGE);
         
        // ��� ������ BoardPageVO ��ü�� ��Ƽ� ����
        return new BoardPageVO
                (boardList, currentPage, startPage, 
                endPage, totalPage);
    }
 
    public int write(BoardVO board, String loginId) {
        // boardVO ���� ����� ���븸 ��������.
        // ������ �� ���񽺿��� ä���.
        board.setReadCount(0); // ��ȸ��
        board.setWriteDate(new Date()); // �ۼ��Ͻ�
        board.setWriter(loginId); // �ۼ���
         
        return dao.insert(board);
    }
    
    public BoardVO read(int boardNum, String loginId) {
    	BoardVO board = dao.select(boardNum);
    	
    	if(loginId!=null && loginId.equals(board.getWriter())) {
    		return board;
    	}else {
    		dao.updateReadCount(boardNum);
    		return dao.select(boardNum);
    	}
    }
}
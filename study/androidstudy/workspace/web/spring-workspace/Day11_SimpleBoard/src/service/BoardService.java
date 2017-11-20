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
    // 한 페이지에 보여질 글의 갯수
    private static final int COUNT_PER_PAGE = 10;
     
    public BoardPageVO makeBoardPage(int currentPage) {
        // 게시글 총 갯수
        int totalCount = dao.selectCount();
         
        // 총 페이지수 계산
        int totalPage = totalCount/COUNT_PER_PAGE;
        if(totalCount%COUNT_PER_PAGE!=0) {
            totalPage++;
        }
         
        // 화면 하단의 페이지 링크(시작)
        int startPage = (currentPage-1)/10*10+1;
         
        // 화면 하단의 페이지 링크(끝)
        int endPage = startPage+9;
        if(totalPage < endPage) {
            endPage = totalPage;
        }
         
        // 글 조회 행 시작 번호 계산
        int startRow = (currentPage-1)*COUNT_PER_PAGE;
         
        // DB에서 보여질 게시글 목록 조회
        List<BoardVO> boardList = 
                dao.selectList(startRow, COUNT_PER_PAGE);
         
        // 모든 데이터 BoardPageVO 객체에 담아서 리턴
        return new BoardPageVO
                (boardList, currentPage, startPage, 
                endPage, totalPage);
    }
 
    public int write(BoardVO board, String loginId) {
        // boardVO 에는 제목과 내용만 적혀있음.
        // 나머지 값 서비스에서 채우기.
        board.setReadCount(0); // 조회수
        board.setWriteDate(new Date()); // 작성일시
        board.setWriter(loginId); // 작성자
         
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
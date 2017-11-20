package repository.mapper;

import java.util.List;

import vo.BoardVO;

public interface BoardMapper {
	 public int insert(BoardVO board);
	 public int selectTotalCount();
	 public BoardVO select(int boardNum);
	 public List<BoardVO> selectList(@Param("startPage")int startPage, int count);
	 public int update(BoardVO board);
	 public int delete(int boardNum);
}

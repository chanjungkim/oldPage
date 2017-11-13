package test02_interface;
 
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import vo.BookVO;
 
public interface BookMapper {
    public final String INSERT_SQL = 
        "INSERT INTO BOOK(TITLE,PUBLISHER,PRICE,YEAR) "
        + "VALUES(#{jTitle}, #{jPublisher}, #{jPrice}, #{jYear})";
    public final String SELECT_SQL = 
        "SELECT * FROM BOOK WHERE BOOK_NUM=#{jBookNum}";
    public final String SELECT_ALL_SQL = 
        "SELECT * FROM BOOK";
/////////////////////////////////////////////////////////
    @Insert(INSERT_SQL)
    public int insert(BookVO book);
     
    @Select(SELECT_SQL)
    @Results({
	    @Result(column="BOOK_NUM", property="jBookNum"),
	    @Result(column="PUBLISHER", property="jPublisher"),
	    @Result(column="BOOK_NUM", property="jTitle"),
	    @Result(column="BOOK_NUM", property="jPrice"),
	    @Result(column="BOOK_NUM", property="jWriter")
	})
    public BookVO selectBook(int jBookNum);
     
    @Select(SELECT_ALL_SQL)
    @Results({
	    @Result(column="BOOK_NUM", property="jBookNum"),
	    @Result(column="PUBLISHER", property="jPublisher"),
	    @Result(column="BOOK_NUM", property="jTitle"),
	    @Result(column="BOOK_NUM", property="jPrice"),
	    @Result(column="BOOK_NUM", property="jWriter")
	})
    public List<BookVO> selectList();
}
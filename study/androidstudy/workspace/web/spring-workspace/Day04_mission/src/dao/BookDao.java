package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component("dao")
public class BookDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public BookDao() {
	}
	
	public BookDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int insert(BookVO book) {
		String sql = "insert into book values(book_num_seq.nextval, ?, ? ,?, ?)";
		
		System.out.println(book);
		
		return jdbcTemplate.update(sql,
				book.getTitle(),
				book.getWriter(),
				book.getPrice(),
				book.getPublisher());
	}
	
	public int updatePrice(BookVO book, int price) {
		String sql = "update book set price=? where title=?";

		System.out.println(book);
		
		return jdbcTemplate.update(sql,
				price,
				book.getTitle());
	}
	
	public int deleteByNum(int bookNum) {
		String sql = "delete from book where book_num=?";
				
		return jdbcTemplate.update(sql,
				bookNum);
	}
	
	public int deleteByTitle(String title) {
		String sql = "delete from book where title=?";
				
		return jdbcTemplate.update(sql,
				title);
	}

	public BookVO selectByNum(int bookNum) {
		String sql = "select * from book where book_num = ?";
				
		return jdbcTemplate.queryForObject(sql, new BookMapper(), bookNum);
	}
	
	public List<BookVO> selectByTitle(String title) {
		String sql = "select * from book where title = ?";
		
		return jdbcTemplate.query(sql, new BookMapper(), title);
	}
	
	public List<BookVO> selectAll() {
		String sql = "select * from book";
		
		return jdbcTemplate.query(sql, new BookMapper());
	}
	
	class BookMapper implements RowMapper<BookVO>{
		@Override
		public BookVO mapRow(ResultSet rs, int arg1) throws SQLException {
			BookVO book = new BookVO();
			
			book.setBookNum(rs.getInt("book_num"));
			book.setTitle(rs.getString("title"));
			book.setWriter(rs.getString("writer"));
			book.setPrice(rs.getInt("price"));
			book.setPublisher(rs.getString("publisher"));
			
			return book;
		}
	}
}

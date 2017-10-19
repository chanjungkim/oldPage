package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import vo.Article;

public class BoardDao {
	// singleton
	private static BoardDao instance;
	public static BoardDao getInstance() {
		if(instance == null)
			instance = new BoardDao();
		return instance;
	}
	private BoardDao() {}
///////////////////////////////////////////////////////////
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
/////////////////////////////////////////////////////////	
	// 1. �� �Խñ��� ���� ��ȸ
	public int selectArticleCount() {
		con = DBUtil.makeConnection();
		String sql = "SELECT COUNT(*) FROM BOARD";
		int result = 0;
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); // sql ����

			// ��� ���� �ϳ� ���
			rs.next();
			result = rs.getInt(1);
		} catch (SQLException e) {
			System.out.println("dao count ����");
			e.printStackTrace();
		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closePstmt(pstmt);
			DBUtil.closeCon(con);
		}
		return result;
	}

	// 2. Ư�� �������� ������ �Խñ� ��ȸ
	public List<Article> selectArticleList
							(int startRow, int count) {
		con = DBUtil.makeConnection();
		String sql = "SELECT ARTICLE_NUM, TITLE," 
				+ "WRITER, CONTENTS, READ_COUNT," 
				+ "WRITE_TIME FROM BOARD "
				+ "ORDER BY ARTICLE_NUM DESC LIMIT ?,?";
		List<Article> articleList = new ArrayList<>();

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, count);
			rs = pstmt.executeQuery(); // SQL ����

			while (rs.next()) {
				Article article = new Article();
				article.setArticleNum(rs.getInt(1));
				article.setTitle(rs.getString(2));
				article.setWriter(rs.getString(3));
				article.setContents(rs.getString(4));
				article.setReadCount(rs.getInt(5));
				article.setWriteTime(rs.getTimestamp(6));

				articleList.add(article);
			}
		} catch (SQLException e) {
			System.out.println("dao selectArticleList ����");
			e.printStackTrace();
		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closePstmt(pstmt);
			DBUtil.closeCon(con);
		}
		return articleList;
	}
//////////////////////////////////////////////////////////
	// �۾���
	public int insert(Article article) {
		con = DBUtil.makeConnection();
		String sql = "INSERT INTO BOARD"
				+ "(TITLE,WRITER,CONTENTS,READ_COUNT,"
				+ "WRITE_TIME) VALUES(?,?,?,?,?)";
		int result = 0;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, article.getTitle());
			pstmt.setString(2, article.getWriter());
			pstmt.setString(3, article.getContents());
			pstmt.setInt(4, article.getReadCount());
			pstmt.setTimestamp(5, 
				new Timestamp(article.getWriteTime().getTime()));
			
			result = pstmt.executeUpdate(); // SQL ����
		} catch (SQLException e) {
			System.out.println("dao insert ����");
			e.printStackTrace();
		} finally {
			DBUtil.closePstmt(pstmt);
			DBUtil.closeCon(con);
		}
		return result;
	}
///////////////////////////////////////////////////////////
	// �� �б� �۾��� �ʿ��� �޼ҵ�
	// 1. ��ȸ�� ����
	public int updateReadCount(int articleNum) {
		con = DBUtil.makeConnection();
		String sql = "UPDATE BOARD SET READ_COUNT=READ_COUNT+1 " 
				+ "WHERE ARTICLE_NUM=?";
		int result = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, articleNum);

			result = pstmt.executeUpdate(); // SQL ����
		} catch (SQLException e) {
			System.out.println("dao update ����");
			e.printStackTrace();
		} finally {
			DBUtil.closePstmt(pstmt);
			DBUtil.closeCon(con);
		}
		return result;
	}

	// 2. �ش� ��ȣ�� Article ��ȸ
	public Article select(int articleNum) {
		con = DBUtil.makeConnection();
		String sql = "SELECT ARTICLE_NUM,TITLE,WRITER," 
				+ "CONTENTS,WRITE_TIME,READ_COUNT FROM BOARD "
				+ "WHERE ARTICLE_NUM=?";
		Article article = null;

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, articleNum);
			rs = pstmt.executeQuery(); // SQL ����

			if (rs.next()) {
				article = new Article();
				article.setArticleNum(rs.getInt(1));
				article.setTitle(rs.getString(2));
				article.setWriter(rs.getString(3));
				article.setContents(rs.getString(4));
				article.setWriteTime(rs.getTimestamp(5));
				article.setReadCount(rs.getInt(6));
			}
		} catch (SQLException e) {
			System.out.println("dao select ����");
			e.printStackTrace();
		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closePstmt(pstmt);
			DBUtil.closeCon(con);
		}
		return article;
	}
	
}

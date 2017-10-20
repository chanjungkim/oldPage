package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vo.FileInfoVO;

public class FileDao {
	// singleton
	private static FileDao instance;

	public static FileDao getInstance() {
		if (instance == null)
			instance = new FileDao();
		return instance;
	}

	private FileDao() {
		DBUtil.loadDriver();
	}

	///////////////////////////////////////////////////////////
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;

	/////////////////////////////////////////////////////////
	public List<FileInfoVO> selectList() {
		con = DBUtil.makeConnection();
		String sql = "SELECT FILE_NUM, FILE_PATH, " + "ORIGINAL_NAME, DESCRIPTION FROM FILE_BOARD";
		List<FileInfoVO> fileVOList = new ArrayList<>();

		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				FileInfoVO fileVO = new FileInfoVO();
				fileVO.setFileNum(rs.getInt(1));
				fileVO.setFilePath(rs.getString(2));
				fileVO.setOriginalName(rs.getString(3));
				fileVO.setDescription(rs.getString(4));

				fileVOList.add(fileVO);
			}
		} catch (SQLException e) {
			System.out.println("dao selectList ����");
			e.printStackTrace();
		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closePstmt(pstmt);
			DBUtil.closeCon(con);
		}
		return fileVOList;
	}
	
	public int insert(FileInfoVO fileInfo) {
		con = DBUtil.makeConnection();
		String sql = "INSERT INTO FILE_BOARD"
				+ "(FILE_PATH, ORIGINAL_NAME, DESCRIPTION)"
				+ "VALUES(?,?,?)";
		int result = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, fileInfo.getFilePath());
			pstmt.setString(2, fileInfo.getOriginalName());
			pstmt.setString(3, fileInfo.getDescription());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("dao insert ����");
			e.printStackTrace();
		} finally {
			DBUtil.closePstmt(pstmt);
			DBUtil.closeCon(con);
		}		
		return result;
	}
	
	public FileInfoVO select(int fileNum) {
		con = DBUtil.makeConnection();
		String sql = "SELECT FILE_NUM, FILE_PATH, ORIGINAL_NAME, DESCRIPTION FROM FILE_BOARD WHERE FILE_NUM=?";
		FileInfoVO fileVO = new FileInfoVO();
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1,  fileNum);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				fileVO = new FileInfoVO();
				fileVO.setFileNum(rs.getInt(1));
				fileVO.setFilePath(rs.getString(2));
				fileVO.setOriginalName(rs.getString(3));
				fileVO.setDescription(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}








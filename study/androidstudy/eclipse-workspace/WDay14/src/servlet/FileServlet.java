package servlet;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.FileDao;
import vo.FileInfoVO;

@WebServlet("/file.do")
public class FileServlet extends HttpServlet{
	private FileDao dao = FileDao.getInstance();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String task = req.getParameter("task");
		String path = "";
		
		if(task.equals("fileList")) {
			List<FileInfoVO> fileVOList = dao.selectList();
			req.setAttribute("fileVOList", fileVOList);
			path = "file_list.jsp";
		}else if(task.equals("uploadForm")) {
			path = "upload_form.jsp";
		}else if(task.equals("uploadForm")) {
			String fileNumStr = req.getParameter("fileNum");
			int fileNum = 0;
			if(fileNumStr != null && fileNumStr.length() > 0) {
				fileNum = Integer.parseInt(fileNumStr);
			}
			FileInfoVO fileInfo = dao.select(fileNum);
			path = " ";
		}
		
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher(path);
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("euc-kr");
		String uploadFolder = "c://yyj//";
		
		//������(request��û��ü, ����������, �����ִ�ũ��,�����̸��� ���� ��������)
		MultipartRequest mReq = 
			new MultipartRequest
				(req, uploadFolder, 
				1024*1024*40,"euc-kr", 
				new DefaultFileRenamePolicy());
		
		File uploadFile = 
				mReq.getFile("myFile"); // ���Ͼ��ε�Ϸ�
		
		// dao�� �����ؼ� DB�� �����ϱ�
		FileInfoVO fileInfoVO = new FileInfoVO();
		fileInfoVO.setOriginalName
			(mReq.getOriginalFileName("myFile"));
		fileInfoVO.setFilePath
			(uploadFile.getAbsolutePath());
		fileInfoVO.setDescription
			(mReq.getParameter("description"));
		
		int uploadResult = dao.insert(fileInfoVO);
		
		req.setAttribute("uploadResult", uploadResult);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("upload_result.jsp");
		dispatcher.forward(req, resp);
	
	}
}









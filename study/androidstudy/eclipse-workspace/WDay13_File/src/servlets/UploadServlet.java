package servlets;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class UploadServlets
 */
@WebServlet("/UploadServlet")
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		RequestDispatcher dispatcher = request.getRequestDispatcher("upload_form.jsp");
 		dispatcher.forward(request, response);
 	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uploadFolder = "c://yyj//";
		MultipartRequest mReq = new MultipartRequest(request, uploadFolder, 1024*1024*40, new DefaultFileRenamePolicy());
		
		File uploadFile = mReq.getFile("myFile");
		
		System.out.println("파일 원래이름:"+ mReq.getOriginalFileName("myFile"));
	}
}
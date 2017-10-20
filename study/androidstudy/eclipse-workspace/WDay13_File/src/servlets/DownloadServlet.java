package servlets;

import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DownloadServlet")
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fileDir = "c:/yyj/";
		String fileName = "cos.jar";
		String fileFullPath = fileDir + fileName;
		
		response.setHeader("Content-Disposition", "attachment;filename=cos.jar");
		response.setContentType("text/octet-stream;charset=utp-8");
		
		FileInputStream fis = new FileInputStream(fileFullPath);
		
		ServletOutputStream sos = response.getOutputStream();
		
		byte[] buf = new byte[1024];
		int size = 0;
		
		while((size=fis.read(buf))!=-1) {
			sos.write(buf);
			sos.flush();
		}
		fis.close();
		sos.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
}

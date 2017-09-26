package unit01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RadioServlet
 */
@WebServlet("/RadioServlet")
public class RadioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String sex = request.getParameter("gender");
		String chk_mail = request.getParameter("chk_mail");
		String content = request.getParameter("content");
		
		out.println("당신이 입력한 정보입니다.<hr>");
		out.println("<label>성별: </label><b>"+sex+"</b><br>");
		out.println("<label>메일 정보 수신 여부:</label><b>"+chk_mail+"</b><br>");
		out.println("<label>가입 인사:</label><br>");
		out.println("<b>"+content+"</b><br>");
		out.println("<a href='javascript:history.go(-1)'>다시</a>");	
		out.close();
	}
}
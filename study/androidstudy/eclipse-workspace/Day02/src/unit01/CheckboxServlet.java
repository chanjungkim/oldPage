package unit01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckboxServlet
 */
@WebServlet("/CheckboxServlet")
public class CheckboxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		String[] checkboxes = null;
		checkboxes = req.getParameterValues("item");
		if(checkboxes == null) {
			out.println("<script> alert('아무것도 선택하지 않았습니다.')</script>)");			
		}else if(checkboxes.length == 1) {
			out.println("<script> alert('하나 선택하셨습니다.')</script>");
		}else if(checkboxes.length == 2) {
			out.println("<script> alert('하나 선택하셨습니다.')</script>");			
		}else if(checkboxes.length > 2) {
			out.println("<script> alert('많이 선택하셨습니다..')</script>");			
		}
		for(String str : checkboxes) {
			out.println(str+" ");
		}
		out.print("<br><a href='javascript:history.go(-1)'>다시</a>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}
}

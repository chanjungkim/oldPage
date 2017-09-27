package forward;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test08")
public class Test08Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = "";
		String param = request.getParameter("p");

		if (param.equals("a")) {
			path = "test08_a.jsp";
			request.setAttribute("loginTime", new Date());
			request.setAttribute("userLevel", "관리자");
		} else {
			path = "test08_b.jsp";
			request.setAttribute("userLevel", "게스트");
		}

		RequestDispatcher dispatcher = (RequestDispatcher)
				request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}
}
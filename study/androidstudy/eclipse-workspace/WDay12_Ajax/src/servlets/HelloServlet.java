package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import vo.Member;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String task = request.getParameter("task");
		
		if(task==null || task.isEmpty()) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("hello.jsp");
			dispatcher.forward(request, response);
		} else if (task.equals("requestData")) {
			response.setContentType("text/json;charset=euc-kr");

			PrintWriter writer = response.getWriter();
			List<Member> memberList = new ArrayList<>();
			memberList.add(new Member("yangyu", "1234", "양유진", "01012341234"));
			memberList.add(new Member("yangyu", "1234", "김찬중", "01012341234"));
			memberList.add(new Member("yangyu", "1234", "노동근", "01012341234"));
					
			Gson gson = new Gson();
			writer.print(gson.toJson(memberList));
		}
	}
}

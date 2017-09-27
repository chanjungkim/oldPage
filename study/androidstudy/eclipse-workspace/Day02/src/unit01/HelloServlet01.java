package unit01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet01
 */
@WebServlet("/hello")
public class HelloServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Set the page info to response to clients.
		response.setContentType("text/html");
		//[Ctrl+Shift+O] : 자동 import
		PrintWriter out = response.getWriter();
		out.print("<html><body><h1>");
		out.print("Hello Serevlet");
		out.print("</h1></body></html>");
		out.print("<input type=\"text\">");
		out.close();
	}
}

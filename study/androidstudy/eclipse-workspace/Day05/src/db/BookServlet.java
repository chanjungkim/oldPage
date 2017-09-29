package db;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("euc-kr");
		
		String title = request.getParameter("title");
		String publisher = request.getParameter("pub");
		String priceStr = request.getParameter("price");
		String year = request.getParameter("year");
		
		int price = 0;
		if(priceStr!=null && priceStr.length()>0) {
			price = Integer.parseInt(priceStr);
		}
		BookVO book = new BookVO(title, publisher, price, year);
		System.out.println(book);
		
		// VO 객체에 모은 데이터들을 Dao 객체에 전달할 예정
		// 디비디비디비디비디비디비디비
		RequestDispatcher dispatcher = (RequestDispatcher) request.getRequestDispatcher("test04_add_book_result.jsp");
		dispatcher.forward(request, response);
	}

}

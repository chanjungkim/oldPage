package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDao;
import vo.BookVO;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
	private BookDao dao = BookDao.getInstance();
	
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type"); // getAttribute는 session에서
		String path = "";
		
		if(type.equals("bookForm")) {
			path = "book_form.jsp";
		}else if(type.equals("bookList")) {
			// 책 목록을 DB에서 꺼내와야 함
			List<BookVO> bookList = dao.selectAll();
			request.setAttribute("bookList", bookList);
			
			path = "book_list.jsp";
			// 그다음 책 목록을 보여줄 jsp에게 forward 할 것임
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String type = request.getParameter("type");
		String path = "";
		
		if(type.equals("addBook")) {
			
			String title = request.getParameter("title");
			String publisher = request.getParameter("pub");
			String priceStr = request.getParameter("price");
			String year = request.getParameter("year");
			
			int price = 0;
			if(priceStr!=null && priceStr.length()>0) {
				price = Integer.parseInt(priceStr);
			}
			BookVO book = new BookVO(title, publisher, price, year);
			
			// 현재 요청을 처리하는 과정에서 DB 작업수행
			int addResult = dao.insert(book);
			request.setAttribute("addResult", addResult);
			
			// 책 추가 결과를 
			path = "add_book_result.jsp";
		}
		
		// VO 객체에 모은 데이터들을 Dao 객체에 전달할 예정
		// 디비디비디비디비디비디비디비
		RequestDispatcher dispatcher = (RequestDispatcher) request.getRequestDispatcher("add_book_result.jsp");
		dispatcher.forward(request, response);
	}
}
package servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MessageDao;
import vo.MessageVO;

@WebServlet("/MessageServlet")
public class MessageServlet extends HttpServlet {
	private MessageDao dao = MessageDao.getInstance();
	
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type"); // getAttribute는 session에서
		String path = "";
		
		if(type.equals("write")) {
			path = "write.jsp";
		}else if(type.equals("home")) {
			// 책 목록을 DB에서 꺼내와야 함
			List<MessageVO> bookList = dao.selectAll();
			request.setAttribute("bookList", bookList);
			
			path = "board_list.jsp";
			// 그다음 책 목록을 보여줄 jsp에게 forward 할 것임
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String type = request.getParameter("type");
		String path = "";
				
		if(type.equals("addMessage")) {
			String title = request.getParameter("title");
			String userId = "master";
			String message = request.getParameter("message");

			long time = System.currentTimeMillis(); 
			SimpleDateFormat dayTime = new SimpleDateFormat("yyyy/mm/dd");
			String writeDate = dayTime.format(new Date(time));
			System.out.println(writeDate);
			
			MessageVO msg = new MessageVO(title, userId, writeDate, message);
			System.out.println("Servlet: title:"+title+" id:"+userId+" date:"+writeDate+" message:"+message);
			
			// 현재 요청을 처리하는 과정에서 DB 작업수행
			int addResult = dao.insert(msg);
			request.setAttribute("addResult", addResult);
			
			// 책 추가 결과를 
			path = "board_list.jsp";
		}
		// VO 객체에 모은 데이터들을 Dao 객체에 전달할 예정
		RequestDispatcher dispatcher = (RequestDispatcher) request.getRequestDispatcher(path);
		if(request == null) {
			System.out.println("request이 null입니다.");
		}
		
		if(response == null) {
			System.out.println("response가 null입니다.");
		}
		dispatcher.forward(request, response);
	}
}

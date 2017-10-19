package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.BoardService;
import vo.Article;
import vo.ArticlePage;

@WebServlet("/board")
public class BoardServlet extends HttpServlet{
	private BoardService service = BoardService.getInstance();
////////////////////////////////////////////////////////////	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String task = request.getParameter("task");
		String path = "";
		if(task == null || task.equals("boardList")) {
			// 현재 요청 페이지 관련 파라미터 p 처리
			String pageStr = request.getParameter("p");
			int page = 1;
			if(pageStr != null && !pageStr.isEmpty()) {
				page = Integer.parseInt(pageStr);
			}
			// 서비스에게 해당 페이지 보여질 정보 요청
			ArticlePage articlePage = service.makePage(page);
			request.setAttribute("articlePage", articlePage);
			path = "board_list.jsp";
		}else if(task.equals("writeForm")) {
			HttpSession session = request.getSession();
			String loginId = (String)
					session.getAttribute("loginId");
			if(loginId==null || loginId.isEmpty()) {
				// 로그인 안된 사용자가 글쓰기 요청 보내는 경우
				// 로그인 폼으로 안내하기
				path = "login_form.jsp";
			}else {
				path = "write_form.jsp";
			}
		}else if(task.equals("read")) {
			// 작성자가 본인 글 읽으면 조회수 증가 안시킴.
			HttpSession session = request.getSession();
			String loginId = (String) 
					session.getAttribute("loginId");
			String articleNumStr = request.getParameter("articleNum");
			int articleNum = Integer.parseInt(articleNumStr);
			
			Article article = service.read(loginId, articleNum);
			if(article!=null) {
				request.setAttribute("article", article);
				path = "read.jsp";
			}else {
				path = "article_not_found.jsp";
			}
		}
		
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		String task = request.getParameter("task");
		String path = "";
		
		if(task.equals("write")) {
			Article article = new Article();
			article.setWriter(request.getParameter("writer"));
			article.setTitle(request.getParameter("title"));
			article.setContents(request.getParameter("contents"));
			boolean result = service.write(article);
			if(result==true) {
				path = "write_success.jsp";
			}else {
				path = "write_fail.jsp";
			}
		}
		
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}
}





package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardService;
import vo.Article;
import vo.ArticlePageVO;

@WebServlet("/board")
public class BoardServlet extends HttpServlet{
	private BoardService service = BoardService.getInstance();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		String path = "";
		
		if(type==null || type.equals("boardList")) {
			// �Խ��� ��� �����ֱ� ���� �۾�.
			// Ŭ���̾�Ʈ�� ��û�ϴ� ������ parameter �ޱ�
			String pageStr = request.getParameter("p");
			int page = 1;
			if(pageStr!=null && pageStr.length()>0) {
				page = Integer.parseInt(pageStr);
			}
			
			// page ���� �ָ鼭 service���� �Ͻ�Ű��
			ArticlePageVO articlePage = 
					service.makeArticlePage(page);
			
			request.setAttribute("articlePage", articlePage);
			
			// �Խ��� ��� html ȭ���� ����� jsp���� forward
			path = "board_list.jsp";
		}else if(type.equals("writeForm")) {
			// �� �Է� ȭ��html �����ϱ�
			path = "write_form.jsp";
		}else if(type.equals("read")){
			String articleNumStr = request.getParameter("articleNum");
			int articleNum = 0;
			if(articleNumStr != null && articleNumStr.length()>0) {
				articleNum = Integer.parseInt(articleNumStr);
			}
			
			Article article = service.readAndReadCount(articleNum);
			
			if(article != null) {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException {
		request.setCharacterEncoding("euc-kr");
		String type = request.getParameter("type");
		String path = "";
		
		if(type.equals("write")) {
			Article article = new Article();
			article.setTitle(request.getParameter("title"));
			article.setWriter(request.getParameter("writer"));
			article.setPassword(request.getParameter("password"));
			article.setContents(request.getParameter("contents"));
			// �������� �Ͻ�Ű�� ������ �ϸ� ��.
			if(service.writeArticle(article)) {
				path = "write_success.jsp";
			}else {
				path = "write_fail.jsp";
			}
		}
		
		RequestDispatcher dispatcher = 
						request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	};

}











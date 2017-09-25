package servlet;
 
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet(urlPatterns="/hello")
public class HelloServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println
        ("클라이언트 요청이 들어옴! HelloServlet이 요청 받음!");
  
        // 응답 데이터의 종류 적기
        response.setContentType("text/html; charset=UTF-8");
         
        // response 객체에서 쓰기도구 획득!
        PrintWriter writer = response.getWriter();
         
        // 현재 서블릿이 응답할 html 문서 작성하기 시작.
        writer.println("<html>");
        writer.println("    <head>");
        writer.println("        <title>자바 서블릿</title>");
        writer.println("    </head>");
        writer.println("    <body>");
        writer.println("        <h2>자바로 작성한 서블릿이 응답한 html 문서</h2>");
        writer.println("        아휴..html 적기 힘들었습니다...<br>");
        writer.println("        현재시간:<b>" +new Date()+ "</b>");
        writer.println("    </body>");
        writer.println("</html>");
         
        writer.close();
    }
}

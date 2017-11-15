package controller;
 
import java.util.Date;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
 
public class HelloController implements Controller {
 
    @Override
    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        // Service(Dao의존) 객체 활용해서 더 다양한 작업 처리함.
        ModelAndView mv = new ModelAndView();
         
        mv.addObject("now", new Date());
        mv.addObject("msg", "안녕하세요. 스프링 MVC 첫 실습입니다.");
         
        mv.setViewName("sample");
        return mv;
    }
 
}
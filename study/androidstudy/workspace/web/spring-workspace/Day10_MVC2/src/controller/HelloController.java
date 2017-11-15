package controller;
 
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloController {
 
    @RequestMapping("/hello.do")
    public ModelAndView myFunc() {
        ModelAndView mv = new ModelAndView();
         
        mv.addObject("now",new Date());
        mv.addObject("msg", "스프링 MVC 두번째 예제");
        mv.setViewName("sample"); // sample.jsp
         
        return mv;
    }
}

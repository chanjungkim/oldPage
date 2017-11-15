package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class LoginController {
 
    @RequestMapping("/main.do")
    public String mainFunc() {
        return "main"; // main.jsp
    }
 
    @RequestMapping("/loginForm.do")
    public String loginForm() {
        return "login_form"; // login_form.jsp
    }
 
    @RequestMapping(value = "/login.do", 
            method = RequestMethod.POST)
    public ModelAndView login
                    (@RequestParam("userId")String id, 
                    @RequestParam("userPw")String pw) {
        ModelAndView mv = new ModelAndView();
        if(id.equals("admin") && pw.equals("1234")) {
            mv.addObject("loginId", id);
            mv.setViewName("login_success");
        }else {
            mv.setViewName("login_fail");
        }
        return mv;
    }
 
}
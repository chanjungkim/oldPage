package controller;
 
import javax.servlet.http.HttpSession;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
import service.MemberService;
import vo.MemberVO;
 
@Controller
public class MemberController {
    @Autowired
    private MemberService service;
     
    @RequestMapping("/joinForm.do")
    public String joinForm() {
        return "join_form";
    }
     
    @RequestMapping("/join.do")
    public String join(MemberVO member) {
        if(service.join(member)) {
            return "join_success";
        }else {
            return "join_fail";
        }
    }
     
    @RequestMapping("/loginForm.do")
    public String loginForm() {
        return "login_form";
    }
     
    @RequestMapping(value="/login.do", method=RequestMethod.POST)
    public String login
        (String id, @RequestParam("password")String pw, HttpSession session){
        if(service.login(id, pw)) {
            // 로그인 성공 시 세션에 기록해두기.
            session.setAttribute("loginId", id);
            return "login_success";
        }else {
            return "login_fail";
        }       
    }
     
    @RequestMapping("/myPage.do")
    public ModelAndView myPage(HttpSession session) {
        ModelAndView mv = new ModelAndView();
        String loginId = (String)session.getAttribute("loginId");
        if(loginId!=null && loginId.length()>0) {
            // 로그인 정보 있음
            MemberVO member = 
                    service.getMemberInfo(loginId);
            mv.addObject("memberInfo", member);
            mv.setViewName("my_page");
        }else {
            // 로그인 정보 없음.
            mv.setViewName("no_login");
        }
        return mv;
    }
     
    @RequestMapping("/logout.do")
    public String logout(HttpSession session) {
        session.invalidate();
        return "logout";
    }
}
package controller;
 
import javax.servlet.http.HttpSession;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
import service.BoardService;
import vo.BoardVO;
 
@Controller
public class BoardController {
    @Autowired
    private BoardService service;
     
    @RequestMapping("/board.do")
    public ModelAndView board(
            @RequestParam(defaultValue="1")int page) {
        ModelAndView mv = new ModelAndView();
        mv.addObject
            ("boardPage", service.makeBoardPage(page));
        mv.setViewName("board_list");// board_list.jsp
        return mv;
    }
     
    @RequestMapping("/writeForm.do")
    public String writeForm(HttpSession session) {
        String loginId = (String)
                session.getAttribute("loginId");
        if(loginId!=null && loginId.length()>0) {
            return "write_form";
        }else {
            // 로그인정보가 없는 사용자에게 보여줄 뷰
            return "no_login";
        }       
    }
 
    @RequestMapping(value="write.do", 
                method=RequestMethod.POST)
    public String write(BoardVO board, HttpSession session) {
        String loginId = (String)
                session.getAttribute("loginId");
         
        if(loginId!=null && loginId.length()>0) {
            service.write(board, loginId);
            return "write_result";
        }else {
            return "no_login";
        }
    }
    
    @RequestMapping("read.do")
    public ModelAndView read(int boardNum, HttpSession session) {
    	ModelAndView mv = new ModelAndView();
    	
    	String loginId = (String) session.getAttribute("loginId");
    	
    	BoardVO board = service.read(boardNum, loginId);
    	
    	mv.addObject("board", board);
    	mv.setViewName("read");
    	return mv;
    }
}
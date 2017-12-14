package controller;
 
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import vo.MemberMultiVO;
import vo.MemberVO;
 
@Controller
public class FileController {
    @RequestMapping("/uploadForm.do")
    public String uploadForm() {
        return "upload_form";
    }
     
//  @RequestMapping("/upload.do")
//  public String upload(MemberVO member) {
//      String uploadPath = "c:/test/";
//      
//      File dir = new File(uploadPath);
//      
//      if(!dir.exists()) {
//          dir.mkdir(); // 해당 디렉토리 없으면 생성
//      }
//      
//      // 업로드 받은 파일을 아래 이름의 파일로 만들어서
//      // 서버측에 저장시키기
//      String savedPath = uploadPath + new Random().nextInt(10000000);
//      File savedFile = new File(savedPath);
//
//      // 전달받은 파일 업로드 작업.
//      try {
//          member.getMemImg().transferTo(savedFile);
//          
//          // 이 시점에 데이터베이스에 업로드 내역 기록
//          System.out.println("---------------");
//          System.out.println("업로드 완료");
//          System.out.println("아이디:"+member.getId());
//          System.out.println("패스워드:"+member.getPw());
//          System.out.println("원본이름:"+
//              member.getMemImg().getOriginalFilename());
//          System.out.println("저장된 경로:"+
//              savedFile.getAbsolutePath());
//          System.out.println("---------------");
//      } catch (IllegalStateException e) {
//          e.printStackTrace();
//      } catch (IOException e) {
//          e.printStackTrace();
//      }
//      return "upload_result";
//  }
///////////////////////////////////////////////////////
    @RequestMapping("/upload.do")
    public ModelAndView upload
        (MemberVO member, HttpServletRequest req) {
        ModelAndView mv = new ModelAndView("upload_result2");
        String uploadPath = req.getServletContext()
                .getRealPath("img");
         
        File dir = new File(uploadPath);
         
        if(!dir.exists()) {
            dir.mkdir(); // 해당 디렉토리 없으면 생성
        }
         
        // 업로드 받은 파일을 아래 이름의 파일로 만들어서
        // 서버측에 저장시키기
        String savedName = new Random().nextInt(100)+
                member.getMemImg().getOriginalFilename(); 
                 
        File savedFile = new File(uploadPath+"/"+savedName);
 
        mv.addObject("imgPath", "img/"+savedName);
        // 전달받은 파일 업로드 작업.
        try {
            member.getMemImg().transferTo(savedFile);
             
            // 이 시점에 데이터베이스에 업로드 내역 기록
            System.out.println("---------------");
            System.out.println("업로드 완료");
            System.out.println("아이디:"+member.getId());
            System.out.println("패스워드:"+member.getPw());
            System.out.println("원본이름:"+
                member.getMemImg().getOriginalFilename());
            System.out.println("저장된 경로:"+
                savedFile.getAbsolutePath());
            System.out.println("---------------");
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mv;
    }
    
    @RequestMapping("/uploadForm2.do")
    public String uploadForm2() {
    	return "upload_form2";
    }
    
    @RequestMapping("/uploadMulti.do")
    public ModelAndView uploadMulti(MemberMultiVO multi) {
    	String uploadPath = "c:/test";
    	
    	File dir = new File(uploadPath);
    	if(dir.exists() == false) {
    		dir.mkdir();
    	}
    	
    	for(MultipartFile f : multi.getFileList()) {
    		String savedName = new Random().nextInt(100)+
    				f.getOriginalFilename();
    		File savedFile = new File(uploadPath+"/"+savedName);
    		
    		member.getMemImg().transferTo(savedFile);
    		
    		System.out.println("--------");
    	}
    	
    	return 
    }
}
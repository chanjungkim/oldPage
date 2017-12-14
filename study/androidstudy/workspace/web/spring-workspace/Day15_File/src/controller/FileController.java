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
//          dir.mkdir(); // �ش� ���丮 ������ ����
//      }
//      
//      // ���ε� ���� ������ �Ʒ� �̸��� ���Ϸ� ����
//      // �������� �����Ű��
//      String savedPath = uploadPath + new Random().nextInt(10000000);
//      File savedFile = new File(savedPath);
//
//      // ���޹��� ���� ���ε� �۾�.
//      try {
//          member.getMemImg().transferTo(savedFile);
//          
//          // �� ������ �����ͺ��̽��� ���ε� ���� ���
//          System.out.println("---------------");
//          System.out.println("���ε� �Ϸ�");
//          System.out.println("���̵�:"+member.getId());
//          System.out.println("�н�����:"+member.getPw());
//          System.out.println("�����̸�:"+
//              member.getMemImg().getOriginalFilename());
//          System.out.println("����� ���:"+
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
            dir.mkdir(); // �ش� ���丮 ������ ����
        }
         
        // ���ε� ���� ������ �Ʒ� �̸��� ���Ϸ� ����
        // �������� �����Ű��
        String savedName = new Random().nextInt(100)+
                member.getMemImg().getOriginalFilename(); 
                 
        File savedFile = new File(uploadPath+"/"+savedName);
 
        mv.addObject("imgPath", "img/"+savedName);
        // ���޹��� ���� ���ε� �۾�.
        try {
            member.getMemImg().transferTo(savedFile);
             
            // �� ������ �����ͺ��̽��� ���ε� ���� ���
            System.out.println("---------------");
            System.out.println("���ε� �Ϸ�");
            System.out.println("���̵�:"+member.getId());
            System.out.println("�н�����:"+member.getPw());
            System.out.println("�����̸�:"+
                member.getMemImg().getOriginalFilename());
            System.out.println("����� ���:"+
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
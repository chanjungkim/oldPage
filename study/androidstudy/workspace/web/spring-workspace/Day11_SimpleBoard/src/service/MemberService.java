package service;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
import repository.MemberDao;
import vo.MemberVO;
 
@Component
public class MemberService {
    @Autowired
    private MemberDao dao;
     
    // ȸ������ �޼ҵ�
    public boolean join(MemberVO member) {
        if(dao.insert(member)>0) {
            return true;
        }else {
            return false;
        }
    }
     
    // �α��� �޼ҵ�
    public boolean login(String id, String pw) {
        if(dao.selectMemberNum(id, pw)==1) {
            return true;
        }else {
            return false;
        }
    }
 
    public MemberVO getMemberInfo(String loginId) {
        return dao.select(loginId);
    }
}
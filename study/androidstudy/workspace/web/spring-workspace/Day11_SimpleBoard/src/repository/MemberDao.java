package repository;
 
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
import repository.mapper.MemberMapper;
import vo.MemberVO;
 
@Component
public class MemberDao {
    @Autowired
    private SqlSessionTemplate session;
     
    public int insert(MemberVO member) {
        MemberMapper mapper = 
                session.getMapper(MemberMapper.class);
        return mapper.insert(member);
    }
     
    public MemberVO select(String id) {
        MemberMapper mapper = 
                session.getMapper(MemberMapper.class);
        return mapper.selectMember(id);
    }
     
    public int selectMemberNum(String id, String pw) {
        MemberMapper mapper = 
                session.getMapper(MemberMapper.class);
        return mapper.selectMemberNum(id, pw);
    }
}
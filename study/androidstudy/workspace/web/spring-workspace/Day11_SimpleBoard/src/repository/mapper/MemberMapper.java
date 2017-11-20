package repository.mapper;
 
import org.apache.ibatis.annotations.Param;
 
import vo.MemberVO;
 
public interface MemberMapper {
    public int insert(MemberVO member);
    public MemberVO selectMember(String id);
    public int selectMemberNum(@Param("id")String id,
                    @Param("password")String password);
}
package vo;
 
public class MemberVO {
    private int memberNum;
    private String id;
    private String password;
    private String phone;
    private String email;
/////////////////////////////////////////////////////
    public MemberVO(int memberNum, String id, String password, String phone, String email) {
        this.memberNum = memberNum;
        this.id = id;
        this.password = password;
        this.phone = phone;
        this.email = email;
    }
    public MemberVO(String id, String password, String phone, String email) {
        this.id = id;
        this.password = password;
        this.phone = phone;
        this.email = email;
    }
    public MemberVO() {}
//////////////////////////////////////////////////////  
    public int getMemberNum() {
        return memberNum;
    }
     
    public void setMemberNum(int memberNum) {
        this.memberNum = memberNum;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
/////////////////////////////////////////////////////   
    @Override
    public String toString() {
        return "MemberVO [memberNum=" + memberNum + ", id=" + id + ", password=" + password + ", phone=" + phone
                + ", email=" + email + "]";
    }   
}
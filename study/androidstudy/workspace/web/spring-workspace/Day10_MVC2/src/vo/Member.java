package vo;

public class Member {
	private String id;
	private String pw;
	private String name;
	private String email;
	private String phoneNum;
	
	public Member() {
		this(null, null, null, null, null);
	}

	public Member(String id, String pw) {
		this(id, pw, null, null, null);
	}

	public Member(String id, String pw, String name, String email, String phoneNum) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.phoneNum = phoneNum;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
}

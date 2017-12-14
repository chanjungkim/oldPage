package vo;

import org.springframework.web.multipart.MultipartFile;

public class MemberVO {
	private String id;
	private String pw;
	private MultipartFile memImg;
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
	public MultipartFile getMemImg() {
		return memImg;
	}
	public void setMemImg(MultipartFile memImg) {
		this.memImg = memImg;
	}
	
	
}

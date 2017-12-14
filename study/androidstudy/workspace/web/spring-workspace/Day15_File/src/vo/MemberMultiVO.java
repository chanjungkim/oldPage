package vo;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class MemberMultiVO {
	private String id;
	private String pw;
	private List<MultipartFile> fileList;
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
	public List<MultipartFile> getFileList() {
		return fileList;
	}
	public void setFileList(List<MultipartFile> fileList) {
		this.fileList = fileList;
	}
}

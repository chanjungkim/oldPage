package vo;

public class FileInfoVO {
	private int fileNum;
	private String filePath;
	private String originalName;
	private String description;
/////////////////////////////////////////////////////////
	public int getFileNum() {
		return fileNum;
	}
	public void setFileNum(int fileNum) {
		this.fileNum = fileNum;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getOriginalName() {
		return originalName;
	}
	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "FileInfoVO [fileNum=" + fileNum + ", filePath=" + filePath + ", originalName=" + originalName
				+ ", description=" + description + "]";
	}
}

package vo;

public class MessageVO {
	private static int counter = 0;
	private int messageNum;
	private String title;
	private String userId;
	private String writeDate;
	private String message;
	
	public MessageVO() {
	}
	
	public MessageVO(String title, String userId, String writeDate, String message) {
		this.title = title;
		this.userId = userId;
		this.writeDate = writeDate;
		this.message = message;
	}
	
	public MessageVO(int messageNum, String title, String userId, String writeDate, String message) {
		this.messageNum = messageNum;
		this.title = title;
		this.userId = userId;
		this.writeDate = writeDate;
		this.message = message;
	}
	
	public int getMessageNum() {
		return messageNum;
	}
	public void setMessageNum(int messageNum) {
		this.messageNum = messageNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "MessageVO [messageNum=" + messageNum + ", title=" + title + ", userId=" + userId + ", writeDate=" + writeDate
				+ ", message=" + message + "]";
	}
}

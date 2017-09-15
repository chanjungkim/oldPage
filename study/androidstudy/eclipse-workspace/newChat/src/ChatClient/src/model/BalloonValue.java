package model;

import java.net.URL;
import java.util.Arrays;

public class BalloonValue {

	int[] x;
	int[] y;
	String message;
	String nickName;
	URL imageURL;
	boolean isMe;
	
	public boolean isMe() {
		return isMe;
	}

	public void setMe(boolean isMe) {
		this.isMe = isMe;
	}

	public BalloonValue(URL imageURL) {
		super();
		this.imageURL = imageURL;
	}

	public String getNickName() {
		return nickName;
	}


	public URL getImageURL() {
		return imageURL;
	}


	public void setImageURL(URL imageURL) {
		this.imageURL = imageURL;
	}


	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int[] getX() {
		return x;
	}

	public void setX(int[] x) {
		this.x = x;
	}


	public int[] getY() {
		return y;
	}

	public void setY(int[] y) {
		this.y = y;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public BalloonValue(){
		
	}

	@Override
	public String toString() {
		return "BalloonValue [x=" + Arrays.toString(x) + ", y=" + Arrays.toString(y) + ", message=" + message
				+ ", nickName=" + nickName + ", imageURL=" + imageURL + ", isMe=" + isMe + "]";
	}
	
	
}

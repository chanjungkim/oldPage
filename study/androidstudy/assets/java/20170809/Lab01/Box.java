package lab01;

public class Box {
	int width;
	int length;
	int height;
	
	void setWidth(int width) {
		this.width=width;
	}
	void setLength(int length) {
		this.length=length;
	}
	void setHeight(int height) {
		this.height=height;
	}
	
	int getWidth() {
		return width;
	}
	int getLength() {
		return length;
	}
	int getHeight() {
		return height;
	}
	int getVolume() {
		return height*length*width;
	}
	void printProperties() {
		System.out.println("width: "+width+" length: "+length+" height: "+height);
	}
}
package test02;

public class Box<T> {            // 아직은 자료형이 미정이지만 'T'란 자료형을 쓸 거임
	private T data;
	
	public void setData(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
}
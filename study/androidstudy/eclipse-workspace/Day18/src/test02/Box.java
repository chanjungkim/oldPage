package test02;

public class Box<T> {            // ������ �ڷ����� ���������� 'T'�� �ڷ����� �� ����
	private T data;
	
	public void setData(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
}
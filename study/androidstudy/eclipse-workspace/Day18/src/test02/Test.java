package test02;

public class Test {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();   // Ŭ���� ���� �������� ���������� ��ü ������ �� ������ �� ����
		
		box.setData("3.14");
		
		String result1 = box.getData();
		
		Box<Integer> box2 = new Box<Integer>();
		
		box2.setData(100);
		int result2 = box2.getData();
	}
}

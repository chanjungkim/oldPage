package test02;

public class Test {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();   // 클래스 설계 시점에는 미정이지만 객체 생성할 때 정해줄 수 있음
		
		box.setData("3.14");
		
		String result1 = box.getData();
		
		Box<Integer> box2 = new Box<Integer>();
		
		box2.setData(100);
		int result2 = box2.getData();
	}
}

package test04;

public class Student {
	// instant field
	private String name;
	private String phone;
	private int age;
	
	private static int numOfStudent=0;
	//
	public Student(String name, String phone, int age) {
		this.name = name;
		this.phone = phone;
		this.age = age;
		
		numOfStudent++;   // 객체가 생성될 때마다 +1됨. static 변수이기 때문에 1씩 쌓이게됨.
	}
	
	public static int getNumOfStudent() {
		return numOfStudent;
	}
	
	public String toString() {
		return "이름: "+name+" 전화번호: "+phone+" 나이: "+age;
	}
}

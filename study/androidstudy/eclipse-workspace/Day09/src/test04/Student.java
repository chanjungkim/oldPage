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
		
		numOfStudent++;   // ��ü�� ������ ������ +1��. static �����̱� ������ 1�� ���̰Ե�.
	}
	
	public static int getNumOfStudent() {
		return numOfStudent;
	}
	
	public String toString() {
		return "�̸�: "+name+" ��ȭ��ȣ: "+phone+" ����: "+age;
	}
}

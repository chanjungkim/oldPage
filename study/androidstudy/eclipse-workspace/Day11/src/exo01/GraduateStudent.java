package exo01;

class Student {
	private int number;
	public String name;
	
	public Student() {
		this(0, "ȫ�浿");
	}
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public int getNumber() {
		return this.number;
	}
	public String getName() {
		return this.name;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class GraduateStudent extends Student{
	public String lab;
	
	public GraduateStudent() {
		super();
	}
	public GraduateStudent(int number, String name, String lab) {
		super(number, name);
		this.lab = lab;
	}
	public String getLab() {
		return this.lab;
	}
	public void setLab(String lab) {
		this.lab = lab;
	}
	public String toString() {
		return "��ȣ�� "+this.getNumber()+" ������� "+this.getLab()+" �̸��� "+this.getName()+"�Դϴ�.";
	}
	public static void main(String[] args) {
		GraduateStudent s = new GraduateStudent();
		
		s.setNumber(10);
		s.setLab("image Processing Lab");
		s.setName("ȫ�浿");
		
		System.out.println(s);
	}
}

// 1- Student, GraduateStudent
/* 2-
 * ------------
 * Student
 * ------------
 * -number:int
 * +name:String
 * ------------
 * 
 * ---------------
 * GraduateStudent 
 * ---------------
 * +lab:String 
 */
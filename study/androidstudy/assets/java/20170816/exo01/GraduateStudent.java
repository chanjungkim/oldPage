package exo01;

class Student {
	private int number;
	public String name;
	
	public Student() {
		this(0, "홍길동");
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
		return "번호는 "+this.getNumber()+" 실험실은 "+this.getLab()+" 이름은 "+this.getName()+"입니다.";
	}
	public static void main(String[] args) {
		GraduateStudent s = new GraduateStudent();
		
		s.setNumber(10);
		s.setLab("image Processing Lab");
		s.setName("홍길동");
		
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
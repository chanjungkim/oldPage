package test05;

public class Student {
	private String stuNum;
	private String name;
	private double grade;
	
	public Student(String stuNum, String name, double grade) {
		this.stuNum = stuNum;
		this.name = name;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Student [stuNum=" + stuNum + ", name=" + name +", grade="+grade+"]";
	}
}

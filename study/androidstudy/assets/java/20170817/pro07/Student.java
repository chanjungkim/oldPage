package pro07;

public class Student {
	private String name;
	private String studentNumber;
	private String department;
	private String grade;
	private String totalCredit;
	
	public Student() {
		this("홍길동", "20091922", "기계과", "4", "136");
	}
	public Student(String name, String studentNumber, String department, String grade, String totalCredit) {
		this.name = name;
		this.studentNumber = studentNumber;
		this.department = department;
		this.grade = grade;
		this.totalCredit = totalCredit;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setTotalCredit(String totalCredit) {
		this.totalCredit = totalCredit;
	}
	public String getName() {
		return name;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public String getDepartment() {
		return department;
	}
	public String getGrade(){
		return grade;
	}
	public String getTotalCredit() {
		return totalCredit;
	}
	public String toString() {
		return "이름: "+this.name+"\n학번: "+this.studentNumber+"\n전공: "+this.department+"\n학년: "+this.grade+"\n총점: "+this.totalCredit;
	}
}

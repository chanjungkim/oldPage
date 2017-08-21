package pro07;

public class UnderGraduate extends Student{
	private String clubName;
	
	public UnderGraduate() {
		this("홍길동", "20091922", "기계과", "4", "136", "야구부");
	}
	public UnderGraduate(String name, String studentNumber, String department, String grade, String totalCredit, String clubName) {
		super(name, studentNumber, department, grade, totalCredit);
		this.clubName = clubName;
	}
	public String toString() {
		return "이름: "+super.getName()+"\n학번: "+super.getStudentNumber()+"\n전공: "+super.getDepartment()+"\n학년: "+super.getGrade()+"\n총점: "+super.getTotalCredit()+"\n소속 동아리: "+this.clubName;
	}
}

package pro07;

public class UnderGraduate extends Student{
	private String clubName;
	
	public UnderGraduate() {
		this("ȫ�浿", "20091922", "����", "4", "136", "�߱���");
	}
	public UnderGraduate(String name, String studentNumber, String department, String grade, String totalCredit, String clubName) {
		super(name, studentNumber, department, grade, totalCredit);
		this.clubName = clubName;
	}
	public String toString() {
		return "�̸�: "+super.getName()+"\n�й�: "+super.getStudentNumber()+"\n����: "+super.getDepartment()+"\n�г�: "+super.getGrade()+"\n����: "+super.getTotalCredit()+"\n�Ҽ� ���Ƹ�: "+this.clubName;
	}
}

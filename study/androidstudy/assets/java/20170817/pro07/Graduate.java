package pro07;

public class Graduate extends Student{
	private String taType; // 교육조교, 연구 조교
	private double scolarshipRatio; 
	
	public Graduate() {
		this("홍길동", "00000000", "기계공학", "2학년", "82학점", "교육조교", 0.5);
	}
	public Graduate(String name, String studentNumber, String department, String grade, String totalCredit, String taType, double scolarshipRatio) {
		super(name, studentNumber, department, grade, totalCredit);
		this.taType = taType;
		this.scolarshipRatio = scolarshipRatio;
	}
	
	public String toString() {
		return "이름: "+super.getName()+"\n조교 타입: "+this.taType+"\n장학금 비율"+this.scolarshipRatio+"\n학번: "+super.getStudentNumber()+"\n전공: "+super.getDepartment()+"\n학년: "+super.getGrade()+"\n총점: "+super.getTotalCredit();
	}
}

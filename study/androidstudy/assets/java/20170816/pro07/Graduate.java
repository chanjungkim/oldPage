package pro07;

public class Graduate extends Student{
	private String taType; // ��������, ���� ����
	private double scolarshipRatio; 
	
	public Graduate() {
		this("ȫ�浿", "00000000", "������", "2�г�", "82����", "��������", 0.5);
	}
	public Graduate(String name, String studentNumber, String department, String grade, String totalCredit, String taType, double scolarshipRatio) {
		super(name, studentNumber, department, grade, totalCredit);
		this.taType = taType;
		this.scolarshipRatio = scolarshipRatio;
	}
	
	public String toString() {
		return "�̸�: "+super.getName()+"\n���� Ÿ��: "+this.taType+"\n���б� ����"+this.scolarshipRatio+"\n�й�: "+super.getStudentNumber()+"\n����: "+super.getDepartment()+"\n�г�: "+super.getGrade()+"\n����: "+super.getTotalCredit();
	}
}

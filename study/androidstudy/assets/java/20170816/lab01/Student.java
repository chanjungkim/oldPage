package lab01;

public class Student extends Human{
	private String major;
	
	public Student(String name, int age, String major) {
		super(name, age, "�л�");
		this.major = major;
		System.out.println("Student�� �������Դϴ�.");
	}
	public String toString(){
		return "�̸��� "+super.getName()+" ���̴� "+super.getAge()+" ������ "+super.getProfession()+" ������ "+major+"�Դϴ�.";
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public static void main(String[] args) {
		Student st = new Student("����", 21, "��ǻ��");
		Student st2 = new Student("����", 22, "�濵");
		Student st3 = new Student("����", 24, "����");
		
		System.out.println(st);
		System.out.println(st2);
		System.out.println(st3);
	}
}

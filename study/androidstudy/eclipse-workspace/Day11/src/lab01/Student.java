package lab01;

public class Student extends Human{
	private String major;
	
	public Student(String name, int age, String major) {
		super(name, age, "학생");
		this.major = major;
		System.out.println("Student의 생성자입니다.");
	}
	public String toString(){
		return "이름은 "+super.getName()+" 나이는 "+super.getAge()+" 직업은 "+super.getProfession()+" 전공은 "+major+"입니다.";
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public static void main(String[] args) {
		Student st = new Student("명진", 21, "컴퓨터");
		Student st2 = new Student("미현", 22, "경영");
		Student st3 = new Student("용준", 24, "경제");
		
		System.out.println(st);
		System.out.println(st2);
		System.out.println(st3);
	}
}

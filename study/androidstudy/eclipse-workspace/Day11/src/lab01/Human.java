package lab01;

public class Human {
	private String name;
	private int age;
	private String profession;
	public Human(String name, int age, String profession) {
		this.name = name;
		this.age = age;
		this.profession = profession;
		System.out.println("Human의 생성자입니다.");
	}
	public String toString() {
		return "이름은 "+this.name+" 나이는 "+this.age+" 직업은 "+this.profession+"입니다.";
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getProfession() {
		return this.profession;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public static void main(String[] args) {
		Human hm = new Human("춘향", 18, "몽룡 여자친구");
		Human hm2 = new Human("몽룡", 21, "춘향 남자친구");
		Human hm3 = new Human("사또", 50, "사또");
		
		System.out.println(hm);
		System.out.println(hm2);
		System.out.println(hm3);
	}
}

package lab01;

public class Human {
	private String name;
	private int age;
	private String profession;
	public Human(String name, int age, String profession) {
		this.name = name;
		this.age = age;
		this.profession = profession;
		System.out.println("Human�� �������Դϴ�.");
	}
	public String toString() {
		return "�̸��� "+this.name+" ���̴� "+this.age+" ������ "+this.profession+"�Դϴ�.";
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
		Human hm = new Human("����", 18, "���� ����ģ��");
		Human hm2 = new Human("����", 21, "���� ����ģ��");
		Human hm3 = new Human("���", 50, "���");
		
		System.out.println(hm);
		System.out.println(hm2);
		System.out.println(hm3);
	}
}

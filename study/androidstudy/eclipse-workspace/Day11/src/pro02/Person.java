package pro02;

public class Person {
	private String name;
	private String address;
	private String number;
	
	public Person(){
		this("ȫ�浿", "�㸮�� ���ñ� ������ �η�����", "010-1111-1004");
	}
	public Person(String name, String number) {
		this(name, "���Է�", number);
	}
	public Person(String name, String address, String number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}
	public String getNumber() {
		return this.number;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}

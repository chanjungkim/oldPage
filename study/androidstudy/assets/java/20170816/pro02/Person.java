package pro02;

public class Person {
	private String name;
	private String address;
	private String number;
	
	public Person(){
		this("홍길동", "허리도 가늘군 만지면 부러지리", "010-1111-1004");
	}
	public Person(String name, String number) {
		this(name, "무입력", number);
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

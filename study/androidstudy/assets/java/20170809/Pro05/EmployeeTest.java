class Employee {
	private String name, phoneNum;
	private int salary;
	
	void setName(String name) {
		this.name = name;
	}
	void setPhoneNum(String num) {
		phoneNum = num;
	}
	void setSalary(int salary) {
		this.salary = salary;
	}
	
	String getName() {
		return name;
	}
	String getPhoneNum() {
		return phoneNum;
	}
	int getSalary() {
		return salary;
	}
	void printAll() {
		System.out.println(name+" "+phoneNum+" "+salary);
	}
}
public class EmployeeTest{
	public static void main(String[] args) {
		Employee ep = new Employee();
		
		ep.setName("±èÂùÁß");
		ep.setSalary(150);
		ep.setPhoneNum("01022223333");
		
		System.out.println(ep.getName()+" "+ep.getPhoneNum()+" "+ep.getSalary());
		ep.printAll();
	}
}
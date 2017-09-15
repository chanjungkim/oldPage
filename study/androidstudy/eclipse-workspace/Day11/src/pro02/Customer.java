package pro02;

public class Customer extends Person{
	private String customerNumer;
	private String mileage;
	
	public Customer() {
		this("-", "-");
	}
	public Customer(String customerNumber, String mileage) {
		this("ȫ�浿", "�㸮�� ���ñ�", "010-8888-8888", customerNumber, mileage);
	}
	public Customer(String name, String number, String address, String customerNumber, String mileage) {
		super(name, number, address);
		this.customerNumer=customerNumber;
		this.mileage=mileage;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumer=customerNumber;
	}
	public void setmileage(String mileage) {
		this.mileage=mileage;
	}
	public String getCustomerNumber() {
		return this.customerNumer;
	}
	public String getMileage(){
		return this.mileage;
	}
	public String toString() {
		return "�� ��: "+super.getName()+"\n�� �ּ�: "+super.getAddress()+"\n�� ��ȭ��ȣ: "+super.getNumber()
		+"\n�� ��ȣ: "+this.customerNumer+"\n���� ���ϸ���: "+this.mileage+"����Ʈ";
	}
	public static void main(String[] args) {
		Customer ct = new Customer("ȫ�浿","����� ������", "01010041004", "28172361", "500");
		System.out.println(ct);
	}
}

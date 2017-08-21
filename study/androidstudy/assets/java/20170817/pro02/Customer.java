package pro02;

public class Customer extends Person{
	private String customerNumer;
	private String mileage;
	
	public Customer() {
		this("-", "-");
	}
	public Customer(String customerNumber, String mileage) {
		this("홍길동", "허리도 가늘군", "010-8888-8888", customerNumber, mileage);
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
		return "고객 명: "+super.getName()+"\n고객 주소: "+super.getAddress()+"\n고객 전화번호: "+super.getNumber()
		+"\n고객 번호: "+this.customerNumer+"\n보유 마일리지: "+this.mileage+"포인트";
	}
	public static void main(String[] args) {
		Customer ct = new Customer("홍길동","서울시 마포구", "01010041004", "28172361", "500");
		System.out.println(ct);
	}
}

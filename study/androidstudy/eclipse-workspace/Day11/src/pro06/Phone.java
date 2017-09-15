package pro06;

public class Phone {
	private String manufacturer;
	private int price;
	private String communicationType;
	
	public Phone() {
		this("LG", 100000, "3G");
	}
	public Phone(String manufacturer, int price, String communicationType) {
		this.manufacturer = manufacturer;
		this.price = price;
		this.communicationType = communicationType;
	}
	public String getManufacturer() {
		return this.manufacturer;
	}
	public int getPrice() {
		return this.price;
	}
	public String getCommunicationType() {
		return this.communicationType;
	}
	public String toString() {
		return "제조사: "+this.manufacturer+"\n가격: "+this.price+"\n통신 타입: "+this.communicationType;
	}

}

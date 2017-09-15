package test01;

public class Car {
	private int price;
	private String model;
	
	public void setPrice(int p) {
		price = p;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setModel(String m) {
		model = m;
	}
	
	public String getModel() {
		return model;
	}
	
	public boolean comparePrice(Car other) {
		return price == other.price;
	}
}

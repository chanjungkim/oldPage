package pro05;

public class Food {
	private double calorie ;
	private int price;
	private double weight;
	
	public Food() {
		this(0, 0, 0);
	}
	public Food(double calorie, int price, double weight) {
		this.calorie = calorie;
		this.price = price;
		this.weight = weight;
	}
	
	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getCalorie() {
		return calorie;
	}
	public int getPrice() {
		return price;
	}
	public double getWeight() {
		return weight;
	}
}

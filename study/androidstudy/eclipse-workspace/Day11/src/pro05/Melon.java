package pro05;

public class Melon extends Food{
	private String cultivatePlace;
	
	public Melon() {
		this("미정", 0, 0, 0);
	}
	public Melon(String cultivatePlace, double calorie, int price, double weight) {
		super(calorie, price, weight);
		this.cultivatePlace = cultivatePlace;
	}
	public void setCultivatePlace(String cultivatePlace) {
		this.cultivatePlace = cultivatePlace;
	}
	public String getCultivatePlace() {
		return this.cultivatePlace;
	}
	public String toString() {
		return "경작지: "+this.cultivatePlace+"\n칼로리: "+super.getCalorie()+"\n가격: "+super.getCalorie()+"\n무게: "+super.getWeight();
	}
	
	public static void main(String[] args) {
		Melon ml = new Melon("논산", 300, 20000, 10);
		System.out.println(ml);
	}
}

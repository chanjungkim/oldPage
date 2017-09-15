package pro05;

public class Melon extends Food{
	private String cultivatePlace;
	
	public Melon() {
		this("����", 0, 0, 0);
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
		return "������: "+this.cultivatePlace+"\nĮ�θ�: "+super.getCalorie()+"\n����: "+super.getCalorie()+"\n����: "+super.getWeight();
	}
	
	public static void main(String[] args) {
		Melon ml = new Melon("���", 300, 20000, 10);
		System.out.println(ml);
	}
}

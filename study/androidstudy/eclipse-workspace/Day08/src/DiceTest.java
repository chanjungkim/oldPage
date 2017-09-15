class Dice {
	private int face;
	
	void roll(){
		face= (int) (Math.random()*6)+1;	
	}
	int getFace() {
		return face;
	}
	void printDice() {
		System.out.println(face);
	}
}
public class DiceTest{
	public static void main(String[] args) {
		Dice dc = new Dice();
		dc.roll();
		dc.printDice();
	}
}
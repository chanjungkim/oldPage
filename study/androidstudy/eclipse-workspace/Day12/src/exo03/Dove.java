package exo03;

public class Dove extends Bird{
	@Override
	public void sound() {
		System.out.println("coo coo");
	}
	
	public static void main(String[] args) {
		Dove dv = new Dove();
		
		dv.sound();
	}
}

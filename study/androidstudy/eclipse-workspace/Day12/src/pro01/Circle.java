package pro01;

public class Circle implements Movable {
	public Circle(){
		System.out.println(" ");
	}
	
	@Override
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
		System.out.println(Math.random()*2*dx+" "+Math.random()*2*dy);

	}
}

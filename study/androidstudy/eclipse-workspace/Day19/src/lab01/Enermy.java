package lab01;

public class Enermy extends GraphicObject{
	private int dx = -10;

	public Enermy(String name) {
		super(name);
		int x=500;
		int y=0;
	}
	public void update() {
		x += dx;
		if( x < 0 ) dx+=10;
		if( x > 500 ) dx-=10;
	}
}

package exo03;

class Bike{
	private int gear;
	public int speed;
}

public class MountainBike extends Bike {
	public int seatHeight;
	public MountainBike(int g) {
		super();
		gear = g;
	}
}


// 1 - 생성자에 반환형을 쓰지 않는다. public MountainBike
// 2 - expands가 아닌 extends다.
// 3 - super.gear(g, ...) 로 작성하거나 setGear을 만들어 값을 집어 넣을 수 있다.


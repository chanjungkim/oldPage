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


// 1 - �����ڿ� ��ȯ���� ���� �ʴ´�. public MountainBike
// 2 - expands�� �ƴ� extends��.
// 3 - super.gear(g, ...) �� �ۼ��ϰų� setGear�� ����� ���� ���� ���� �� �ִ�.


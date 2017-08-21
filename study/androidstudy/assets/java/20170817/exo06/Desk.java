package exo06;

public class Desk implements Movable{
	public static void main(String[] args) {
		Desk desk = new Desk();
		Movable m = desk;           // 클래스 참조변수에서 인터페이스 참조변수로 주소 전달 가능
		desk = m;                   // 하지만 인터페이스 참조변수에서 클래스 참조변수로 전달 불가능!!!
	}
}

interface Movable{
	
}

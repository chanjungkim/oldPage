package exo06;

public class Desk implements Movable{
	public static void main(String[] args) {
		Desk desk = new Desk();
		Movable m = desk;           // Ŭ���� ������������ �������̽� ���������� �ּ� ���� ����
		desk = m;                   // ������ �������̽� ������������ Ŭ���� ���������� ���� �Ұ���!!!
	}
}

interface Movable{
	
}

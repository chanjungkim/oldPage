import java.util.Scanner;

public class Pro08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double EARTH_TO_SUN_DISTANCE = 15.0e+7; // Double��
		final double LIGHT_SPEED = 3.0e+5;
		
		int time = (int) EARTH_TO_SUN_DISTANCE/(int)LIGHT_SPEED;
				
		System.out.println("���� �ӵ��� �������� �¾���� �ɸ��� �ð���"+time+"�� �Դϴ�.");
		sc.close();
	}
}
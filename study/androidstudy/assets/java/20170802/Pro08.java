import java.util.Scanner;

public class Pro08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double EARTH_TO_SUN_DISTANCE = 15.0e+7; // Double형
		final double LIGHT_SPEED = 3.0e+5;
		
		int time = (int) EARTH_TO_SUN_DISTANCE/(int)LIGHT_SPEED;
				
		System.out.println("빛의 속도로 지구에서 태양까지 걸리는 시간은"+time+"초 입니다.");
		sc.close();
	}
}
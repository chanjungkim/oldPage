package pro03;

public class Test {
	public static void main(String[] args) {
		Controllable test = new Controllable() {         // 익명 클래스에서 인터페이스 상속 받기
			@Override
			public void play() {
				System.out.println("시작");
			}
			@Override
			public void stop() {
				System.out.println("종료...");
			}
		};
		
		test.play();
		test.stop();
	}
}

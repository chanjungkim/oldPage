package pro03;

public class Test {
	public static void main(String[] args) {
		Controllable test = new Controllable() {         // �͸� Ŭ�������� �������̽� ��� �ޱ�
			@Override
			public void play() {
				System.out.println("����");
			}
			@Override
			public void stop() {
				System.out.println("����...");
			}
		};
		
		test.play();
		test.stop();
	}
}

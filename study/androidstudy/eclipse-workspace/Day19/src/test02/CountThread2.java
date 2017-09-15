package test02;

public class CountThread2 implements Runnable{       // 두 번 째 쓰래드
	@Override
	public void run() {
		for(int i = 0 ; i < 20 ; i++) {
			System.out.println("인터페이스 버전 쓰레드: 0"+i);
			
			try {
				Thread.sleep(500);				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}

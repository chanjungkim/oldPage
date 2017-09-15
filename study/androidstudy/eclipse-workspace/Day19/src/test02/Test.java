package test02;

public class Test {
	public static void main(String[] args)  {
		CountThread t = new CountThread();
		Thread tt = new Thread(t);
		
		//tt.start();   // 동시작업
		
		tt.run();     // 순차작업. CountThread 이후 메인쓰레드 시작
		
		for(int i = 10 ; i > 0 ; i--) {
			System.out.println("메인:"+i);
			
			try {
			Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

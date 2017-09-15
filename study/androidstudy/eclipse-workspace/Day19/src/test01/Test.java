package test01;

public class Test {
	public static void main(String[] args) {
		String msg = "메인쓰레드";
		
		CountThread t = new CountThread(); // 일꾼 고용
		t.start(); // main 혼자만이 아닌 Thread와 동시 작업
		for(int i = 20 ; i > 0 ; i--) {
			System.out.println(msg+":"+i);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

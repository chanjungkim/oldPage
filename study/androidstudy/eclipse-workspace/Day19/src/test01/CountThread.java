package test01;

public class CountThread extends Thread{
	@Override
	public void run() {
		for(int i = 0 ; i < 20 ; i++) {
			System.out.println("CountThread ÀÛ¾÷Áß: 0"+i);
			
			try {
				Thread.sleep(500);				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

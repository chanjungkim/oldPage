package test02;

public class Test {
	public static void main(String[] args)  {
		CountThread t = new CountThread();
		Thread tt = new Thread(t);
		
		//tt.start();   // �����۾�
		
		tt.run();     // �����۾�. CountThread ���� ���ξ����� ����
		
		for(int i = 10 ; i > 0 ; i--) {
			System.out.println("����:"+i);
			
			try {
			Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

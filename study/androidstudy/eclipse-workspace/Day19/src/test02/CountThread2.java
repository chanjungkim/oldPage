package test02;

public class CountThread2 implements Runnable{       // �� �� ° ������
	@Override
	public void run() {
		for(int i = 0 ; i < 20 ; i++) {
			System.out.println("�������̽� ���� ������: 0"+i);
			
			try {
				Thread.sleep(500);				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}

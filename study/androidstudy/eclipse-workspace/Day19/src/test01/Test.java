package test01;

public class Test {
	public static void main(String[] args) {
		String msg = "���ξ�����";
		
		CountThread t = new CountThread(); // �ϲ� ���
		t.start(); // main ȥ�ڸ��� �ƴ� Thread�� ���� �۾�
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

package test01;

import java.util.Random;

public class Boy {
	public void doSomething()  {
		System.out.println("�谡 ������.");

		try {
			// �ٽ� ���ɻ���(���൵�� ���� �߻��� �� ����)
			System.out.println("�������� �����.");
			if(new Random().nextBoolean()) {
				System.out.println("���� ����!!!");
				throw new Exception("�ҳ���!!!");
			}
			System.out.println("������ �Դ´�.");
			// Ʈ����� Ŀ��(�۾� ���� �Ϸ�)
		}catch(Exception ex){
			// Ʈ����� �ѹ�(����ó��)
			System.out.println("������ �θ���.");
		}finally {
			// �ڿ�
			System.out.println("�������� �Ѵ�.");
		}		
	}
}

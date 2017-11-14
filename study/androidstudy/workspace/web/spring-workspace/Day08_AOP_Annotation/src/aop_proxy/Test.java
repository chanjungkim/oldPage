package aop_proxy;

public class Test {

	public static void main(String[] args) throws Exception {
		// �ٽ� ���ɻ��� ���� ��ü
		Person boy = new Boy();
		Person girl = new Girl();
		
		// ���Ͻ�
		PersonProxy proxy = new PersonProxy();
		
		// ������ɻ��� ���� ��ü���� ���Ͻÿ� ����
		proxy.setBefore(new CBefore()); 
		proxy.setAfter(new CAfter());
		proxy.setAfterReturning(new CAfterReturning());
		proxy.setAfterThrowing(new CAfterThrowing());
		
		// �ٽɰ��ɻ��� ���� ��ü ����
		proxy.setPerson(boy); //boy�� �ٽɰ��ɻ����� Ʋ�� ���� ����
		proxy.doSomething(100); 
		
		System.out.println();
		
		// �ٽɰ��ɻ��� ���� ��ü ��ü
		proxy.setPerson(girl); //girl�� �ٽɰ��ɻ����� Ʋ�� �������
		proxy.doSomething(100); 
	}
}

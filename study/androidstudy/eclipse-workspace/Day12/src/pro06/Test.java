package pro06;

public class Test {
	public static void main(String[] args) {
		Book b = new Book();
		b.setAuthor("ȫ�浿");
		b.setNumber("19292");
		b.setTitle("ȫ�浿��");
		Novel n = new Novel();
		n.setAuthor("�罺����");
		n.setDelayDays(5);
		n.setNumber("29192");
		n.setTitle("����");
		Poet p = new Poet();
		p.setAuthor("�ϵ���");
		p.setDelayDays(10);
		p.setNumber("82781");
		p.setTitle("����ʹ�");
		ScienceFiction s = new ScienceFiction();
		s.setAuthor("���� �Ͻ�Ʈ��");
		s.setDelayDays(1);
		s.setNumber("999921");
		s.setTitle("�ϱ� Ž���");
		System.out.println("----------------------");
		System.out.println(b);
		System.out.println("----------------------");
		System.out.println(n);
		System.out.println("----------------------");
		System.out.println(p);
		System.out.println("----------------------");
		System.out.println(s);
	}
}

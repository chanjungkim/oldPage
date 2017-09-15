package pro06;

public class Test {
	public static void main(String[] args) {
		Book b = new Book();
		b.setAuthor("È«±æµ¿");
		b.setNumber("19292");
		b.setTitle("È«±æµ¿Àü");
		Novel n = new Novel();
		n.setAuthor("Åç½ºÅäÀÌ");
		n.setDelayDays(5);
		n.setNumber("29192");
		n.setTitle("º½³¯");
		Poet p = new Poet();
		p.setAuthor("ÇÏµ¿±Õ");
		p.setDelayDays(10);
		p.setNumber("82781");
		p.setTitle("º¸°í½Í´Ù");
		ScienceFiction s = new ScienceFiction();
		s.setAuthor("·çÀÌ ¾Ï½ºÆ®·Õ");
		s.setDelayDays(1);
		s.setNumber("999921");
		s.setTitle("ºÏ±Ø Å½Çè±â");
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

import java.util.Calendar;
import java.util.Date;

public class Test04 {
	public static void main(String[] args) {
		Date now = new Date();
		
		System.out.println(now);
		
		System.out.println("���� �⵵: "+(now.getYear()+1900));
		System.out.println("���� ��: "+(now.getMonth()+1));
		System.out.println("���� ��: "+now.getDate());
		Calendar c = Calendar.getInstance();
		
		System.out.println("���� �⵵: "+c.get(Calendar.YEAR));
		System.out.println("���� ��: "+(c.get(Calendar.MONTH)+1));
		System.out.println("���� ��: "+c.get(Calendar.DAY_OF_MONTH));
	}
}

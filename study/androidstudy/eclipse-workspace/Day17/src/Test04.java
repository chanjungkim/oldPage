import java.util.Calendar;
import java.util.Date;

public class Test04 {
	public static void main(String[] args) {
		Date now = new Date();
		
		System.out.println(now);
		
		System.out.println("현재 년도: "+(now.getYear()+1900));
		System.out.println("현재 월: "+(now.getMonth()+1));
		System.out.println("현재 일: "+now.getDate());
		Calendar c = Calendar.getInstance();
		
		System.out.println("현재 년도: "+c.get(Calendar.YEAR));
		System.out.println("현재 월: "+(c.get(Calendar.MONTH)+1));
		System.out.println("현재 월: "+c.get(Calendar.DAY_OF_MONTH));
	}
}

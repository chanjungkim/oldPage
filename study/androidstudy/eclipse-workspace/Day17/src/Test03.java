import java.util.StringTokenizer;

public class Test03 {
	public static void main(String[] args) {
		String s = "aa b ccc, dd";
		
		StringTokenizer st = new StringTokenizer(s);
		
		System.out.println(("token count: "+st.countTokens()));
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}

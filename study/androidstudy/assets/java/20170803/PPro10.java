
public class PPro10 {
	public static void main(String[] args) {
		long a = 0, b = 1, c;
		int i;
		
		for(i = 2; i<= 10 ; i++) {
			c = a+b;
			a = b;
			b = c;
			
			System.out.println(b);
		}
	}
}

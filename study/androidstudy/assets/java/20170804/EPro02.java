
public class EPro02 {
	public static void main(String[] args) {
		int count =0;
		for(int i = 1 ; i <= 100 ; i++) {
			if( i % 3 == 0 && i % 5 == 0) {
				System.out.print(i+" ");
				count++;
			}else if( i % 3 == 0) {
				System.out.print("* ");
				count++;
			}else if(i % 5 == 0) {
				System.out.print("# ");
				count++;
			}
			if(count % 10 == 0) {
				System.out.println();
				count = 0;
			}
		}
	}
}

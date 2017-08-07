
public class EPro09 {
	public static void main(String[] args) {
		
		int total = 0;
		int i = 1;
		while( total < 100) {
			if(i % 2 == 0) {
				total-=i;
				i++;
			}else {
				total+=i;
				i++;
			}
		}
		
		System.out.println(i+"까지 더하면 "+total+"이 나옵니다.");
	}
}

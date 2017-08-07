public class EPro07 {
	public static void main(String[] args) {
		int total = 0;
		int count = 0;
		
		for(int i = 1 ; i <=100 ; i++) {
			total+=i;
			count++;
			if(count==10 && i != 100) {
				System.out.print(total+", ");
				total = 0;
				count = 0;
			}else if(i == 100) {
				System.out.println(total);
			}
		}
	}
}

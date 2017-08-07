import java.util.Scanner;

public class Pro01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		int a = 0 ; int b = 0;
		
		do {
			int i = 0;
			System.out.print("¾È³çÇÏ¼¼¿è. Àú´Â °è»ê±â¿¹¿è. Ã¹ ¼ýÀÚ¸¦ ÀÔ·ÂÇÏ¼¼¿°.: ");
			a = sc.nextInt();
			int t = 0;
			
			System.out.print("¿øÇÏ´Â °è»êÀ» ÇØº¸¾Æ¿è.(1:µ¡¼À, 2:»¬¼À, 3:°ö¼À, 4:³ª´°¼À, 5:³ª¸ÓÁö): ");
			i = sc.nextInt();

			System.out.print("µÎ ¹ø Â° ¼ýÀÚ¸¦ ÀÔ·ÂÇÏ¼¼¿°.: ");
			b = sc.nextInt();
			
			if( i == 1) {
				t = a + b;
			} else if ( i == 2 ){
				t = a - b;
			} else if ( i == 3) {
				t = a * b;
			} else if ( i == 4) {
				t = a / b;
			} else {
				t = a % b;
			}
			
			System.out.print("°á°ú°ªÀº "+t+"¿°. Á¾·á ÇÒ·¡¿è?(1:ÀÀ 2:¾Æ´Ï¿°): ");
			if( sc.nextInt() != 2) {
				System.out.println("ºüºü¿°~");
			}
		}
		while( flag );
		
		sc.close();
	}
}
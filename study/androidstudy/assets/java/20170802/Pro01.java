import java.util.*;

public class Lab {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean isCapital;
		int citizens;
		int riches;
		
		System.out.print("수도입니까?(수도:1 수도아님:0)");
		isCapital = (sc.nextInt()==1)?true:false;
		System.out.print("인구(단위: 만)");
		citizens = sc.nextInt();
		System.out.print("부자의 수(단위: 만)");
		riches = sc.nextInt();
		
		boolean isMetro = (isCapital && citizens >= 100) || ( riches >= 50 );
		
		System.out.println("메트로폴리스 여부: "+isMetro);
	}
}


/*Exercise
  1. byte, char, int, long, float, double
  2. 1, 2, 4, 5
  3. 1, 0.4, 1, 5
  4. 11, 2, 5 / 33, 2, 5 / 34, 2, 36
  5. int sum / char c1 = 'a', c2 = 'b' / double distance = 9.12345
  6. x!=0 / x%2==0 / (x<y)&&(x<z)
*/
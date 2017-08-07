import java.util.Scanner;

public class WTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초 시간을 입력하시오: ");
		int time = sc.nextInt();
		int h, m, s;
		h = m = s = 0;
		
		while(time > 0) {
			if(time >= 3600) {
				h++;
				time-=3600;
			}else if(time >= 60) {
				m++;
				time-=60;
			}else {
				s = time;
				time=0;
			}
		}
		
		System.out.println(h+"시"+m+"분"+s+"초");
		sc.close();
		
	}
}

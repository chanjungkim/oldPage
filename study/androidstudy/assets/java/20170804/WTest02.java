import java.util.Scanner;

public class WTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �ð��� �Է��Ͻÿ�: ");
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
		
		System.out.println(h+"��"+m+"��"+s+"��");
		sc.close();
		
	}
}

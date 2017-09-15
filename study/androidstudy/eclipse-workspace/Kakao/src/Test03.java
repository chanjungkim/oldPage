import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test03 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = st.nextToken();
		
		str = solution(str);
		
		System.out.println(str);
	}
	public static String solution(String sentence) {
		String answer = "";
		int len = sentence.length();
				
		for(int i = 0 ; i < len ; i++) {
			if( sentence.charAt(i) < 'a' ) {
				System.out.print(sentence.charAt(i));
			}
		}
		
		return answer;
	}
}

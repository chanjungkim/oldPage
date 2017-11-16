import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder("");
		
		LinkedHashSet<Short> list = new LinkedHashSet<>();
		
		while(st.hasMoreTokens()) {
			Short s = Short.parseShort(st.nextToken());

			if(!list.contains(s)) {
				list.add(s);
				sb.append(s+" ");
			}
		}
		System.out.println(sb);
		br.close();
	}
}
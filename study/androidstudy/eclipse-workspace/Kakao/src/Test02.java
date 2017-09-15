import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test02 {
	static int MOD = 20170805;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int[][] cityMap = new int[m][n];
		int res;
		
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++)
				cityMap[i][j]=Integer.parseInt(st.nextToken());
		}
		
		res = solution(m, n, cityMap);
		
		System.out.println(res);
	}
	public static int solution(int m, int n, int[][] cityMap) {
		int answer = 0;
		return answer;
	}
}
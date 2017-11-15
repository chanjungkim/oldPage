import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	static int ans;
	static int n;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long total = Long.parseLong(br.readLine());
//		long count = 0;
		br.close();
		
		if(total%2==1) {
			System.out.println("SK");
		}else {
			System.out.println("CY");
		}
	}
}
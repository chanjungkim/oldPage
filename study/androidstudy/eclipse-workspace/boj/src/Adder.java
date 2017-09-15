import java.util.Scanner;
import java.util.Stack;

public class Adder{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution solution = new Solution();
		
		String s = sc.next();
		int res = solution.solution(s);
		
		System.out.println(res);
		
		sc.close();
	}
}

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        int len = s.length();
    	Stack<String> st = new Stack<String>();

    	for(int i = len-1 ; i > 1 ; i--) {
    		st.push(s.substring(i, i-1));
    	}
    	for(String i : st ) {
    		System.out.println(peek(i));
    	}
    	
        return answer;
    }
}
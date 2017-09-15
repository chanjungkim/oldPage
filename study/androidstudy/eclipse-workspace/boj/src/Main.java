import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
    
class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String str = br.readLine();
    	str.toUpperCase();
    	
    	int count = 0;
    	int max = 0;
    	int[] arr = new int[26];
    	
		for(int i = 65 ; i < 91; i++) {
			arr[str.charAt(i-65)]++;
    	}
		
		for(int i = 0 ; i < 26; i++) {
			if(max < arr[i]) {
				max = arr[i];
				arr[i] = 0;
			}
    	}
		for(int i = 0 ; i < 26; i++) {
			if(max == arr[i]) {
				System.out.println("?");
				return;
			}
    	}
		
		System.out.println((char)(max));
   }
}
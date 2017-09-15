import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
	
public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String[] kroatiaChars = {"c=", "c-", "dz=", "d-", "lj", "nj","s=", "z="};
    	
    	String str = br.readLine();
    	int count=0;
    	int len = str.length();
    	String temp="";
    	for(int i = 0 ; i < len-2 ; i++) {
    		temp+=str.substring(i, i+2);
    		for(int j = 0 ; j < 8 ; j++) {
    			if(temp.equals(kroatiaChars[j])) count++;
    		}
    		temp="";
    	}
    
    	System.out.println(count*2);
    	
    	br.close();
    }
}
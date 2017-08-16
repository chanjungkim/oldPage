package my;

import java.util.Scanner;

public class Pro02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int[] checker = new int[10];
		
		for(int i = 0 ; i < 10 ; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] < 11) {
				checker[0]++;
			}else if(arr[i] < 21){
				checker[1]++;
			}else if(arr[i] < 31){
				checker[2]++;
			}else if(arr[i] < 41){
				checker[3]++;
			}else if(arr[i] < 51){
				checker[4]++;
			}else if(arr[i] < 61){
				checker[5]++;
			}else if(arr[i] < 71) {
				checker[6]++;
			}else if(arr[i] < 81) {
				checker[7]++;
			}else if(arr[i] < 91) {
				checker[8]++;
			}else {
				checker[9]++;
			}
		}
		int start = 1;
		int end = 10;
		for(int i: checker) {
			System.out.print(start+" - "+end+": ");
			while( i > 0) {
				System.out.print("*");
				i--;
			}
			System.out.println();
			start +=10;
			end +=10;
		}
		
		sc.close();
	}
}

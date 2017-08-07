import java.util.*;

public class Lab {
	public static void main(String[] args) {
		double w;
		double h;
		double area;
		double perimeter;
		
		w = 10.0;
		h = 5.0;
		
		area = w*h;
		perimeter = 2*(w+h);
		
		System.out.println("사각형의 넓이: "+area);
		System.out.println("사각형의 둘레: "+perimeter);
		
		// 1. Box에서 Rectangle 변경하면 클래스명에 빨간줄이 쳐지고 실행하면 아무일도 일어나지 않는다.
		// 2
		System.out.print("사각형의 넓이: "+area+" 사각형의 둘레: "+perimeter);
		
		// 3. println은 출력 후에 다음 줄로 넘어가고, print는 한 줄만 출력한다.
		System.out.println();
		System.out.println();
		System.out.print("사각형의 넓이: "+area+" 사각형의 둘레: "+perimeter);
		System.out.println();
		System.out.println();
		
		// 4
		Scanner sc = new Scanner(System.in);
		w = sc.nextDouble();
		h = sc.nextDouble();
		
		area = w*h;
		perimeter = 2*(w+h);
		
		System.out.println("사각형의 넓이: "+area+" 사각형의 둘레: "+perimeter);
		
		sc.close();
	}
}

// 1. 3, /* 주석 */이 올바르다
/*
 * 2. 다음과 같이 작성해야한다.
 * class MyProgram{  // public -> class
 *    public class void main(String args[]){ // 모든 줄에서 semi-colon 빠짐 
 *       int x, y;
 *       x = 10;  
 *       y = 20;  
 *       int sum; // sum 변수 선언이 안되었음.
 *       sum = x + y; 
 *       System.out.println("합은"+sum); // system이 아닌 대문자로 System임. '이 아닌 "임.
 *    } // main 메소드 닫는 괄호 빠짐
 * }
*/
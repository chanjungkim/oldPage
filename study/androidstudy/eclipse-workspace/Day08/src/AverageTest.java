class Average {
	int getAverage(int a, int b) {
		return (a+b)/2;
	}
	int getAverage(int a, int b, int c) {
		return (a+b+c)/3;
	}
}

public class AverageTest{
	public static void main(String[] args) {
		Average av = new Average();
		
		System.out.println(av.getAverage(5, 10));
		System.out.println(av.getAverage(99, 2, 42));
	}
}
package my;

// 1.
// -1. int[] studentNumbers = new int[30];
// -2. double[] values = { 1.2, 3.3, 6.7 };
// 2.
// -1. new int[100]; 이 되어야함.
// -2. double[] rainfalls = new double[100]; 이라고 해야함.
// 3.
// -1. 0 ~ 4 까지 유효
// -2. OutOfBoundaries. ERROR가 뜬다.
// 4.
/*
 * void init(double[] values){
 * 	for(int i = 0 ; i < values.length ; i++){
 * 		values[i] = 0;
 * }
 */
/*5.  
class Ex01{
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = new int[5];
		b = a;
		
		for(int i : b) {
			System.out.println(i);
		}
	}
}
// 결과: 복사가 된다.
*/
// 6. employees[0]을 제외한 나머지 9개의 index와 name.
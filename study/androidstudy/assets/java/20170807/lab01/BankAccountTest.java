package lab01;
public class BankAccountTest{
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		
		b.balance=500;
		b.getBalance();
		b.withdraw(60);
		b.getBalance();
		b.addInterest(b.balance);
		b.getBalance();
		
		/*
		 * 3. 변경할 필요 없다.
		 * 4. default는 같은 패키지에서 접근이 안되어 public을 붙여준다.
		 */
		
		/*1.
		 * public class NumberBox{
		 * 	public int ivalue;
		 * 	public float fvalue;
		 * 	public NumberBox(int a, float b){
		 * 		this.ivalue = a;
		 * 		this.fvalue = b;
		 * }
		 * 
		 * 2.
		 * int year; int month; int day;
		 * public void setDate(int y, int m, int d){
		 * 	this.year = y; this.month = m; this.day = d;
		 * }
		 * public void getDate(){
		 * 	Systemm.out.println(m+"년 "+m+"월 "+d+"일");
		 * }
		 * 
		 * 3. 
		 * clas Rectangle{
		 * 	int width, height;
		 * 	int area(int width, int height) {
		 * 		return width*height;
		 * }
		 * public class Test {
		 *  public static void main(String[] args){
		 *  	Rectangle myRect = new Rectangle();
		 *   	myRect.width = 10;
		 *   	myRect.height = 20;
		 *   	System.out.println("면적은 "+myRect.area(myRect.width, my Rect.height));
		 *  }
		 * }
		 * 
		 * 4.
		 * 생각이 현실이 된다.
		 * 문자열의 길이는 7
		 * abcdefg
		 * 2 + 3 = 5
		 * 2 + 3 = 5
		 */

	}
}

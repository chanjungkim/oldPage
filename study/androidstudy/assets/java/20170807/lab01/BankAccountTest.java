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
		 * 3. ������ �ʿ� ����.
		 * 4. default�� ���� ��Ű������ ������ �ȵǾ� public�� �ٿ��ش�.
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
		 * 	Systemm.out.println(m+"�� "+m+"�� "+d+"��");
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
		 *   	System.out.println("������ "+myRect.area(myRect.width, my Rect.height));
		 *  }
		 * }
		 * 
		 * 4.
		 * ������ ������ �ȴ�.
		 * ���ڿ��� ���̴� 7
		 * abcdefg
		 * 2 + 3 = 5
		 * 2 + 3 = 5
		 */

	}
}

package test01;

public class Date {
	private int year = 2017;
	private String month = "1월";
	private int day = 1;
	
	public void setDay(int d) {
		if(d<=31 && d>=1) {
			day = d;
		} else {
			System.out.println("부정합한 day정보 입니다.");
		}
	}
	
	public void setMonth(String n) {
		month = n;
	}
	
	public void setYear(int y) {
		year = y;
	}
	
	public int getYear(int y) {
		return year;
	}
	
	public String getMonth() {
		return month;
	}
	
	public int setDay() {
		return day;
	}	
	
	public void printDate() {
		System.out.println(year+"-"+month+"-"+day);
	}
}

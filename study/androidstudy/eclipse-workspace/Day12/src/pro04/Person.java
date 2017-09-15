package pro04;

public class Person implements Comparable{
	private String name;
	private double height;
		
	public Person(String name, double height) {
		this.name=name;
		this.height=height;
	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}
	
	public void printPersonInfo() {
		System.out.println("이름: "+this.name+", 속도: "+this.height);
	}

	@Override
	public int compareTo(Object o) {
		double otherHeight = ((Person)o).height;
		if(this.height > otherHeight) {
			return 1;
		}else if(this.height < otherHeight) {
			return -1;
		}
		return 0;
	}
}

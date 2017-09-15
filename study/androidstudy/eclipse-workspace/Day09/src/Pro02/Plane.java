package Pro02;

public class Plane {
	private String productor;
	private String model;
	private int numOfPassanger;
	private static int numOfPlane=0;
	
	public Plane() {
		this(null, null, 0);
	}
	public Plane(String productor) {
		this(productor, null, 0);
	}
	public Plane(String productor, String model) {
		this(productor, model, 0);
	}
	public Plane(String productor, String model, int num) {
		this.productor=productor;
		this.model=model;
		this.numOfPassanger=num;
		numOfPlane++;          // 주의점!! this()는 이 메소드를 호출해서 numOfPlane은 여기서만 ++해준다.
	}
	
	public void setProductor(String productor) {
		this.productor=productor;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public void setNumOfPassanger(int num) {
		this.numOfPassanger=num;
	}
	public String getProductor() {
		return productor;
	}
	public String getModel() {
		return model;
	}
	public int getNumOfPassanger() {
		return numOfPassanger;
	}
	public String toString() {
		return "제작사: "+productor+", 모델: "+model+", 승객수: "+numOfPassanger+", 보유한 비행기 수: "+numOfPlane;
	}
}

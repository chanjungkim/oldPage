package pro06;

public class SmartPhone extends Phone {
	private String osType;
	private String osVersion;
	private double innerMemorySize;
	private boolean hasCamera;
	private boolean hasBluetooth;
	
	public SmartPhone() {
		this("LG", 200000, "3G", "Android", "4.4.4", 32.0, false, false);
	}
	public SmartPhone(String manufacturer, int price, String communicationType, String osType, String osVersion, double innerMemorySize, boolean hasCamera, boolean hasBluetooth) {
		super(manufacturer, price, communicationType);
		this.osType = osType;
		this.osVersion = osVersion;
		this.innerMemorySize = innerMemorySize;
		this.hasCamera = hasCamera;
		this.hasBluetooth = hasBluetooth;
	}
	
	public void setOsType(String osType) {
		this.osType = osType;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	public void setInnerMemorySize(double innerMemorySize) {
		this.innerMemorySize = innerMemorySize;
	}
	public void setCamera(boolean hasCamera) {
		this.hasCamera = hasCamera;
	}
	public void setBluetooth(boolean hasBluetooth) {
		this.hasBluetooth = hasBluetooth;
	}

	
	public String getOsType() {
		return this.osType;
	}
	public String getOsVersion() {
		return this.osVersion;
	}
	public double getInnerMemorySize() {
		return this.innerMemorySize;
	}
	public boolean hasCamera() {
		return this.hasCamera;
	}
	public boolean hasBluetooth() {
		return this.hasBluetooth;
	}
	
	public String toString() {
		return "제조사: "+super.getManufacturer()+"\n가격: "+super.getPrice()+"\n통신 타입: "+super.getCommunicationType()+"\nOS: "+this.osType+"\nOS Version: "+this.osVersion+"\nMemory Size: "+this.innerMemorySize+"\n카메라 여부: "+this.hasCamera+"\n블루투스: "+this.hasBluetooth();
	}
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("삼성", 70, "4G", "Android", "7.0", 128.0, true, true);
		
		System.out.println(sp);
	}
}

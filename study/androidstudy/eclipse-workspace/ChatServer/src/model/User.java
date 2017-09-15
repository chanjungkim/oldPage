package model;

public class User {

	String id;
	String passwd;
	String name;
	String isMale;
	
	public User(){}

	public User(String id, String passwd, String isMale) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.isMale = isMale;
	}
	

	public User(String id, String passwd, String name, String isMale) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.isMale = isMale;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsMale() {
		return isMale;
	}

	public void setIsMale(String isMale) {
		this.isMale = isMale;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", passwd=" + passwd + ", name=" + name + ", isMale=" + isMale + "]";
	}
	
	
	
	
	
	
}

package multicam.java.hw;

public class Constructor {
	private String name;
	private String id;
	private String pass;
	private String addr;
	
	public Constructor() {
		System.out.println("기본생성자");
	}
	
	public Constructor (String name, String id, String pass, String addr) {
		this.name = name;
		this.id = id;
		this.pass = pass;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}

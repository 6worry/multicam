package exam.mvc;

public class MemberDTO {
	private String id;
	private String pass;
	private String name;
	private String addr;
	private String info;
	
	public MemberDTO() {
		super();
		System.out.println("기본생성자");
	}

	public MemberDTO(String id, String pass, String name, String addr, String info) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.addr = addr;
		this.info = info;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pass=" + pass + ", name=" + name + ", addr=" + addr + ", info=" + info + "]";
	}
}
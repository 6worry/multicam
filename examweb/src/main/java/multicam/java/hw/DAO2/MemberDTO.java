package multicam.java.hw.DAO2;

import java.sql.Date;

public class MemberDTO {
	private String id;
	private String pass;
	private String name;
	private String addr;
	private Date regdate;
	private int point;
	private String info;
	
	public MemberDTO() {
		
	}

	public MemberDTO(String addr) {
		this.addr = addr;
	}
	
	public MemberDTO(String id, String pass) {
		this.id = id;
		this.pass = pass;
	}
	
	public MemberDTO(String id, String pass, String name, String addr, Date regdate, int point, String info) {
		this(id, pass, name, addr, info);
		this.regdate = regdate;
		this.point = point;
	}

	public MemberDTO(String id, String pass, String name, String addr, String info) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.addr = addr;
		this.info = info;
	}
	
	public MemberDTO(String id, String addr, String info) {
		this.id = id;
		this.addr = addr;
		this.info = info;
	}

	@Override
	public String toString() {
		return "MembeDTO [id=" + id + ", pass=" + pass + ", name=" + name + ", addr=" + addr + ", regdate=" + regdate
				+ ", point=" + point + ", info=" + info + "]";
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

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
}
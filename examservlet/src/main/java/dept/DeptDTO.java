package dept;

//member테이블의 레코드를 객체로 정의
public class DeptDTO {
	private String DeptCode;
	private String DeptName;
	private String Tel;
	private String Addr;
	
	public DeptDTO() {
		
	}
	
	public DeptDTO(String DeptCode) {
		super();
		this.DeptCode = DeptCode;
	}

	public DeptDTO(String deptCode, String deptName, String tel, String addr) {
		super();
		DeptCode = deptCode;
		DeptName = deptName;
		Tel = tel;
		Addr = addr;
	}

	@Override
	public String toString() {
		return "DeptDTO [DeptCode=" + DeptCode + ", DeptName=" + DeptName + ", Tel=" + Tel + ", Addr=" + Addr + "]";
	}

	public String getDeptCode() {
		return DeptCode;
	}

	public void setDeptCode(String deptCode) {
		DeptCode = deptCode;
	}

	public String getDeptName() {
		return DeptName;
	}

	public void setDeptName(String deptName) {
		DeptName = deptName;
	}

	public String getTel() {
		return Tel;
	}

	public void setTel(String tel) {
		Tel = tel;
	}

	public String getAddr() {
		return Addr;
	}

	public void setAddr(String addr) {
		Addr = addr;
	}
}
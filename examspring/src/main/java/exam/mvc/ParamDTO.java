package exam.mvc;

public class ParamDTO {
	private String data;
	private String id;
	private String pw;
	
	public ParamDTO() {
		super();
		System.out.println("기본생성자");
	}

	public ParamDTO(String data, String id, String pw) {
		super();
		this.data = data;
		this.id = id;
		this.pw = pw;
	}
	
	public String getData() {
		System.out.println("getdata");
		return data;
	}
	public void setData(String data) {
		System.out.println("setdata");
		this.data = data;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "ParamDTO [data=" + data + ", id=" + id + ", pw=" + pw + "]";
	}
}
package multicam.java.hw.DTO;

import java.util.Date;

public class StudentDTO {
	private int num;
	private String name;
	private int kor;
	private int math;
	private int eng;
	private Date regdate;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int maht) {
		this.math = maht;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	public StudentDTO() {
		
	}
	
	public StudentDTO(int num, String name, int kor, int math, int eng, Date regdate) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.regdate = regdate;
	}
	
	public StudentDTO(int num, String name, int kor, int math, int eng) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.regdate = new Date();
	}
	
	@Override
	public String toString() {
		return "StudentDTO [num=" + num + ", name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng
				+ ", regdate=" + regdate + "]";
	}
}
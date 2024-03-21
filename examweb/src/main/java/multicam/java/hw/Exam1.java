package multicam.java.hw;

public class Exam1 {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.setId("12345");
		emp.setName("홍길동");
		emp.setBaseSalary(50000);
		System.out.println( emp.toString() );
		System.out.println( "봉급 = " + emp.getSalary( 30 ) );
	}
}

class Emp {
	private String id;
	private String name;
	private int baseSalary;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBaseSalary() {
		return baseSalary;
	}
	
	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public double getSalary(double bonus) {
		 return baseSalary + baseSalary * bonus;
	}
	
	public String toString() {
		return (name + "(" + id + ") 사원의 기본급은 " + baseSalary + "원 입니다.");
	}
}
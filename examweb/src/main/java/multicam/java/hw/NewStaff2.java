package multicam.java.hw;

public class NewStaff2 extends common{
	String dept;
	
	public NewStaff2() {
		
	}

	public NewStaff2(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void display() {
		super.display();
		System.out.println(" 부서: " + dept);
	}
}

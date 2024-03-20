package multicam.java.hw;

public class NewStaff {
	private String name;
	private int age;
	private String dept;
	
	public NewStaff() {
		
	}

	public NewStaff(String name, int age, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void display() {
		System.out.println("이름: " + name + " 나이: " + age + " 부서: " + dept);
	}
}

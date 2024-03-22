package multicam.java.hw;

public class TestPerson {

	public static void main(String[] args) {
		NewStaff2 obj = new NewStaff2("전정국", 25, "작곡가");
		NewStudent2 obj2 = new NewStudent2("김석진", 31, 202001);
		NewTeacher2 obj3 = new NewTeacher2("김남준", 30, "JAVA");
		
		obj.display();
		obj2.display();
		obj3.display();
	}
}

class common {
	private String name;
	private int age;
	
	public common() {
		
	}
	
	public common(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void display() {
		System.out.print("이름: " + name + " 나이: " + age);
	}
}
package multicam.java.hw;

public class TestSchool {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("김석진");
		s.setAge(31);
		s.setId(202001);

		Teacher t = new Teacher ();
		t.setName("김남준");
		t.setAge(30);
		t.setSubject("JAVA");

		Staff  e = new Staff();
		e.setName("전정국");
		e.setAge(25);
		e.setDept("작곡과");
		
		s.display();
		t.display();
		e.display();
	}
}

class Student {
	private String name;
	private int age;
	private int id;
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void display() {
		System.out.println("이름: " + name + " 나이: " + age + " 학번: " + id);
	}
}

class Teacher {
	private String name;
	private int age;
	private String subject;
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void display() {
		System.out.println("이름: " + name + " 나이: " + age + " 담당과목: " + subject);
	}
}

class Staff {
	private String name;
	private int age;
	private String dept;
	
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
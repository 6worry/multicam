package multicam.java.hw;

public class NewTeacher {
	private String name;
	private int age;
	private String subject;
	
	public NewTeacher() {
		
	}
	
	public NewTeacher(String name, int age, String subject) {
		super();
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
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

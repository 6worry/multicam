package multicam.java.hw;

public class NewTeacher2 extends common{
	String subject;
	
	public NewTeacher2() {
		
	}
	
	public NewTeacher2(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void display() {
		super.display();
		System.out.println(" 담당과목: " + subject);
	}
}

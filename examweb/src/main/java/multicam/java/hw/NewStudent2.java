package multicam.java.hw;

public class NewStudent2 extends common{
	int id;
	
	public NewStudent2() {
		
	}
	
	public NewStudent2(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void display() {
		super.display();
		System.out.println(" 학번: " + id);
	}
}
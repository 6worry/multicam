package multicam.java.hw;

public class SchoolTest {
	public static void main(String[] args) {
		NewStudent s = new NewStudent("김석진", 31, 202001);

		NewTeacher t = new NewTeacher ("김남준", 30, "JAVA");

		NewStaff  e = new NewStaff("전정국", 25, "작곡가");
		
		s.display();
		t.display();
		e.display();
	}
}
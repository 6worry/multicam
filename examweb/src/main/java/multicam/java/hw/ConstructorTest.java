package multicam.java.hw;

public class ConstructorTest {
	public static void main(String[] args) {
		MovieTest m = new MovieTest();
		Constructor obj = new Constructor();
		System.out.println(obj);
		
		Constructor obj2 = new Constructor();
		obj2.setName("JIN__F");
		obj2.setAddr("Seoul");
		obj2.setId("6worry");
		obj2.setPass("4321");
		System.out.println(obj2.getName() + ", " + obj2.getAddr() + ", " + obj2.getId() + ", " + obj2.getPass());
		
		Constructor obj3 = new Constructor("JIN__F", "6worry", "4321", "Seoul");
		System.out.println(obj3.getName() + ", " + obj3.getAddr() + ", " + obj3.getId() + ", " + obj3.getPass());
	}
}

package multicam.java.hw;

public class Sparrow {
	private String name;
	private String legs;
	private String length;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLegs() {
		return legs;
	}

	public void setLegs(String legs) {
		this.legs = legs;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String toString() {
		return "참새의 이름은 " + name + "입니다.";
	}
	
	public void fly() {
		System.out.println("참새(" + name + ")가 날아다닙니다.");
	}
	
	public void sing() {
		System.out.println("참새(" + name + ")가 소리내어 웁니다.");
	}
}
package exam;

public class LgTV implements TV {
	public void turnOn() {
		System.out.println("LgTV---전원 켠다.");
	}

	public void turnOff() {
		System.out.println("LgTV---전원 끈다.");
	}

	public void volumeUp() {
		System.out.println("LgTV---소리 올린다.");
	}

	public void volumeDown() {
		System.out.println("LgTV---소리 내린다.");
	}
}
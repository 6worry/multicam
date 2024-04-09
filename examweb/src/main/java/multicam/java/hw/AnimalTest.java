package multicam.java.hw;

public class AnimalTest {
	public static void main(String[] args) {
		Animal dog = new Dog(8);
		Animal chicken = new Chicken(3);
		Chicken cheatableChicken = new Chicken(5);
		
		if(cheatableChicken instanceof Chicken){
			cheatableChicken.fly();
		}
		
		for(int i = 1; i <= 3; i++) {
			dog.run(1);
			chicken.run(1);
			cheatableChicken.run(1);
			
			System.out.println(i + "시간 후");
            System.out.println("개의 이동거리 = " + dog.getDistance());
            System.out.println("닭의 이동거리 = " + chicken.getDistance());
    		System.out.println("날으는 닭의 이동거리 = " + cheatableChicken.getDistance());
		}
	}
}

abstract class Animal {
	int speed;
	double distance;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	public Animal() {
		
	}
	
	public Animal(int speed) {
		this.speed = speed;
	}
	
	abstract void run(int hours);
}

class Dog extends Animal{
	public Dog() {
		super();
	}

	public Dog(int speed) {
		super(speed);
	}
	
	@Override
	public void run(int hours) {
		distance += speed * hours / 2;
	}
}

class Chicken extends Animal implements Cheatable {
	public Chicken() {
		super();
	}

	public Chicken(int speed) {
		super(speed);
	}
	
	@Override
	public void run(int hours) {
		distance += speed * hours;
	}
	
	public void fly() {
		speed *= 2;
	}
}

interface Cheatable {
	void fly();
}
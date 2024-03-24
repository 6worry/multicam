package multicam.java.hw;

public class Wheeler {
	protected int velocity;
	protected String carName;
	protected int wheelNumber;

	public Wheeler() {
		
	}
	
	public Wheeler(String carName, int velocity, int wheelNumber) {
		super();
		this.velocity = velocity;
		this.carName = carName;
		this.wheelNumber = wheelNumber;
	}

	public int getVelocity() {
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getWheelNumber() {
		return wheelNumber;
	}

	public void setWheelNumber(int wheelNumber) {
		this.wheelNumber = wheelNumber;
	}

	public void speedUp(int speed) {
		
	}

	public void speedDown(int speed) {
	}

	public void stop() {
		velocity = 0;
		System.out.println("정지상태로 속도를 0으로 초기화합니다.");
	}
}

class Truck extends Wheeler{
	public Truck() {
		
	}
	
	public Truck(String carName, int velocity, int wheelNumber) {
		super(carName, velocity, wheelNumber);
	}
	
	public void speedUp(int speed) {
		velocity = speed * 5 + velocity;
		
		if(velocity > 100) {
			velocity = 100;
			
			System.out.println(carName + "의 최고속도위반으로 속도를 " + velocity + "로 내립니다.");
		}
		
		System.out.println(carName + "의 현재 속도는 " + velocity + " 입니다.");
	}
	
	public void speedDown(int speed) {
		velocity = velocity - speed * 5;
		
		if(velocity < 50) {
			velocity = 50;
			
			System.out.println(carName + "의 최저속도위반으로 속도를 " + velocity + "로 올립니다.");
		}
		
		System.out.println(carName + "의 현재 속도는 " + velocity + " 입니다.");
	}
	
	public void stop() {
		super.stop();
	}
}

class Bike extends Wheeler{
	public Bike() {
		
	}
	
	public Bike(String carName, int velocity, int wheelNumber) {
		super(carName, velocity, wheelNumber);
	}
	
	public void speedUp(int speed) {
		velocity = speed + velocity;
		
		if(velocity > 40) {
			velocity = 40;
			
			System.out.println(carName + "의 최고속도위반으로 속도를 " + velocity + "로 내립니다.");
		}
		
		System.out.println(carName + "의 현재 속도는 " + velocity + " 입니다.");
	}
	
	public void speedDown(int speed) {
		velocity = velocity - speed;
		
		if(velocity < 10) {
			velocity = 10;
			
			System.out.println(carName + "의 최저속도위반으로 속도를 " + velocity + "로 올립니다.");
		}
		
		System.out.println(carName + "의 현재 속도는 " + velocity + " 입니다.");
	}
	
	public void stop() {
		super.stop();
	}
}
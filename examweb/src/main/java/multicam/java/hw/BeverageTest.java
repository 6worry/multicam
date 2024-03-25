package multicam.java.hw;

public class BeverageTest {
	public static void main(String[] args) {
        Coffee obj1 = new Coffee("커피",2500,"아메리카노");
        Coffee obj2 = new Coffee("커피",2700,"카페라뗴");
        Coffee obj3 = new Coffee("커피",300,"카푸치노");
        obj1.print();
        obj2.print();
        obj3.print();
	}
}

class Beverage {
	private String type;
	private int price;
	
	public Beverage() {
		
	}
	
	public Beverage(String type, int price) {
		this.type = type;
		this.price = price;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void display() {
		System.out.print("타입: " + type + ", 가격: " + price);
	}
}

class Coffee extends Beverage {
	private String name;
	
	public Coffee() {
		
	}
	
	public Coffee (String type, int price, String name) {
		super(type, price);
		this.name = name;
	}
	
	public void print() {
		super.display();
		System.out.println(", 이름: " + name);
	}
}
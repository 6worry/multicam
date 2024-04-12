package multicam.java.hw;

public class CoffeShop {
	public static void main(String[] args) {
		System.out.println("****java nara CoffeeShop영업개시****");
		Beverage2[] beverage = new Beverage2[5];
		beverage[0] = new Coffee2("Cappuccino");
		beverage[1] = new Coffee2("CafeLatte");
		beverage[2] = new Tea("ginsengTea");
		beverage[3] = new Coffee2("CafeLatte");
		beverage[4] = new Tea("redginsengTea");
		getSalesInfo(beverage);
		System.out.println("총 판매 금액==>"+getTotalPrice(beverage));
		System.out.println("Coffe의 판매 개수=>"+Coffee2.amount+"잔");
		System.out.println("Tea의 판매 개수=>"+Tea.amount+"잔");
	}
	
	private static int getTotalPrice(Beverage2[] beverage) {
		int sum = 0;
		
		for(int i = 0; i < beverage.length; i++) {
			sum = sum + beverage[i].getPrice();
		}
		
		return sum;
	}
	//결과와 같이 가격을 구하고 판매정보를 출력할 수 있도록 getSalesInfo메소드를 작성하세요

	private static void getSalesInfo(Beverage2[] beverage) {
		for(int i = 0; i < beverage.length; i++) {
			System.out.print((i+1) + "번째 ");
			beverage[i].print();
		}
	}	
	//결과와 같이 총 판매금액을 구할 수 있도록 getTotalPrice메소드를 작성하세요.
}

abstract class Beverage2 {
	private String name;
	protected int price;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Beverage2() {
		super();
	}
	
	public Beverage2(String name) {
		this.name = name;
	}
	
	public abstract void calcPrice();
	
	public void print() {
		System.out.println("판매 음료는 " + name + "이며 가격은 " + price);
	}
}

class Coffee2 extends Beverage2 {
	static int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		Coffee2.amount = amount;
	}
	
	public Coffee2() {
		super();
	}
	
	public Coffee2(String name) {
		super(name);
		amount++;
		calcPrice();
	}
	
	public void calcPrice() {
		switch (getName()) {
			case "Americano": 
				setPrice(1500);
				break;
				
			case "CafeLatte": 
				setPrice(2500);
				break;
				
			case "Cappuccino": 
				setPrice(3000);
				break;
		}
	}
}

class Tea extends Beverage2 {
	static int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		Tea.amount = amount;
	}
	
	public Tea() {
		super();
	}
	
	public Tea(String name) {
		super(name);
		amount++;
		calcPrice();
	}

	@Override
	public void calcPrice() {
		switch (getName()) {
			case "lemonTea": 
				setPrice(1500);
				break;
			
			case "ginsengTea": 
				setPrice(2000);
				break;
				
			case "redginsengTea": 
				setPrice(2500);
				break;
		}
	}
}
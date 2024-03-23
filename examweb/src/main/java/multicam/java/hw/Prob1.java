package multicam.java.hw;

public class Prob1 {
	public static void main(String[] args){
		Drink coffee = new Drink("커피",1500,4);
		Drink tea = new Drink("녹차",1100,7);
		Alcohol wine = new Alcohol("와인", 5000, 3, 15.1);
		
		System.out.println("***** 매 출 전 표 ***** ");
		Drink.printTitle();
		coffee.printData();
		tea.printData();
		System.out.println();
		
		Alcohol.printTitle();
		wine.printData();
		
		int sum = coffee.getTotalPrice()
				  + tea.getTotalPrice()
				  + wine.getTotalPrice();
		
		System.out.println();
		System.out.println("*** 총금액 " + sum + "원 ***");
	}
}

class Drink {
	protected String name;
	protected int price;
	protected int count;
	
	public Drink() {
		
	}
	
	public Drink(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}

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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotalPrice() {
		return price * count;
	}
	
	public static void printTitle() {
		System.out.println("상품명 \t 단가 \t 수량 \t 금액");
	}

	public void printData() {
		System.out.println(name + "\t" + price + "\t" + count + "\t" + getTotalPrice());
	}
}

class Alcohol extends Drink{
	private double alcper;
	
	public Alcohol() {
		
	}
	
	public double getAlcper() {
		return alcper;
	}

	public void setAlcper(double alcper) {
		this.alcper = alcper;
	}

	public Alcohol(String name, int price, int count, double alcper) {
		super(name, price, count);
		this.alcper = alcper;
	}

	public static void printTitle() {
		System.out.println("상품명(도수[%]) \t 단가 \t 수량 \t 금액");
	}

	public void printData() {
		System.out.println(name + "(" + alcper + ")" + "\t" + price + "\t" + count + "\t" + getTotalPrice());
	}
}
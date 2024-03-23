package multicam.java.hw;

public class Prob {
	public static void main(String[] args){
		Rectangle rectangle01 = new Rectangle(10, 20, "청색");
		rectangle01.calculateArea();
		System.out.println("1 : "+rectangle01.getColor()+" 직사각형 면적 : "+rectangle01.getArea());
		 
		Rectangle rectangle02 = new Rectangle(20, 20);
		rectangle02.calculateArea();
		System.out.println("2 : "+rectangle02.getColor()+" 직사각형 면적 : "+rectangle02.getArea());
		 
		Rectangle rectangle03 = new Rectangle();
		rectangle03.setHeight(10);
		rectangle03.setWidth(10);
		rectangle03.setColor("녹색");
		rectangle03.calculateArea();
		System.out.println("3 : "+rectangle03.getColor()+" 직사각형 면적 : "+rectangle03.getArea());
	
	}
}

class Rectangle {
	private int width;
	private int height;
	private String color;
	private int area;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		// this.color = "흰색";
	}
	
	public Rectangle(int width, int height, String color) {
		this(width, height);
		this.color = color;
	}
	
	public void calculateArea() {
		area = width * height;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColor() {
		if(color == null) {
			color = "흰색";
		}
		
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
}
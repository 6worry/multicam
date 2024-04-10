package multicam.java.hw;

public class TestShape {
	public static void main(String[] args) {
		Shape [] shape = new Shape[2];
		shape[ 0 ]  = new Circle("원",10);
		shape[ 1 ] = new Rectangular("직사각형",10,20);
		
		for (int i = 0; i < shape.length; i++) {
			shape[ i ].calculationArea();
			shape[ i ].print();
		}
	}
}

abstract class Shape {
	protected double area;
	private String name;
	
	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Shape() {
		super();
	}
	
	public Shape(String name) {
		this.name = name;
	}
	
	public abstract void calculationArea();
	
	public void print() {
		System.out.println(name + "의 면적은 " + area);
	}
}

class Circle extends Shape {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public Circle () {
		super();
	}
	
	public Circle (String name, double radius) {
		super(name);
		this.radius = radius;
	}
	
	public void calculationArea() {
	    area = Math.PI * Math.pow(radius, 2);
	}
}

class Rectangular extends Shape {
	private double width;
	private double height;
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHight() {
		return height;
	}
	
	public void setHight(double height) {
		this.height = height;
	}
	
	public Rectangular() {
		super();
	}
	
	public Rectangular (String name, double width, double height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	
	public void calculationArea() {
		area = width * height;
	}
}
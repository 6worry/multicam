package multicam.java.hw;

import java.util.Scanner;

public class TestRectangle {
	public static void main(String s[]){
		Scanner keyboard = new Scanner(System.in);
		Rectangle2 rec1 = new Rectangle2();
		System.out.println("첫번째 직사각형의 색깔: ");
		rec1.setColor(keyboard.next());
		System.out.println("첫번째 직사각형의 가로: ");
		rec1.setWidth(keyboard.nextInt());
		System.out.println("첫번째 직사각형의 세로: ");
		rec1.setLength(keyboard.nextInt());
		
		Rectangle2 rec2 = new Rectangle2();
		System.out.println("두번째 직사각형의 색깔: ");
		rec2.setColor(keyboard.next());
		System.out.println("두번째 직사각형의 가로: ");
		rec2.setWidth(keyboard.nextInt());
		System.out.println("두번째 직사각형의 세로: ");
		rec2.setLength(keyboard.nextInt());
		
		System.out.println(rec1.getColor() + " 직사각형의 넓이는 " + rec1.area() + "이고 둘레는 " + rec1.perimeter() + "입니다.");
		System.out.println(rec2.getColor() + " 직사각형의 넓이는 " + rec2.area() + "이고 둘레는 " + rec2.perimeter() + "입니다.");
		
		// TODO 1) 두 직사각형의 넓이를 비교하십시오.
			if(rec1.area() > rec2.area()) {
				System.out.println("넓이는 " + rec1.getColor() + " 직사각형이 더 큽니다.");
			} else if(rec1.area() < rec2.area()) {
				System.out.println("넓이는 " + rec2.getColor() + " 직사각형이 더 큽니다.");
			} else if(rec1.area() == rec2.area()) {
				System.out.println("넓이는 같습니다.");
			} else {
				System.out.println("오류입니다.");
			}
			
		// TODO 2) 두 직사각형의 둘레를 비교하십시오.
			if(rec1.perimeter() > rec2.perimeter()) {
				System.out.println("둘레는 " + rec1.getColor() + " 직사각형이 더 큽니다.");
			} else if(rec1.perimeter() < rec2.perimeter()) {
				System.out.println("둘레는 " + rec2.getColor() + " 직사각형이 더 큽니다.");
			} else if(rec1.perimeter() == rec2.perimeter()) {
				System.out.println("둘레는 같습니다.");
			} else {
				System.out.println("오류입니다.");
			}
	}
}

class Rectangle2 {
	private int width;
	private int length;
	private String color;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int area() {
		int result = width * length;
		return result;
	}
	
	public int perimeter() {
		return 2* (width + length);
	}
}


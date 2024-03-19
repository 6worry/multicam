package multicam.java.hw;

import java.util.Random;

public class APITest2 {
	public static void main(String[] args) {
		Random rand = new Random();
		int count = rand.nextInt(2) + 1;
		
		System.out.println("[출력형태]");
		System.out.println("랜덤수: " + count);
	}
}

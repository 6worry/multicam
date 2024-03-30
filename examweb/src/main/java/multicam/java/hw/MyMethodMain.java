package multicam.java.hw;

import java.util.Scanner;

public class MyMethodMain {
	public static void main(String[] args) {
		MyMethodDemo obj = new MyMethodDemo();
		
		Scanner key = new Scanner(System.in);
		System.out.print("단:");
		int dan = key.nextInt();
		obj.printGuGu(dan);
		key.close();
		
		obj.printGuGu();
		
		int result = obj.calc(1, 5, 7);
		System.out.println(result);
	}
}
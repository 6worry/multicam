package multicam.java.hw;

import java.util.Random;

public class ArrayExam3 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100) + 1;
		
			System.out.println("[출력형식]");
			
			if(arr[i] % 2 == 0) { 
				System.out.println(i + "번요소: " + arr[i] + " = 짝수"); 
			} else {
				System.out.println(i + "번요소: " + arr[i] + " = 홀수");
			}
		}
		
		/*
		 * for(int val: arr) { if(val % 2 == 0) { System.out.println("번요소: " + val +
		 * " = 짝수"); } else { System.out.println("번요소: " + val + " = 홀수"); } }
		 */
	}
}

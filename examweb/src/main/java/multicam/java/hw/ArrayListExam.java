package multicam.java.hw;

import java.util.ArrayList;
//import java.util.Random;

public class ArrayListExam {
	public static void main(String[] args) {
		ArrayList<Integer> v = new ArrayList<>();
//		Random rand = new Random();
//		for(int i = 0; i < 6; i++) {
//        	v.add(rand.nextInt(50) + 1);
//        }
		
        for(int i = 0; i < 6; i++) {
        	v.add((int)(Math.random()* 50) + 1);
        }
        
        print(v);
	}
	
	public static void print(ArrayList<Integer> v) {
		int lastIndex = v.size() -1;
		int val = 0;
		for(int s: v) {
			if(s % 2 != 0) {
				System.out.print(s + "(홀수)");
			} else {
				System.out.print(s + "(짝수)");
			}
			
			if(val != lastIndex) {
				System.out.print(", ");
			}
			
			val++;
		}
	}
}
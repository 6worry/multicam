package multicam.java.hw;

import java.util.Vector;

public class VectorExam {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
        v.add(78);
        v.add(99);
        v.add(100);
        v.add(95);
        v.add(100);
		
        int sum = 0;
        
        for(int i: v) {
        	sum += i;
        }
        
        double avg = (double) sum / v.size();
		System.out.println("총점: " + sum + ", 평균: " + avg);
	}
}
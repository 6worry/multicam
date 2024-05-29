package multicam.java.hw;

import java.util.Scanner;

public class PersonTest {
	private String name;
	private int age;
	private boolean state;
	private double data;
	private Calc_While_Exam calc; // 사용자 정의 클래스
	private Scanner key; // API 클래스
	private int[] scores;

	public double getData() {
		return data;
	}

	public void setData(double data) {
		this.data = data;
	}
	
	public Calc_While_Exam getCalc() {
		return calc;
	}
	 
	public void setCalc(Calc_While_Exam calc) {
		this.calc = calc; 
	}
	
	public Scanner getKey() {
		return key;
	}

	public void setKey(Scanner key) {
		this.key = key;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	public boolean getState() {
		return state;
	}
	
	private void setState(boolean state) {
		this.state = state;
	}
}
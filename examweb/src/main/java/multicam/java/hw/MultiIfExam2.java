package multicam.java.hw;

import java.util.Scanner;

public class MultiIfExam2 {
    public static void main(String[] args) {
    	Scanner key = new Scanner(System.in);
    	
		System.out.println("*******미니계산기*******");
		System.out.println("1.더하기");
		System.out.println("2.빼기");
		System.out.println("3.곱하기");
		System.out.println("4.나누기");
		System.out.println("연산자를 선택하세요.");
		System.out.println("\n"+ "--------------" + "\n");
		
		System.out.println("*******미니계산기*******");
		System.out.println("1.더하기");
		System.out.println("2.빼기");
		System.out.println("3.곱하기");
		System.out.println("4.나누기");
		System.out.print("연산자를 선택하세요. ");
		int num = key.nextInt();
		
		System.out.print("숫자를 입력하세요. ");
		double num2 = key.nextDouble();
		double num3 = key.nextDouble();
		
		switch (num) {
			case 1 :
				System.out.println("계산결과: " + (num2 + num3));
				break;
			case 2 :
				System.out.println("계산결과: " + (num2 - num3));
				break;
			case 3 :
				System.out.println("계산결과: " + (num2 * num3));
				break;
			case 4 :
				if(num2 == 0) {
					System.out.println("0은 나눌 수 없어");
					break;
				} else {
					System.out.println("계산결과: " + (num2 / num3));
					break;
				}
			default:
			
		}
		
		key.close();
	}
}
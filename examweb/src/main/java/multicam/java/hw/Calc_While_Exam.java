package multicam.java.hw;

import java.util.Scanner;

public class Calc_While_Exam {
    public static void main(String[] args) {
    	Scanner key = new Scanner(System.in);
    	
    	while (true) {
			System.out.println("*******미니계산기*******");
			System.out.println("1.더하기");
			System.out.println("2.빼기");
			System.out.println("3.곱하기");
			System.out.println("4.나누기");
			System.out.println("5.종료");
			System.out.print("연산자를 선택하세요. ");
			int num = key.nextInt();
			
			if(num == 5) {
				System.out.println("계산기 종료");
				break;
			}
			
			while(num < 1 || num > 5) {
				System.out.println("연산자 잘못 기입");
				System.out.print("연산자를 선택하세요. ");
				num = key.nextInt();
			}
			
			System.out.print("숫자를 입력하세요. ");
			double num2 = key.nextDouble();
			double num3 = key.nextDouble();
			
			if(num == 1) {
				System.out.println("계산결과: " + (num2 + num3));
			} else if (num == 2) {
				System.out.println("계산결과: " + (num2 - num3));
			} else if (num == 3) {
				System.out.println("계산결과: " + (num2 * num3));
			} else if (num == 4) {
				while(num3 == 0) {
					System.out.println("0은 나눌 수 없어");
					System.out.print("숫자를 입력하세요. ");
					num2 = key.nextDouble();
					num3 = key.nextDouble();
				}
				
				System.out.println("계산결과: " + (num2 / num3));
			} else {
				System.out.println("※ 잘못 입력!");
			}
		}
    	
		key.close();
	}
}
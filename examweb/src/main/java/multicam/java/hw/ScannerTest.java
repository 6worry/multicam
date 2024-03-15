package multicam.java.hw;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("숫자입력: ");
		int num = key.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("입력한 숫자" + num + "은 짝수입니다.");
		} else {
			System.out.println("입력한 숫자" + num + "은 홀수입니다.");
		}
	}
}
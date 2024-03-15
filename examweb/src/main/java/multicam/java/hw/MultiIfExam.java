package multicam.java.hw;

import java.util.Scanner;

public class MultiIfExam {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("점수: ");

        if (key.hasNextDouble()) {
            double score = key.nextDouble();

            if (score >= 0 && score <= 100) {
                if (score >= 0 && score < 60) {
                    System.out.print("F학점");
                } else if (score >= 60 && score < 70) {
                    System.out.print("D학점");
                } else if (score >= 70 && score < 80) {
                    System.out.print("C학점");
                } else if (score >= 80 && score < 90) {
                    System.out.print("B학점");
                } else if (score >= 90 && score <= 100) {
                    System.out.print("A학점");
                }
            } else {
                System.out.print("※ 잘못입력!");
            }
        } else {
            System.out.print("※ 잘못입력!");
        }
        
        key.close();
    }
}

//public class MultiIfExam {
//	public static void main(String[] args) {
//		Scanner key = new Scanner(System.in);
//		System.out.print("점수: ");
//		double score = key.nextDouble();
//		
//		if(score >= 0 && score < 60) {
//			System.out.print("F학점");
//		} else if(score >= 60 && score < 70) {
//			System.out.print("D학점");
//		} else if(score >= 70 && score < 80) {
//			System.out.print("C학점");
//		} else if(score >= 80 && score < 90) {
//			System.out.print("B학점");
//		} else if(score >= 90 && score <= 100) {
//			System.out.print("A학점");
//		} else {
//			System.out.print("※ 잘못입력!");
//		}
//	}
//}

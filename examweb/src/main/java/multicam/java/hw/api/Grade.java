package multicam.java.hw.api;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Grade {
	public static void main(String args[]) { 
		Grade grade = new Grade();
		
		String fileName = "score.txt";
		grade.printGrade(fileName);
	}
		
	public void printGrade(String fileName) {	
		/* 이곳에 프로그램을 완성하십시오. */
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("src\\main\\java\\multicam\\java\\hw\\api\\" + fileName));
			String line = "";
			int count = 0;
			int sum = 0;
			while((line = br.readLine()) != null) {
				String[] s = line.split(",");
				System.out.println(s[0] + "의 점수는 " + s[1] + "점 입니다.");
				sum += Integer.parseInt(s[1]);
				count++;
			}
			
			System.out.println("모두의 총점은 " + sum + "점 입니다.");
			System.out.println("모두의 평균은 " + sum / count + "점 입니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {					
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
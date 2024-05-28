package multicam.java.hw.api;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy2 {
	public static void main(String[] args) {
		BufferedReader br = null;
		FileWriter fw = null;
		
		try {
			br = new BufferedReader(new FileReader("src\\main\\java\\multicam\\java\\hw\\api\\MathTest.java"));
			fw = new FileWriter("src\\main\\java\\multicam\\java\\hw\\api\\output.txt");
			int count = 0;
			long start = System.nanoTime();
			String line = "";
			while((line = br.readLine()) != null) {
					fw.write(line);
					System.out.println(line);
					count++;
			}
			long stop = System.nanoTime();
			System.out.println();
			System.out.print("실행횟수: " + count);
			System.out.print("실행시간: " + (stop - start));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
				
				if(fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
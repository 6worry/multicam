package multicam.java.hw.api;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("src\\main\\java\\multicam\\java\\hw\\api\\MathTest.java");
			fw = new FileWriter("src\\main\\java\\multicam\\java\\hw\\api\\output.txt");
			int data = 0;
			while((data = fr.read()) != -1) {
					fw.write(data);
					System.out.print((char) data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) {
					fr.close();
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
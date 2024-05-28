package multicam.java.hw.api;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {
	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader br = null;
		PrintWriter pw = null;
		String line = "";
		
		try {
			br = new BufferedReader(new FileReader("src\\main\\java\\multicam\\java\\hw\\api\\fstFile1.txt"));
			pw = new PrintWriter("src\\main\\java\\multicam\\java\\hw\\api\\out.txt");
			
			while((line = br.readLine()) != null) {
				pw.println(line);
				System.out.println(line);
			}
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
			
			if(pw != null) {
				pw.close();			
			}
		}
	}
}
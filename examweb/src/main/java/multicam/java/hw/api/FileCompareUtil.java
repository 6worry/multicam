package multicam.java.hw.api;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileCompareUtil {
	public static void main(String[] args) throws Exception {
		compareFile("fstFile1.txt", "scdFile1.txt");
	}
	
	public static void compareFile(String fstFileName, String scdFileName) throws Exception {
		// implements compareFile method.
		
		BufferedReader fstbr = new BufferedReader(new FileReader("src\\main\\java\\multicam\\java\\hw\\api\\" + fstFileName));
		BufferedReader scdbr = new BufferedReader(new FileReader("src\\main\\java\\multicam\\java\\hw\\api\\" + scdFileName));
		String fstline = "";
		String scdline = "";
		String fstline2 = fstbr.readLine();
		String scdline2 = scdbr.readLine();
		int count = 0;
		while((fstline = fstline2) != null) {
			if(fstline2 == null) {
				break;
			}
			
			count++;
			if (!fstline2.equals(scdline2)) {
                System.out.println(scdline2);
            }
			
		}
		
		if(fstbr != null) {
			fstbr.close();
		}
		
		if(scdbr != null) {
			scdbr.close();
		}
	}
}

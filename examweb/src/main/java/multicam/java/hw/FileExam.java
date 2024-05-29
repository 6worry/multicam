package multicam.java.hw;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExam {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\user2310\\git\\multicam\\examweb\\src\\main\\java\\multicam\\java\\hw");
		File[] files = file.listFiles();
		
		for(File f: files) {
			find(f);
		}
	}
	
	public static void find(File file) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		if(file.isDirectory()) {
			System.out.println(file.getName() + " --- [폴더]");
		} else {
//			System.out.println(file.getName() + " --- [파일(" + file.length() + ": " + sdf.format(file.lastModified()) + ")]");
			System.out.println(file.getName() + " --- [파일(" + file.length() + ": " + sdf.format(new Date (file.lastModified())) + ")]");
		}
	}
}
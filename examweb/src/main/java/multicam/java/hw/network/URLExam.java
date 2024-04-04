package multicam.java.hw.network;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class URLExam {
	public static void main(String[] args) {
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		
		try {
			URL url = new URL("https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMzExMjlfMTI1%2FMDAxNzAxMjU1Njc0NTY5.WpSfeXbN3jP2NrTHnsHe0qTkokSKAh_mOQrwzw0lxo0g.RfoRPTjEiybNNvVFkCQe0FBjAVOOH0CjlqxK9LlTJZUg.PNG.zpfhfhqn%2F%25C8%25AD%25B8%25E9_%25C4%25B8%25C3%25B3_2023-11-29_200101.png&type=sc960_832");
			
			bis = new BufferedInputStream(url.openStream());
			fos = new FileOutputStream("src\\main\\java\\multicam\\java\\hw\\network\\mylmg.jpg");
			
            int fileSpace;
            while ((fileSpace = bis.read()) != -1) {
                fos.write(fileSpace);
            }
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) {					
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(bis != null) {					
					bis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
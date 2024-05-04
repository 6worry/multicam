package exam.di.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("outputter")
public class FileOutputter implements Outputter {
	@Value("filepath")
	private String filePath;
	
	public void output(String message) {
		System.out.println(message);
	}
	
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
}
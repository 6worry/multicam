package exam.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/exam.xml");
		
		MyService service = (MyService) factory.getBean("service");
		service.testService();
	}
}
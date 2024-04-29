package exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/exam.xml");
		
		TV tv = (TV) factory.getBean("exam_TV");
		tv.turnOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.turnOff();
		
		TV tv2 = (TV) factory.getBean("exam_TV2");
		tv2.turnOn();
		tv2.volumeUp();
		tv2.volumeDown();
		tv2.turnOff();
	}
}
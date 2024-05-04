package exam.di.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testapp {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/exam.xml");
		MessageBean message =  (MessageBean) factory.getBean("message");
		
		message.sayHello();
	}
}
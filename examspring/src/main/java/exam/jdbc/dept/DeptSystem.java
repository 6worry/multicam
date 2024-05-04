package exam.jdbc.dept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeptSystem {
	public static void main(String[] args) {
		ApplicationContext factory = 
			 new ClassPathXmlApplicationContext("/config/exam.xml");
		AbstractUI ui = (AbstractUI)factory.getBean("ui");
		
		while(true){
			ui.show();
		}
	}	
}
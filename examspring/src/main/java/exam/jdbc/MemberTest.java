package exam.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/exam.xml");
		
		MemberDAOImpl dao = (MemberDAOImpl) factory.getBean("memberDAO");
		
		System.out.println("조회된 레코드 수: " + dao.count() + "개");
	}
}
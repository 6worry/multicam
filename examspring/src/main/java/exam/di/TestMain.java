package exam.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/exam.xml");
		ArticleDTO article = new ArticleDTO();
		
		IWriteArticleMgr mgr = (IWriteArticleMgr) factory.getBean("exam_Mgr");
		IWriteArticleMgr mgr2 = (IWriteArticleMgr) factory.getBean("exam_Mgr2");
		
		article.setName("test1");
		article.setTitle("test2");
		article.setContent("test3");
		article.setDate("test4");
		
		mgr.write(article);
		mgr2.write(article);
	}
}
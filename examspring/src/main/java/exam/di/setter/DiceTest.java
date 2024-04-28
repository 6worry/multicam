package exam.di.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiceTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/exam.xml");
		
		Player p = (Player) factory.getBean("exam_Player2");
		Dice_Player p2 = factory.getBean("exam_Player2", Dice_Player.class);
		p.play();
		p2.play();
		System.out.println("세번 굴린 주사위의 합:"+p.getTotalValue());
		System.out.println("세번 굴린 주사위의 합:"+p2.getTotalValue());
	}
}
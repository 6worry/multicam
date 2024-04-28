package exam.anno;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dice")
public class Dice extends Random implements Dices {
	public int getDiceValue(){
		return nextInt(6)+1;
	}
}
package exam.di.setter;

import java.util.Random;

public class Dice extends Random implements Dices {
	public int getDiceValue(){
		return nextInt(6)+1;
	}
}
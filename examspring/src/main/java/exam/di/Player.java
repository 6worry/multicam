package exam.di;

public class Player implements Dice_Player {
	Dice d;
	int totalValue=0;
	
	public Player() {
		super();
	}

	public Player(Dice d) {
		super();
		this.d = d;
	}
	
	public void play(){
		totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}
	
	public int getTotalValue(){
		return totalValue;
	}
}
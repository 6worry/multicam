package exam.di.setter;

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

	public Dice getD() {
		return d;
	}

	public void setD(Dice d) {
		this.d = d;
	}

	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
	}
}
package multicam.java.hw;

public class TVFactory extends Factory implements IWorkingTogether {
	public TVFactory(String name, int openHour, int closeHour) {
		super(name, openHour, closeHour);
	}

	@Override
	public int workTogether(IWorkingTogether partner) {
		return ((TVFactory) partner).makeProducts('C');
	}

	@Override
	public int makeProducts(char skill) {
		if(skill == 'A') {
			skill = 8;
		} else if(skill == 'B') {
			skill = 5;
		} else if(skill == 'C') {
			skill = 3;
		} else {
			skill = 1;
		}
		
		return skill * getWorkingTime();
	}
}
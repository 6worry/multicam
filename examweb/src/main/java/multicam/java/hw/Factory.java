package multicam.java.hw;

public abstract class Factory {
	int openHour;
	int closeHour;
	String name;
	
	public Factory(String name, int openHour, int closeHour) {
		super();
		this.openHour = openHour;
		this.closeHour = closeHour;
		this.name = name;
	}
	
	public String getFactoryName() {
		return name;
	}
	
	public int getWorkingTime() {
		return closeHour - openHour;
	}
	
	public abstract int makeProducts(char skill);
}
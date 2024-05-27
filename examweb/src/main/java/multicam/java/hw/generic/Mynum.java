package multicam.java.hw.generic;

public class Mynum<T> {
	private T num1;
	private T num2;
	
	public Mynum(T num1, T num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public T getNum1() {
		return num1;
	}

	public void setNum1(T num1) {
		this.num1 = num1;
	}

	public T getNum2() {
		return num2;
	}

	public void setNum2(T num2) {
		this.num2 = num2;
	}
}
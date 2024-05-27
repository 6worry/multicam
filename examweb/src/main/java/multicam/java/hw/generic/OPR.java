package multicam.java.hw.generic;

public class OPR {
	public <T> double plus(Mynum<T> num) {
		double result= 0;
		
		result = ((Number) num.getNum1()).doubleValue() + ((Number) num.getNum2()).doubleValue();
		
		return result;
	}
	
	public <T> double minus(Mynum<T> num) {
		double result= 0;
		
		result = ((Number) num.getNum1()).doubleValue() - ((Number) num.getNum2()).doubleValue();
		
		return result;
	}
	
	public <T> double multi(Mynum<T> num) {
		double result= 0;
		
		result = ((Number) num.getNum1()).doubleValue() * ((Number) num.getNum2()).doubleValue();
		
		return result;
	}
	
	public <T> double devision(Mynum<T> num) {
		double result= 0;
		
		result = ((Number) num.getNum1()).doubleValue() / ((Number) num.getNum2()).doubleValue();
		
		return result;
	}
}
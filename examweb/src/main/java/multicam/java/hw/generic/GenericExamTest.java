package multicam.java.hw.generic;

public class GenericExamTest {
	public static void main(String[] args) {
		Mynum<Integer> num = new Mynum<Integer>(10, 20);
		OPR opr = new OPR();
		
		System.out.println(opr.plus(num));
		System.out.println(opr.minus(num));
		System.out.println(opr.multi(num));
		System.out.println(opr.devision(num));
		
		Mynum<Double> num2 = new Mynum<Double>(10.5, 20.2);
		
		System.out.println(opr.plus(num2));
		System.out.println(opr.minus(num2));
		System.out.println(opr.multi(num2));
		System.out.println(opr.devision(num2));
	}
}
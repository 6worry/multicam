package multicam.java.hw;

public class ArgsTest {

	public static void main(String[] args) {
		int sum = 0;
		int sum2 = 0;
		System.out.println("값의 개수: " + args.length);
		System.out.print("값: ");
		for(int i = 0; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
			System.out.print(args[i] + " ");
		}
		
		System.out.println();
		System.out.println("총점: " + sum);
		System.out.println("평균: " + sum / args.length);
		
		System.out.println();
		
		System.out.println("값의 개수: " + args.length);
		System.out.print("값: ");
		for(String val: args) {
			sum2 += Integer.parseInt(val);
			System.out.print(val + " ");
		}
		System.out.println();
		System.out.println("총점: " + sum2);
		System.out.println("평균: " + sum2 / args.length);
	}
}

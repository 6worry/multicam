package multicam.java.hw;

public class FindNumbers {
	public static void main(String[] args) {
		FindNumbers fn=new FindNumbers();
		
		long number = 228754462;
		System.out.println( "입력숫자 = " + number );		
		System.out.println("2 횟수 = " + fn.countNumber(number, 2));
		System.out.println("4 횟수 = " + fn.countNumber(number, 4));
	}
	
	public int countNumber(long number, int i) {
		int count = 0;
		String str = String.valueOf(number);
		String str2 = String.valueOf(i);
		
		char[] c = str.toCharArray();
		char d = str2.charAt(0);
		
		for(char val: c) {
			if(val == d) {
				count++;
			}
		}
		
		return count;
	}
}

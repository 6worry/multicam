package multicam.java.hw;

public class MyMethodDemo {
	public void printGuGu(int dan) {
		
		for(int i=1;i<=9;i++) {
			System.out.println(dan + "*"+i+"="+(dan*i));
		}
	}
	
	public void printGuGu() {
		for(int dan=2;dan<=9;dan++) {
			for(int i=1;i<=9;i++) {
				System.out.print(dan + "*"+i+"="+(dan*i)+"\t");
			}
			System.out.println();
		}
	}
	
	public int calc(int opr, int num1, int num2) {
		int result = 0;
		switch(opr) {
			case 1:
				result = num1 + num2;
				break;
			case 2:
				result = num1 - num2;
				break;
			case 3:
				result = num1 * num2;
				break;
			case 4:
				if(num2 ==0) {
					System.out.println("0은 못나눠");
				}
				
				result = num1 / num2;
				break;
		}
		
		return result;
	}
}
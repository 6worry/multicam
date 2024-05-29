package multicam.java.hw;

public class Array2DTest {
	public static void main(String[] args) {
		char[][] myarr = new char[5][];
		myarr[0] = new char[1];
		myarr[1] = new char[2];
		myarr[2] = new char[3];
		myarr[3] = new char[4];
		myarr[4] = new char[5];
		
		for (int row = 0; row < myarr.length; row++) {
			for(int i = 0; i < myarr[row].length; i++) {
				myarr[row][i] = '*';
			}
		}
		
		for (char[] data: myarr) { // 저장된 값 꺼내기
			for (char c: data) {
				System.out.print(c);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (char[] data: myarr) { // 2차원 배열에 저장한 배열 꺼내기
				System.out.println(data);
		}
	}
}

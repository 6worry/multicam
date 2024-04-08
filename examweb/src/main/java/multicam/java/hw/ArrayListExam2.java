package multicam.java.hw;

import java.util.ArrayList;

public class ArrayListExam2 {
	public static void main(String[] args) {
		String[] strArr = {"java","servlet","jsp","spring"};
		ArrayList<String> strList = changeArraylist(strArr);
		
		int lastIndex = strList.size() -1;
		int count = 0;
		
		for(String result: strList) {
			
			System.out.print(result);
			
			if(count < lastIndex) {
				System.out.print(", ");
			}
			
			count++;
		}
		
	}
	
	public static ArrayList<String> changeArraylist(String[] strArr) {
		ArrayList<String> strList = new ArrayList<>();
		
		for(String str: strArr) {
			strList.add(str);
		}
		return strList;
	}
}
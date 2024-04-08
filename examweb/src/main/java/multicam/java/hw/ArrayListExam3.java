package multicam.java.hw;

import java.util.ArrayList;

public class ArrayListExam3 {
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> strList = new ArrayList<>();
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		list.add("장동건");
		list.add("100");
		list.add("99");
		list.add("88");
		strList.add(list);
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("2");
		list2.add("이민호");
		list2.add("89");
		list2.add("100");
		list2.add("100");
		strList.add(list2);
		
		ArrayList<String> list3 = new ArrayList<>();
		list3.add("3");
		list3.add("김범룡");
		list3.add("95");
		list3.add("89");
		list3.add("100");
		strList.add(list3);
		
		System.out.println("번호\t성명\t국어\t수학\t영어\t총점\t평균");
		
		print(strList);
	}
	
	private static void print(ArrayList<ArrayList<String>> strList) {
		for(ArrayList<String> str: strList) {
			int sum = 0;
			
			for (int i = 2; i < str.size(); i++) {
                sum += Integer.parseInt(str.get(i));
            }
			
			double avg = (double) Math.round(10.0 * sum / (str.size() - 2)) / 10.0;
			
			for(String s: str) {
				System.out.print(s + "\t");
			}
			
			System.out.print(sum + "\t" + avg);
			System.out.println();
		}
	}
}
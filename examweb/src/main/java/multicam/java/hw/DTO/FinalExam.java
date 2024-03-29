package multicam.java.hw.DTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FinalExam {
	public static void main(String[] args) {
		ArrayList<StudentDTO> strList = new ArrayList<>();
		StudentDTO list = new StudentDTO(1, "장동건", 100, 99, 88);
		StudentDTO list2 = new StudentDTO(2, "이민호", 89, 100, 100);
		StudentDTO list3 = new StudentDTO(3, "김범룡", 95, 89, 100);
		
		strList.add(list);
		strList.add(list2);
		strList.add(list3);
		
		HashSet<StudentDTO> set = new HashSet<>();
		set.add(list);
		set.add(list2);
		set.add(list3);
		
		
		HashMap<StudentDTO, Integer> map = new HashMap<>();
		map.put(list, 1);
		map.put(list2, 2);
		map.put(list3, 3);
		
		
		System.out.println("번호\t성명\t국어\t수학\t영어\t총점\t평균");
		
		print(strList);
		print(set);
		print(map);
	}
	
	private static void print(HashSet<StudentDTO> set) {
		for(StudentDTO str: set) {
			System.out.print(str.getNum() + "\t" + str.getName() + "\t" + str.getKor() + "\t" 
								+ str.getMath() + "\t" + str.getEng() + "\t");
			int sum = str.getKor() + str.getMath() +str.getEng();
			double avg = (double) Math.round(10.0 * (sum / (double) set.size())) / 10.0;
			System.out.println(sum + "\t" + avg);
		}
	}

	private static void print(HashMap<StudentDTO, Integer> map) {
		Set<StudentDTO> keylist = map.keySet();
		
		for(StudentDTO str: keylist) {
			System.out.print(str.getNum() + "\t" + str.getName() + "\t" + str.getKor() + "\t" 
								+ str.getMath() + "\t" + str.getEng() + "\t");
			int sum = str.getKor() + str.getMath() +str.getEng();
			double avg = (double) Math.round(10.0 * (sum / (double) map.size())) / 10.0;
			System.out.println(sum + "\t" + avg);
		}
	}

	private static void print(ArrayList<StudentDTO> strList) {
		for(StudentDTO str: strList) {
			System.out.print(str.getNum() + "\t" + str.getName() + "\t" + str.getKor() + "\t" 
								+ str.getMath() + "\t" + str.getEng() + "\t");
			int sum = str.getKor() + str.getMath() +str.getEng();
			double avg = (double) Math.round(10.0 * (sum / (double) strList.size())) / 10.0;
			System.out.println(sum + "\t" + avg);
		}
	}
}
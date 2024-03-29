package multicam.java.hw.DTO;

import java.util.ArrayList;

public class ArrayListExam3_DTO {
	public static void main(String[] args) {
		ArrayList<StudentDTO> strList = new ArrayList<>();
		StudentDTO list = new StudentDTO(1, "장동건", 100, 99, 88);
		StudentDTO list2 = new StudentDTO(2, "이민호", 89, 100, 100);
		StudentDTO list3 = new StudentDTO(3, "김범룡", 95, 89, 100);
		
		strList.add(list);
		strList.add(list2);
		strList.add(list3);
		
		System.out.println("번호\t성명\t국어\t수학\t영어\t총점\t평균");
		
		print(strList);
	}
	
	private static void print(ArrayList<StudentDTO> strList) {
		for(StudentDTO str: strList) {
			System.out.print(str.getNum() + "\t" + str.getName() + "\t" + str.getKor() + "\t" 
								+ str.getMath() + "\t" + str.getRegdate() + "\t");
			int sum = str.getKor() + str.getMath() +str.getEng();
			double avg = (double) Math.round(10.0 * (sum / (double) strList.size())) / 10.0;
			System.out.println(sum + "\t" + avg);
		}
	}
}
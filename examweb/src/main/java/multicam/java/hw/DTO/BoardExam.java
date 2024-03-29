package multicam.java.hw.DTO;

import java.time.LocalDate;
import java.util.ArrayList;

public class BoardExam {
	public static void main(String[] args) {
		ArrayList<BoardDTO> strList = new ArrayList<>();
		BoardDTO list = new BoardDTO(1, "제목1", "내용1", "진영록1", LocalDate.now());
		BoardDTO list2 = new BoardDTO(2, "제목2", "내용2", "진영록2", LocalDate.of(2023, 02, 17));
		BoardDTO list3 = new BoardDTO(3, "제목3", "내용3", "진영록3", LocalDate.of(2011, 12, 9));
		
		strList.add(list);
		strList.add(list2);
		strList.add(list3);
		
		System.out.println("번호\t제목\t내용\t작성자\t날짜");
		
		print(strList);
	}
	
	private static void print(ArrayList<BoardDTO> strList) {
		for(BoardDTO str: strList) {
			System.out.println(str.getNum() + "\t" + str.getTitle() + "\t" + str.getContent() + "\t" 
								+ str.getName() + "\t" + str.getRegLocalDate() + "\t");
		}
	}
}
package multicam.java.hw.DAO;

import java.util.Scanner;

public class DAOTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("******인사관리시스템********");
		System.out.println("1. 사원등록");
		System.out.println("2. 전체사원조회");
		System.out.println("3. job별로 사원조회하기");
		System.out.println("4. SMITH부서의 전 사원의 급여를 500올려주기");
		System.out.println("5. comm이 0인 직원 삭제하기");
		System.out.println("6. 각 매니저의 정보 조회하기(매니저 아이디로 조회하기)");
		System.out.print("원하는 작업을 선택하세요:");
		int choice  = key.nextInt();
		show(choice);
	}
	
	public static void show(int choice){
		MenuUI ui = new MenuUI();
		switch(choice){
			case 1:
				ui.insertMenu();
				break;
			case 2:
				ui.selectMenu();
				break;
			case 3:
				ui.searchMenu();
				break;
			case 4:
				ui.updateMenu();
				break;
			case 5:
				ui.deleteMenu();
				break;
			case 6:
				ui.getInfoMenu();
				break;
		}
	}
}
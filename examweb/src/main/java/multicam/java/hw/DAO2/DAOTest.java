package multicam.java.hw.DAO2;

import java.util.Scanner;

public class DAOTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		while(true) {
			System.out.println("******인사관리시스템********");
			System.out.println("0: 종료");
			System.out.println("1. 사원등록");
			System.out.println("2. 모든사원조회");
			System.out.println("3. 사원수정");
			System.out.println("4. 사원퇴사");
			System.out.println("5. 주소로 사원 검색");
			System.out.println("6. 로그인");
			System.out.println("7. 마이페이지");
			System.out.print("원하는 작업을 선택하세요:");
			int choice  = key.nextInt();
			
			if (choice == 0) {
	            System.out.println("종료");
	            break;
	        } else {
	            show(choice);
	        }
		}
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
				ui.updateMenu();
				break;
			case 4:
				ui.deleteMenu();
				break;
			case 5:
				ui.findByAddrMenu();
				break;
			case 6:
				ui.loginMenu();
				break;
			case 7:
				ui.myPageMenu();
				break;
		}
	}
}
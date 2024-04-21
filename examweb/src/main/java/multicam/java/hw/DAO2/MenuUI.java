package multicam.java.hw.DAO2;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	MemberDAO dao = new MemberDAOImpl();
	public void insertMenu(){
		System.out.println("*******사원등록********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("패스워드:");
		String pass = key.next();
		System.out.print("성명:");
		String name = key.next();
		System.out.print("주소:");
		String addr = key.next();
		System.out.print("기타:");
		String info = key.next();
		
		MemberDTO user = new MemberDTO(id ,pass, name, addr, info);
		int result = dao.insert(user);
		
		if(result >= 1) {
			System.out.println("로그인 성공! 메인페이지 이동");
		} else {
			System.out.println("로그인 실패");
		}
	}
	
	public void updateMenu(){
		System.out.println("*******사원수정********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("주소:");
		String addr = key.next();
		System.out.print("정보:");
		String info = key.next();

		MemberDTO user2 = new MemberDTO(id, addr, info);
		dao.update(user2);
	}
	
	public void deleteMenu(){
		System.out.println("*******사원삭제********");
		System.out.print("삭제할id:");
		String id = key.next();

		dao.delete(id);
	}
	
	public void findByAddrMenu(){
		System.out.println("*******사원검색********");
		System.out.print("주소:");
		String addr = key.next();

		ArrayList<MemberDTO> list = dao.search(addr);
		
		for(MemberDTO user: list) {
			print(user);
		}
	}
	
	public void loginMenu() {
		System.out.println("*******로그인********");
		System.out.println("아이디: ");
		String id = key.next();
		System.out.println("패스워드: ");
		String pw = key.next();
		
		MemberDTO user = dao.login(id, pw);
		
		if(user != null) {
			System.out.println("로그인 성공");
			print(user);
		} else {
			System.out.println("로그인 실패");
		}
	}
	
	public void selectMenu(){
		System.out.println("*******모든사원조회********");

		ArrayList<MemberDTO> userlist = dao.select();
		System.out.println(userlist);
		
		for(MemberDTO user: userlist) {
			print(user);
		}
	}
	
	public void myPageMenu() {
		System.out.println("*******마이페이지********");
		System.out.println("아이디: ");
		String id = key.next();
		
		MemberDTO user = dao.mypage(id);
		
		if(user == null) {
			System.out.println("로그인이 필요합니다.");
		} else {
			print(user);
		}
	}
	
	private void print(MemberDTO user) {
		System.out.println(user.getId() + "\t");
		System.out.println(user.getPass() + "\t");
		System.out.println(user.getName() + "\t");
		System.out.println(user.getRegdate() + "\t");
		System.out.println(user.getPoint() + "\t");
		System.out.println(user.getInfo() + "\t");
	}
}
package exam.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("menu")
public class MenuUI implements AbstractMenu {
	Scanner key = new Scanner(System.in);
	MemberDAO dao;
	
	@Autowired
	public MenuUI(MemberDAO dao) {
		super();
		this.dao = dao;
	}
	
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
		//여기에서 MemberDAO의 메소드를 호출하세요
		MemberDTO user = new MemberDTO(id, pass, name, addr, info);
		int result = dao.insert(user);
		if(result>=1) {
			System.out.println("=========================");
			System.out.println("로그인해서 메인페이지 이동");
			System.out.println("=========================");
		}else {
			System.out.println("--------------------------");
			System.out.println("실패를 알려 줄 수 있는 alert실행");
			System.out.println("다시 회원가입할 수 있는 페이지로 이동");
			System.out.println("--------------------------");
		}
		//dao.insert(id, pass, name, addr, info);
	}
	public void updateMenu(){
		System.out.println("*******사원수정********");
		System.out.print("정보:");
		String info = key.next();
		System.out.print("주소:");
		String addr = key.next();
		System.out.print("아이디:");
		String id = key.next();
		//여기에서 MemberDAO의 메소드를 호출하세요
		//dao.update(info, addr, id);
		MemberDTO updateUser = new MemberDTO(id, addr, info);
		dao.update(updateUser);
		System.out.println("정보수정완료");
	}
	public void deleteMenu(){
		System.out.println("*******사원삭제********");
		System.out.print("삭제할id:");
		String id = key.next();
		//여기에서 MemberDAO의 메소드를 호출하세요
		dao.delete(id);
		System.out.println("사원 삭제 완료");
	}
	public void findByAddrMenu(){
		System.out.println("*******사원검색********");
		System.out.print("주소:");
		String addr = key.next();
		//여기에서 MemberDAO의 메소드를 호출하세요
		List<MemberDTO> searchlist =  dao.findByAddr(addr);
		
		if (searchlist.isEmpty()) {
	        System.out.println("일치하는 데이터 없음");
	    } else {
	        for(MemberDTO user : searchlist) {
	            print(user);
	        }
	    }
	}
	public void loginMenu() {
		System.out.println("*******로그인********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("패스워드:");
		String pass = key.next();
		MemberDTO loginUser =  dao.login(id, pass);
		//로그인 성공하면 로그인성공!!메시지와 로그인한 사용자의 모든 정보를 출력(print호출)
		if(loginUser!=null) {
			System.out.println("로그인성공");
			print(loginUser);
		}else {
			System.out.println("로그인실패");
		}
		//로그인 실패하면 로그인실패!!메시지를 출력
	}
	public void selectMenu(){
		System.out.println("*******사원조회********");
		//여기에서MemberDAO의 메소드를 호출하세요 - 전체사원조회
		List<MemberDTO> userlist =  dao.select();
		System.out.println("조회된 레코드 갯수:"+userlist.size());
		//ArrayList에 저장된 DTO를 다양하게 출력할 수 있도록 코드를 작성
		for(MemberDTO user:userlist) {
			print(user);
		}
	}
	public void myPageMenu() {
		System.out.println("*******마이페이지********");
		System.out.print("아이디:");
		String id = key.next();
		//myPageMenu메소드에서 입력 받은 아이디로 아이디에 따른 정보를 조회할 수 있도록 코드를 완성하세요
		//   - MemberDAO, MemberDAOImpl에 메소드를 정의하고 작업하세요(리턴타입, 메소드명, 매개변수는 각자 알아서 작업하기)
		MemberDTO user=  dao.findById(id);
		if(user==null) {
			System.out.println("일치하는 사용자가 없습니다.");
		}else {
			print(user);
		}
	}
	public void print(MemberDTO user) {
		System.out.print(user.getId()+"\t");
		System.out.print(user.getPass()+"\t");
		System.out.print(user.getName()+"\t");
		System.out.print(user.getAddr()+"\t");
		System.out.print(user.getRegDate()+"\t");
		System.out.print(user.getPoint()+"\t");
		System.out.println(user.getInfo()+"\t");
	}

	@Override
	public void countMenu() {
		System.out.println("*******사원수 조회하기********");
		System.out.println("조회된 레코드 수: " + dao.count() + "개");
	}
}
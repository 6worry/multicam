package exam.jdbc.dept;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exam.jdbc.MemberDTO;

@Service("ui")
public class MenuUI implements AbstractUI {
	Scanner key = new Scanner(System.in);
	DeptDAO dao;
	//시작을 알리는 메소드
	public void show(){
		System.out.println("**********부서관리 시스템************");
		System.out.println("0. 부서개수 조회");
		System.out.println("1. 부서등록");
		System.out.println("2. 부서상세보기");
		System.out.println("3. 부서정보수정(부서번호)");
		System.out.println("4. 부서삭제");
		System.out.println("5. 전체 부서 목록보기");
		System.out.println("6. 부서검색(부서명)");
		System.out.println("7. 부서조회");
		System.out.println("8. 각 부서별 근무직원 조회하기(부서명)");
		System.out.println("9. 종료");
		System.out.print("원하는 작업을 선택하세요:");
		int menu=key.nextInt();
		menuSelect(menu);
	}
	
	@Autowired
	public MenuUI(DeptDAO dao) {
		super();
		this.dao = dao;
	}

	private void menuSelect(int menu) {
		switch(menu){
			case 0:
				countMenu();
				break;
			case 1:
				insertMenu();
				break;
			case 2:
				selectMenu();
				break;
			case 3:
				updateMenu();
				break;
			case 4:
				deleteMenu();
				break;
			case 5:
				showAllMenu();
				break;
			case 6:
				showDeptInfo();
				break;
			case 7:
				findByDept();
				break;
			case 8:
				getMemberList();
				break;
			case 9:
				System.exit(0);//프로그램 정상종료
				break;
		}	
	}
	
	@Override
	public void countMenu() {
		System.out.println("*******부서갯수조회********");
		System.out.println("조회된 부서 개수: " + dao.count() + "개");
	}
	
	@Override
	public void insertMenu() {
		System.out.println("*******부서등록********");
		System.out.print("부서코드:");
		String deptcode = key.next();
		System.out.print("부서명:");
		String dname = key.next();
		System.out.print("부서번호:");
		String tel = key.next();
		System.out.print("주소:");
		String addr = key.next();
		DeptDTO user = new DeptDTO(deptcode, dname, tel, addr);
		int result = dao.insert(user);
		
		if(result>=1) {
			System.out.println("부서등록 성공");
		}else {
			System.out.println("부서등록 실패");
		}
	}
	
	@Override
	public void updateMenu() {
		System.out.println("*******부서정보수정(부서번호)********");
		System.out.print("부서번호:");
		String tel = key.next();
		System.out.print("주소:");
		String addr = key.next();
		System.out.print("부서코드:");
		String deptcode = key.next();
		
		DeptDTO dept = new DeptDTO(tel, addr, deptcode);
		dao.update(dept);
		System.out.println("정보수정완료");
	}
	
	@Override
	public void deleteMenu() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void selectMenu() {
		System.out.println("*******부서조회********");
		System.out.println("부서번호");
		String deptno = key.next();
		DeptDTO dept =  dao.getDeptInfo(deptno);
		
		print(dept);
	}
	@Override
	public void showDeptInfo() {
		System.out.println("*******부서검색********");
		System.out.println("부서명: ");
		String deptname = key.next();
		List<DeptDTO> deptlist =  dao.getDeptSearch(deptname);
		
		if(deptlist.isEmpty()) {
			System.out.println("일치하는 데이터 없음");
		}
		
		for(DeptDTO dept: deptlist) {
			print(dept);
		}
	}
	@Override
	public void findByDept() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void getMemberList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAllMenu() {
		System.out.println("*******전체부서조회********");
		List<DeptDTO> deptlist =  dao.getDeptList();
		
		for(DeptDTO dept:deptlist) {
			print(dept);
		}
	}
	
	public void print(DeptDTO dept) {
		System.out.print(dept.getDeptCode()+"\t");
		System.out.print(dept.getDeptName()+"\t");
		System.out.print(dept.getTel()+"\t");
		System.out.print(dept.getAddr()+"\n");
	}
}
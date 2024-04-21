package multicam.java.hw.DAO;

import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	EmpDAO dao = new EmpDAOImpl();
	
	public void insertMenu() {
		System.out.println("*사원등록*");
		System.out.println("사원번호: ");
		String EmpNo = key.next();
		System.out.println("성명: ");
		String Ename = key.next();
		System.out.println("job: ");
		String Job = key.next();
		System.out.println("매니저아이디: ");
		String Mgr = key.next();
		System.out.println("부서번호: ");
		String DeptNo = key.next();
		
		dao.insert(EmpNo, Ename, Job, Mgr, DeptNo);
	}

	public void selectMenu() {
		dao.select();
	}

	public void searchMenu() {
		System.out.println("*job별로 조회하기*");
		System.out.println("job: ");
		String Job = key.next();
		
		dao.search(Job);
	}

	public void updateMenu() {
		System.out.println("*사원수정*");
		System.out.println("급여: ");
		String Sal = key.next();
		System.out.println("성명: ");
		String Ename = key.next();
		
		dao.update(Sal, Ename);
	}

	public void deleteMenu() {
		dao.delete();
	}

	public void getInfoMenu() {
		System.out.println("*매니저정보조회*");
		System.out.println("매니저번호: ");
		String Mgr = key.next();
		
		dao.searchMgr(Mgr);
	}
}
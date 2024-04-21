package multicam.java.hw.DAO;

public interface EmpDAO {
	void insert(String EmpNo, String Ename, String Job, String Mgr, String DeptNo);
	void update(String Sal, String Ename);
	void delete();
	void select();
	void search(String SearchJob);
	void searchMgr(String SearchMgr);
}
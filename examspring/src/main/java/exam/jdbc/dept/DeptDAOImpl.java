package exam.jdbc.dept;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import exam.jdbc.MemberRowMapper;

@Repository
public class DeptDAOImpl implements DeptDAO {
	private JdbcTemplate template2;
	
	public DeptDAOImpl() {
		super();
	}
	
	@Autowired
	public DeptDAOImpl(JdbcTemplate template2) {
		super();
		this.template2 = template2;
	}
	
	@Override
	public int insert(DeptDTO dept) {
		String sql = "INSERT INTO mydept VALUES (?, ?, ?, ?)";
		return template2.update(sql, dept.getDeptCode(), dept.getDeptName(), dept.getTel(), dept.getAddr());
	}

	@Override
	public int update(DeptDTO dept) {
		String sql = "UPDATE mydept SET tel = ?, addr = ? WHERE deptcode = ?";
		return template2.update(sql, dept.getTel(), dept.getAddr(), dept.getDeptCode());
	}

	@Override
	public int count() {
		return template2.queryForObject("SELECT COUNT(*) FROM mydept", Integer.class);
	}

	@Override
	public DeptDTO getDeptInfo(String deptno) {
		DeptDTO dept = null;
		
		try {
			dept = template2.queryForObject("SELECT * FROM mydept WHERE deptcode = ?", new Object[] {deptno}, new DeptRowMapper());
			
			if(dept == null) {
				System.out.println("일치하는 데이터 없음");
			}
		} catch (Exception e) {
			System.out.println("오류");
		}
		
		return dept;
	}

	@Override
	public List<DeptDTO> getDeptList() {
		return template2.query("SELECT * FROM mydept", new DeptRowMapper());
	}

	@Override
	public List<DeptDTO> getDeptSearch(String deptname) {
		List<DeptDTO> dept = null;
		
		try {
			dept = template2.query("SELECT * FROM mydept WHERE deptname LIKE ?", new Object[] {"%" + deptname + "%"}, new DeptRowMapper());
			
		} catch (Exception e) {
			System.out.println("오류");
		}
		
		return dept;
	}
}
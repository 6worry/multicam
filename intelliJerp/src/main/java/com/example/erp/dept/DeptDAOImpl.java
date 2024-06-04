package com.example.erp.dept;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DeptDAOImpl implements DeptDAO {
	private JdbcTemplate template;

	@Autowired
	public DeptDAOImpl(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public List<DeptDTO> getDeptName() {
		return null;
	}

	@Override
	public int insert(DeptDTO dto) {
		String sql = "INSERT INTO dept (deptno, deptname, deptStartDay, deptEndDay, deptlevel, deptstep, deptuppercode, job_category, mgr_id, deptaddr, depttel) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		return template.update(sql, dto.getDeptno(), dto.getDeptname(), dto.getDeptStartDay(), dto.getDeptEndDay(), 
        		dto.getDeptlevel(), dto.getDeptstep(), dto.getDeptuppercode(), dto.getJob_category(), 
        		dto.getMgr_id(), dto.getDeptaddr(), dto.getDepttel());
	}

	@Override
	public List<DeptDTO> select() {
		return template.query("SELECT * FROM dept", new DeptRowMapper());
	}

	@Override
	public int delete(String deptno) {
		return template.update("DELETE FROM dept WHERE deptno = ?", deptno);
	}

	@Override
	public DeptDTO read(String deptno) {
	    return template.queryForObject("SELECT * FROM dept WHERE deptno = ?", new Object[]{deptno}, new DeptRowMapper());
	}

	@Override
	public int update(DeptDTO dto) {
		String sql = "UPDATE dept SET mgr_id = ?, deptaddr = ?, depttel = ? WHERE deptno = ?";
		return template.update(sql, dto.getMgr_id(), dto.getDeptaddr(), dto.getDepttel(), dto.getDeptno());
	}

	@Override
	public List<DeptDTO> getSubDeptlist(String uppercode) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

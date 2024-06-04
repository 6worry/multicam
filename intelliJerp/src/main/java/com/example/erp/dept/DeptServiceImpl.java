package com.example.erp.dept;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService {
	DeptDAO dao;

	@Autowired
	public DeptServiceImpl(DeptDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public List<DeptDTO> getDeptName() {
		return null;
	}

	@Override
	public int insert(DeptDTO dto) {
		return dao.insert(dto);
	}

	@Override
	public List<DeptDTO> select() {
		return dao.select();
	}

	@Override
	public int delete(String deptno) {
		return dao.delete(deptno);
	}

	@Override
	public DeptDTO read(String deptno) {
		return dao.read(deptno);
	}

	@Override
	public int update(DeptDTO dto) {
		return dao.update(dto);
	}

	@Override
	public List<DeptDTO> getSubDeptlist(String uppercode) {
		return null;
	}
}

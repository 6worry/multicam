package com.multi.erp.job;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.multi.erp.dept.DeptRowMapper;

@Repository
public class JobDAOImpl implements JobDAO {
	private JdbcTemplate template;

	public JobDAOImpl(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public int insert(JobDTO dto) {
		String sql = "INSERT INTO job (job_id, job_name, job_category, menupath) VALUES (?, ?, ?, ?)";
		return template.update(sql, dto.getJob_id(), dto.getJob_name(), dto.getJob_category(), dto.getMenupath());
	}

	@Override
	public List<JobDTO> select() {
		return template.query("SELECT * FROM job", new JobRowMapper());
	}

	@Override
	public int delete(String job_id) {
		return template.update("DELETE FROM job WHERE job_id = ?", job_id);
	}

	@Override
	public JobDTO read(String job_id) {
		return template.queryForObject("SELECT * FROM job WHERE job_id = ?", new Object[]{job_id}, new JobRowMapper());
	}

	@Override
	public int update(JobDTO dto) {
		String sql = "UPDATE job SET WHERE job_id = ?";
		return template.update(sql, dto.getJob_id(), dto.getJob_name(), dto.getJob_category(), dto.getMenupath());
	}
}
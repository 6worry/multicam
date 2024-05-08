package com.multi.erp.job;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class JobRowMapper implements RowMapper<JobDTO> {
	@Override
	public JobDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		System.out.println(rowNum);
		JobDTO job = new JobDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
		return job;
	}
}
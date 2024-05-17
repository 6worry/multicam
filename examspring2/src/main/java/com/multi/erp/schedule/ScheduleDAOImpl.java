package com.multi.erp.schedule;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ScheduleDAOImpl implements ScheduleDAO {
	private SqlSession sqlSessionTemplate;
	
	@Autowired
	public ScheduleDAOImpl(SqlSession sqlSessionTemplate) {
		super();
		this.sqlSessionTemplate = sqlSessionTemplate;
	}	
	
	@Override
	public int addSchedule(ScheduleDTO schedule) {
		return sqlSessionTemplate.insert("com.multi.erp.schedule.insert", schedule);
	}

	@Override
	public int modifySchedule(ScheduleDTO schedule) {
		System.out.println("---------------------------");
		System.out.println(schedule);
		return sqlSessionTemplate.update("com.multi.erp.schedule.update", schedule);
	}

	@Override
	public int deleteSchedule(String scheduleId) {
		return sqlSessionTemplate.delete("com.multi.erp.schedule.delete", scheduleId);
	}

	@Override
	public ScheduleDTO readSchedule(String scheduleId) {
		return sqlSessionTemplate.selectOne("com.multi.erp.schedule.selectRead", scheduleId);
	}

	@Override
	public List<ScheduleDTO> printSchedule(String id) {
		return sqlSessionTemplate.selectList("com.multi.erp.schedule.select", id);
	}
}
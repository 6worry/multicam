package com.multi.erp.schedule;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ScheduleServiceImpl implements ScheduleService {
	private ScheduleDAO dao;
	
	public ScheduleServiceImpl(ScheduleDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public int addSchedule(ScheduleDTO schedule) {
		return dao.addSchedule(schedule);
	}

	@Override
	public int modifySchedule(ScheduleDTO schedule) {
		return dao.modifySchedule(schedule);
	}

	@Override
	public int deleteSchedule(String scheduleId) {
		return dao.deleteSchedule(scheduleId);
	}

	@Override
	public ScheduleDTO readSchedule(String scheduleId) {
		return dao.readSchedule(scheduleId);
	}

	@Override
	public List<ScheduleDTO> printSchedule(String id) {
		return dao.printSchedule(id);
	}
}
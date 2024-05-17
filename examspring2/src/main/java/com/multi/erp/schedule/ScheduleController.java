package com.multi.erp.schedule;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.multi.erp.board.BoardDTO;

@Controller
public class ScheduleController {
	private ScheduleService service;

	@Autowired
	public ScheduleController(ScheduleService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/schedule/list")
	public String list(Model model, String scheduleUserId) {
		List<ScheduleDTO> list = service.printSchedule(scheduleUserId);
		model.addAttribute("list", list);
        return "schedule/list";
	}
	
	@GetMapping("/schedule/insert")
	public String insert() {
        return "schedule/insert";
	}
	
	@PostMapping("/schedule/insert")
	public String insert(ScheduleDTO dto) {
		service.addSchedule(dto);
		return "redirect:/schedule/list?scheduleUserId=" + dto.getScheduleUserId();
	}
	
	@GetMapping("/schedule/read")
	public String read(String scheduleId, Model model, String action) {
		ScheduleDTO dto = service.readSchedule(scheduleId);
		String view = "";
		
		if(action.equals("READ")) {
			view = "schedule/read";
		} else {
			view = "schedule/update";
		}
		
		model.addAttribute("schedule", dto);
        return view;
	}
	
	@PostMapping("/schedule/update")
	public String update(ScheduleDTO dto) {
		service.modifySchedule(dto);
        return "redirect:/schedule/list?scheduleUserId=" + dto.getScheduleUserId();
	}
}
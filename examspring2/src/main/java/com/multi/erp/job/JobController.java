package com.multi.erp.job;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.multi.erp.dept.DeptDTO;

@Controller
public class JobController {
	private JobService service;
	
	@Autowired
	public JobController(JobService service) {
		super();
		this.service = service;
	}

	@RequestMapping(value = "/job/insert.do", method = RequestMethod.GET)
	public String insert() {
		return "job/register";
	}
	
	@RequestMapping(value = "/job/insert.do", method = RequestMethod.POST)
	public String post(JobDTO dto) {
		try {
           service.insert(dto);
           return "redirect:/index.do";
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("오류");
            return "#"; 
        }
	}
	
	@GetMapping("/job/list")
	public String list(Model model) {
		List<JobDTO> dto = service.select();
		model.addAttribute("dto", dto);
        return "job/list";
	}
	
	@GetMapping("/job/delete.do")
	public String delete(String job_id) {
		service.delete(job_id);
        return "redirect:/job/list";
	}
	
	@GetMapping("/job/read.do")
	public String read(String job_id, Model model) {
		JobDTO dto = service.read(job_id);
		System.out.println(dto);
		model.addAttribute("dto", dto);
        return "job/read";
	}
	
	@PostMapping("/job/update.do")
	public String update(JobDTO dto) {
		service.update(dto);
		return "redirect:/job/list";
	}
}
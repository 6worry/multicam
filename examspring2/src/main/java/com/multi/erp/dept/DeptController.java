package com.multi.erp.dept;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DeptController {
	private DeptService service;
	
	@Autowired
	public DeptController(DeptService service) {
		super();
		this.service = service;
	}

	@RequestMapping(value = "/dept/insert", method = RequestMethod.GET)
	public String insert() {
		return "dept/register";
	}
	
	@RequestMapping(value = "/dept/insert", method = RequestMethod.POST)
	public String post(DeptDTO dto) {
		try {
           service.insert(dto);
           return "redirect:/index.do";
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("오류");
            return "#"; 
        }
	}
	
	@GetMapping("/dept/list")
	public String list(Model model) {
		List<DeptDTO> dto = service.select();
		model.addAttribute("dto", dto);
        return "dept/list";
	}
	
	@GetMapping("/dept/delete.do")
	public String delete(String deptno) {
		service.delete(deptno);
        return "redirect:/dept/list";
	}
	
	@GetMapping("/dept/read.do")
	public String read(String deptno, Model model, String action) {
		DeptDTO dto = service.read(deptno);
		String view = "";
		
		if(action.equals("READ")) {
			view = "dept/read";
		} else {
			view = "dept/update";
		}
		
		System.out.println(dto);
		model.addAttribute("dto", dto);
        return view;
	}
	
	@PostMapping("/dept/update.do")
	public String update(DeptDTO dto) {
		service.update(dto);
		return "redirect:/dept/list";
	}
 }
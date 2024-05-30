package com.example.thymeleafPro;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/th")
public class ThymeleafBasicTestController {
	@GetMapping("/text")
	public String basic(Model model) {
		model.addAttribute("msg", "test입니다");
		model.addAttribute("data", "test2입니다");
		
		return "basic/text";
	}
	
	@GetMapping("/oprtest")
	public String oprtest(Model model) {
		
		return "basic/oprtest";
	}
	
	@GetMapping("/iftest")
	public String iftest(Model model) {
		model.addAttribute("val", 78);
		model.addAttribute("age", 50);
		
		return "basic/iftest";
	}
	
	@GetMapping("/foreachtest")
	public String foreachtest(Model model) {
		PersonDTO dto = new PersonDTO("test1", "1234", "rewq1", 95);
		PersonDTO dto2 = new PersonDTO("test2", "1234", "rewq2", 95);
		PersonDTO dto3 = new PersonDTO("test3", "1234", "rewq3", 95);
		PersonDTO dto4 = new PersonDTO("test4", "1234", "rewq4", 89);
		
		List<PersonDTO> list = new ArrayList<>();
		list.add(dto);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		
		model.addAttribute("list", list);
		model.addAttribute("person", dto);
		
		return "basic/foreachtest";
	}
	
	@GetMapping("/linktest")
	public String getreq(Model model, String id, String data) {
		System.out.println(id);
		System.out.println(data);
		return "redirect:/";
	}
}

package com.multi.erp.etc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EtcViewController {
	@GetMapping("/json/showpage")
	public String showJsonPage() {
		return "etcview/json";	
	}
	
	@GetMapping("/ajax/showpage")
	public String showAjaxPage() {
		return "etcview/ajax";	
	}
	
	@GetMapping("/ajax/exam")
	private String showexamPage() {
		return "etcview/ajaxexam";
	}
}
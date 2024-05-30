package com.example.thymeleafPro;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/layout")
public class ThymeleafLayoutController {
	@GetMapping("/fragment")
	public String fragmentTest() {
		return "fragment/main";
	}
	
	@GetMapping("/mypage")
	public String fragmentExam() {
//		return "layout/mypage";
		return "member/mypage";
	}
	
	@GetMapping("/prdlist")
	public String prdlist() {
//		return "layout/prdlist";
		return "product/prdlist";
	}
	
	@GetMapping("/prdread")
	public String prdread(Model model, String prdno, String prdname) {
		model.addAttribute("prdno", prdno);
		model.addAttribute("prdname", prdname);
		
		return "product/productRead";
	}
}
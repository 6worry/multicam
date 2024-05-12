package com.multi.erp.member;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
	private MemberService service;

	@Autowired
	public MemberController(MemberService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/member/list")
	public String list(Model model) {
		List<MemberDTO> list = service.getMemberList();
		model.addAttribute("list", list);
        return "member/list";
	}
	
	@PostMapping("/member/login")
	public String login(MemberDTO dto, HttpServletRequest request) {
		String view = "";
		MemberDTO user = service.login(dto);
		
		if(user !=null) {
			view = "redirect:/index.do";
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
		} else {
			view = "redirect:/emp/login.do";
		}
		
        return view;
	}
	
	@GetMapping("/member/logout")
	public String logout(HttpSession session) {
		if(session != null) {
			session.invalidate();
		}
		
		return "redirect:/index.do";
	}
}

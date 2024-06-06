package com.multi.erp.member;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.WebUtils;

import com.multi.erp.board.FileUploadService;
import com.multi.erp.dept.DeptDTO;
import com.multi.erp.dept.DeptService;

@Controller
@SessionAttributes("user")
public class MemberController {
	private MemberService service;
	private DeptService deptservice;
	private FileUploadService fileuploadservice;
	
	@Autowired
	public MemberController(MemberService service, DeptService deptservice, FileUploadService fileuploadservice) {
		super();
		this.service = service;
		this.deptservice = deptservice;
		this.fileuploadservice = fileuploadservice;
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
	
	@PostMapping("/member/spring/login")
	public String springlogin(MemberDTO dto, Model model) {
		MemberDTO user = service.login(dto);
		String view = "";
		
		if(user !=null) {
			model.addAttribute("user", user);
			view = user.getMenupath();
		} else {
			view = "redirect:/emp/login.do";
		}
		
        return view;
	}
	
	@GetMapping("/member/spring/logout")
	public String springlogout(SessionStatus status) {
		status.setComplete(); // session에 있는 객체(login정보) 제거
		return "redirect:/index.do";
	}
	
	@GetMapping("/member/mypage")
	public String mypage(@ModelAttribute("user") MemberDTO user) {
		System.out.println(user.getMenupath());
		return user.getMenupath();
	}
	
	@GetMapping("/member/insert")
	public String insert(Model model) {
		List<DeptDTO> list= deptservice.select();
		model.addAttribute("list", list);
		
		return "member/insert";
	}
	
	@PostMapping("/member/insert")
	public String insert(MemberDTO dto, HttpSession session) throws IllegalStateException, IOException {
		MultipartFile file = dto.getUserImage();
		String path = WebUtils.getRealPath(session.getServletContext(), "/WEB-INF/upload");
		String dto2 = fileuploadservice.uploadFile(file, path);
		
        dto.setProfile_photo(dto2);
	    dto.setGender("0");
		service.insert(dto);
		System.out.println(dto);
		return "redirect:/index.do";
	}
	
	@PostMapping("/member/idcheck")
	@ResponseBody
    public Map<String, Boolean> checkId(@RequestParam("id") String id) {
        boolean check = service.idCheck(id);
        Map<String, Boolean> result = new HashMap<>();
        result.put("check", check);
        return result;
    }
}

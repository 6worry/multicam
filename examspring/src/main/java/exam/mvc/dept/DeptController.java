package exam.mvc.dept;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import exam.mvc.MemberDTO;

@Controller
public class DeptController {
	@RequestMapping(value = "/insert2", method = RequestMethod.GET)
	public String dept() {
		return "/dept";
	}
	
	@RequestMapping(value = "/insert2", method = RequestMethod.POST)
	public String dept2(DeptDTO dto, Model model) {
		model.addAttribute("dto", dto);
		return "/deptResult";
	}
}
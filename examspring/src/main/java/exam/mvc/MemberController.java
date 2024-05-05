package exam.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String post() {
		return "/register";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String post2(MemberDTO dto, Model model) {
		model.addAttribute("dto", dto);
		return "/insertResult";
	}
}
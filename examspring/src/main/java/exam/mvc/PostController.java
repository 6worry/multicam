package exam.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PostController {
	@RequestMapping(value = "/showpost", method = RequestMethod.GET)
	public String post() {
		return "/post";
	}
	
	@RequestMapping(value = "/showform", method = RequestMethod.POST)
	public String post2(PostDTO dto, Model model) {
		model.addAttribute("dto", dto);
		return "/postResult";
	}
}
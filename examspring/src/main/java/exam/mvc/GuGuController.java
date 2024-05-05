package exam.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GuGuController {
	@RequestMapping("/gugu")
	public String showgugu() {
		return "/gugu";
	}
}
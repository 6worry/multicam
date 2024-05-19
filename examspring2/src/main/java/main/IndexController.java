package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/index.do")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/emp/login.do")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/menu/board.do")
	public String board() {
		return "menu/board";
	}
}
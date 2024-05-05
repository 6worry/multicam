package exam.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TilesController {
	@RequestMapping("/tiles/index")
	public String index() {
		return "tiles/index";
	}
	
	@RequestMapping("/tiles/insert")
	public String insert() {
		return "tiles/insert";
	}
	
	@RequestMapping("/tiles/login")
	public String login() {
		return "tiles/login";
	}
}
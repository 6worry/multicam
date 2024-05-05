package exam.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ParamTestController {
	@RequestMapping("/showview")
	public String showpage() {
		return "/paramtest";
	}
	
	@RequestMapping(value = "/paramtest", method = RequestMethod.GET)
	public ModelAndView paramtest(HttpServletRequest req, @RequestParam("data") String data2, String info2) {
		String param = req.getParameter("data");
		ModelAndView mav = new ModelAndView("/paramresult");
		
		System.out.println(data2);
		System.out.println(info2);
		System.out.println(param);
		
		mav.addObject("msg", "spring share data");
		mav.addObject("data", data2);
		
		return mav;
	}
	
	@RequestMapping(value = "/paramresult2", method = RequestMethod.POST)
	public ModelAndView posttest(HttpServletRequest req, @RequestParam("data") String data, String id, String pw) {
		String param = req.getParameter("data");
		ModelAndView mav = new ModelAndView();
		
//		mav.setViewName("/paramresult2");
		mav.addObject("data", data);
		mav.addObject("id", id);
		mav.addObject("pw", pw);
		
//		model.addAttribute("data", param);
//	    model.addAttribute("id", id);
//	    model.addAttribute("pw", pw);
		
		System.out.println(data);
		System.out.println(id);
		System.out.println(pw);
		
		return mav;
	}
	
	@RequestMapping(value = "/cmdtest", method = RequestMethod.POST)
	public ModelAndView cmdtest(ParamDTO dto) {
		System.out.println(dto);
		ModelAndView mav = new ModelAndView("/paramresult3");
		
		mav.addObject("dto", dto);
		return mav;
	}
}
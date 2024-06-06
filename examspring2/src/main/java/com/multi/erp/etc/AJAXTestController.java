package com.multi.erp.etc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.multi.erp.board.BoardDTO;
import com.multi.erp.board.BoardService;

@Controller
public class AJAXTestController {
	private BoardService service;
	
	@Autowired
	public AJAXTestController(BoardService service) {
		super();
		this.service = service;
	}

	@GetMapping("/ajax/No_AJAX")
	public String noAjax(String id, Model model) {
		String msg = "";
		
		if(id.equals("jang")) {
			msg = "사용 X";
		} else {
			msg = "사용 O";
		}
		
		model.addAttribute("msg", msg);
		return "etcview/ajax";	
	}
	
	@GetMapping(value = "/ajax/AJAX", produces = "application/text; charset=UTF-8")
	@ResponseBody
	private String ajaxtest(String id) {
		String msg = "";
		
		if(id.equals("jang")) {
			msg = "사용 X";
		} else {
			msg = "사용 O";
		}
		
		return msg;	
	}
	
	@GetMapping("/ajax/gugu")
	@ResponseBody
	private String gugu(String dan) {
		String msg = "";
		int num = Integer.parseInt(dan);
		
		for(int i = 1; i < 10; i++) {
			msg += num + " * " + i + " = " + (i * num) + "<br>";
		}
		
		return msg;	
	}
	
	@GetMapping("/ajax/exam01")
	@ResponseBody
	private BoardDTO boardno(String boardno) {
		return service.getBoardInfo(boardno);		
	}
	
	@GetMapping("/ajax/exam02")
	@ResponseBody
	private List<BoardDTO> boardlist() {
		System.out.println(service.boardList());
		return service.boardList();		
	}
}
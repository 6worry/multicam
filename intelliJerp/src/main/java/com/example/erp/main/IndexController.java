package com.example.erp.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.erp.board.BoardService;
import com.example.erp.dto.BoardDTO;

@Controller
public class IndexController {
	private BoardService service;
	
	@Autowired
	public IndexController(BoardService service) {
		super();
		this.service = service;
	}

	@RequestMapping("/index.do")
	public String index(Model model) {
		List<BoardDTO> boardlist = service.findByCategory("게시판");
		model.addAttribute("boardlist", boardlist);
		return "layout/indexLayout";
	}
	
	@RequestMapping("/emp/login.do")
	public String login() {
		return "emp/login";
	}
	
	@RequestMapping("/menu/board.do")
	public String board() {
		return "menu/board";
	}
}
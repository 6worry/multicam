package com.multi.erp.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {
	private BoardService service;

	@Autowired
	public BoardController(BoardService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/board/list")
	public String list(Model model, String category) {
		List<BoardDTO> list = service.findByCategory(category);
		model.addAttribute("list", list);
		model.addAttribute("category", category);
        return "board/list";
	}
	
	@GetMapping("/board/write")
	public String write() {
        return "board/write";
	}
	
	@PostMapping("/board/write")
	public String insert(BoardDTO dto) {
		service.insert(dto);
		return "redirect:/board/list?category=all";
	}
	
	/*
	 * @PostMapping("/board/search") public String search(Model
	 * model, @RequestParam("search") String data) { List<BoardDTO> list =
	 * service.search(data); model.addAttribute("list", list); return "board/list";
	 * }
	 */
	
	@GetMapping("/board/read")
	public String read(String board_no, Model model, String action) {
		BoardDTO dto = service.getBoardInfo(board_no);
		String view = "";
		
		if(action.equals("READ")) {
			view = "board/read";
		} else {
			view = "board/update";
		}
		
		model.addAttribute("board", dto);
        return view;
	}
	
	@GetMapping("/board/delete")
	public String delete(String board_no) {
		service.delete(board_no);
        return "redirect:/board/list?category=all";
	}
	
	@PostMapping("/board/update")
	public String update(BoardDTO dto) {
		service.update(dto);
        return "redirect:/board/list?category=all";
	}
	
	@PostMapping("/board/search")
	public String search(Model model, String tag, @RequestParam("search") String data) {
		List<BoardDTO> list = service.search(tag, data);
		model.addAttribute("list", list);
        return "board/list";
	}
}
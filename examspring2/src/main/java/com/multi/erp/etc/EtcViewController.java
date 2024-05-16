package com.multi.erp.etc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.erp.board.BoardDTO;
import com.multi.erp.board.BoardService;

@RestController
public class EtcViewController {
	private BoardService service;
	
	@Autowired
	public EtcViewController(BoardService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/json/showpage")
	public String showJsonPage() {
		return "etcview/json";	
	}
	
	@GetMapping("/json/getString")
	public String responseString() {
		return "text data";	
	}
	
	@GetMapping("/json/getJsonObj")
	public BoardDTO responseJsonObj() {
		return service.getBoardInfo("41");
	}
	
	@GetMapping("/json/getJsonArray")
	public List<BoardDTO> responseJsonArray() {
		return service.boardList();
	}
}
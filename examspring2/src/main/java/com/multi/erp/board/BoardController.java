package com.multi.erp.board;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

@Controller
public class BoardController {
	private BoardService service;
	private FileUploadService fileuploadservice;
	
	@Autowired
	public BoardController(BoardService service, FileUploadService fileuploadservice) {
		super();
		this.service = service;
		this.fileuploadservice = fileuploadservice;
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
	public String insert(BoardDTO dto, HttpSession session) throws IllegalStateException, IOException {
		List<MultipartFile> file = dto.getFiles();
		String path = WebUtils.getRealPath(session.getServletContext(), "/WEB-INF/upload");
		// service.insert(dto);
		// fileuploadservice.uploadFiles(file, path);
		System.out.println(path);
		
		List<BoardFileDTO> boardfiletolist = fileuploadservice.uploadFiles(file, path);
		service.insert(dto, boardfiletolist);
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
		List<BoardFileDTO> boardfilelist = service.getFileList(board_no);
		String view = "";
		
		if(action.equals("READ")) {
			view = "board/read";
		} else {
			view = "board/update";
		}
		
		model.addAttribute("board", dto);
		model.addAttribute("boardfilelist", boardfilelist);
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
	
	@GetMapping("/board/download/{id}/{board_no}/{boardFileno}")
	public ResponseEntity<UrlResource> downloadFile(@PathVariable String id, @PathVariable String board_no, @PathVariable String boardFileno, HttpSession session) throws MalformedURLException, FileNotFoundException {
//		System.out.println(id + "," + board_no + "," + boardFileno + ",");
		BoardFileDTO fileinfo = service.getFile(boardFileno);
		UrlResource resource = new UrlResource("file:" + WebUtils.getRealPath(session.getServletContext(), "/WEB-INF/upload/" + fileinfo.getStoreFilename()));
		String encodedFilename = UriUtils.encode(fileinfo.getOriginalFilename(), "UTF-8");
		String mycontenttype = "attachment; filename=\"" + encodedFilename + "\"";
//		BodyBuilder builder = ResponseEntity.ok();
//		builder.header(HttpHeaders.CONTENT_DISPOSITION, mycontenttype)
//		ResponseEntity<UrlResource> resp = builder.body(resource);
//		
//		return resp;
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION, mycontenttype)
				.body(resource);
	}
	
	@GetMapping("/ajax/list")
	@ResponseBody
	public List<BoardDTO> ajaxlist(String category) {
		List<BoardDTO> boardlist = service.findByCategory(category);
		return boardlist;
	}
}
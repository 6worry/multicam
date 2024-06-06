package com.multi.erp.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {
	private BoardDAO dao;
	
	@Autowired
	public BoardServiceImpl(BoardDAO dao) {
		super();
		this.dao = dao;
	}
	
	@Override
	public int insert(BoardDTO board) {
		return dao.insert(board);
	}

	@Override
	public List<BoardDTO> boardList() {
		List<BoardDTO> boardlist = dao.boardList();
		return boardlist;
	}

	@Override
	public BoardDTO getBoardInfo(String board_no) {
		BoardDTO dto = dao.read(board_no);
		return dto;
	}

	@Override
	public int update(BoardDTO board) {
		return dao.update(board);
	}

	@Override
	public int delete(String board_no) {
		return dao.delete(board_no);
	}

	@Override
	public List<BoardDTO> search(String data) {
		List<BoardDTO> boardlist = dao.search(data);
		return boardlist;
	}

	@Override
	public List<BoardDTO> search(String tag, String data) {
		return dao.search(tag, data);
	}

	@Override
	public List<BoardDTO> findByCategory(String category) {
		List<BoardDTO> boardlist = null;
		
		if(category != null) {
			if(category.equals("all")) {
				boardlist = dao.boardList();
			} else {
				boardlist = dao.findByCategory(category);
			}
		}
		
		return boardlist;
	}

	@Override
	public int insert(BoardDTO board, List<BoardFileDTO> boardfiledtolist) {
		if(boardfiledtolist.size() == 0) {
			dao.insert(board);
		} else {
			dao.insert(board);
			dao.insertFile(boardfiledtolist);
		}
		
		return 0;
	}

	@Override
	public List<BoardFileDTO> getFileList(String boardno) {
		return dao.getFileList(boardno);
	}

	@Override
	public BoardFileDTO getFile(String boardFileno) {
		return dao.getFile(boardFileno);
	}
}

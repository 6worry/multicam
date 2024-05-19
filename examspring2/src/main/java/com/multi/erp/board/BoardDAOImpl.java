package com.multi.erp.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO {
	private SqlSession sqlSessionTemplate;
	
	@Autowired
	public BoardDAOImpl(SqlSession sqlSessionTemplate) {
		super();
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public int insert(BoardDTO board) {
		return sqlSessionTemplate.insert("com.multi.erp.board.insert", board);
	}

	@Override
	public List<BoardDTO> boardList() {
		return sqlSessionTemplate.selectList("com.multi.erp.board.selectall");
	}

	@Override
	public BoardDTO read(String board_no) {
		return sqlSessionTemplate.selectOne("com.multi.erp.board.selectRead", board_no);
	}

	@Override
	public int update(BoardDTO board) {
		return sqlSessionTemplate.update("com.multi.erp.board.update", board);
	}

	@Override
	public int delete(String board_no) {
		return sqlSessionTemplate.delete("com.multi.erp.board.delete", board_no);
	}

	@Override
	public List<BoardDTO> search(String data) {
		return sqlSessionTemplate.selectList("com.multi.erp.board.searchTitle", data);
	}

	@Override
	public List<BoardDTO> search(String tag, String data) {
		Map<String, String> map = new HashMap<>();
		
	    map.put("tag", tag);
	    map.put("data", data);
	    
	    return sqlSessionTemplate.selectList("com.multi.erp.board.searchTag", map);
	}

	@Override
	public List<BoardDTO> findByCategory(String category) {
		return sqlSessionTemplate.selectList("com.multi.erp.board.categorySelect", category);
	}
}
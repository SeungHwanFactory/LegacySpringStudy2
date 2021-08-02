package com.nsh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.nsh.domain.BoardVO;

public interface BoardMapper {

	/*
	 * xml파일로 처리했으면 필요없다.
	 * */
	//@Select("select * from tbl_board where bno > 0")
	public List<BoardVO> getList();
	
	public void insert(BoardVO board);
	
	public void insertSelectKey(BoardVO board);
	
	public BoardVO read(Long bno);
	
	public int delete(Long bno);
	
	public int update(BoardVO board);
}

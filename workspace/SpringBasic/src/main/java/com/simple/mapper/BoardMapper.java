package com.simple.mapper;

import java.util.ArrayList;

import com.simple.command.BoardVO;

public interface BoardMapper {
	public void boardRegister(BoardVO vo);
	public ArrayList<BoardVO> getList();
	public void boardDelete(int num);

}

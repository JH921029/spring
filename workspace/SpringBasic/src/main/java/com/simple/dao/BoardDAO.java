package com.simple.dao;

import java.util.ArrayList;

import com.simple.command.BoardVO;

public interface BoardDAO {
	public void boardRegister(BoardVO vo);
	public ArrayList<BoardVO> getList();
	public void boardDelete(int num);
}

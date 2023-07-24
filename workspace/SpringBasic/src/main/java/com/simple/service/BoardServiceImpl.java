package com.simple.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.command.BoardVO;
import com.simple.dao.BoardDAO;
import com.simple.mapper.BoardMapper;
import com.simple.mapper.ScoreMapper;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public void boardRegister(BoardVO vo) {
		boardMapper.boardRegister(vo);
	}

	@Override
	public ArrayList<BoardVO> getList() {

		return boardMapper.getList();
	}

	@Override
	public void boardDelete(int num) {
		
		boardMapper.boardDelete(num);
	}

}

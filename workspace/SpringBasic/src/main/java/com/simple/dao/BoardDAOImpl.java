package com.simple.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.simple.command.BoardVO;

@Repository("board")
public class BoardDAOImpl implements BoardDAO {

	ArrayList<BoardVO> list = new ArrayList<>();
	
	
	@Override
	public void boardRegister(BoardVO vo) {
		list.add(vo);
		System.out.println(vo.toString());
	}

	@Override
	public ArrayList<BoardVO> getList() {
		return list;
	}

	@Override
	public void boardDelete(int num) {
		list.remove(num);
	}

}

package com.simple.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.simple.command.BoardVO;
import com.simple.command.ScoreVO;
import com.simple.service.BoardService;
import com.simple.service.ScoreService;

@Controller
@RequestMapping("/service")
public class BoardController {

	@Autowired
	@Qualifier("boardService")
	BoardService boardService;


	//화면처리
	@RequestMapping("/boardRegister")
	public String boardRegister() {

		return "service/boardRegister";
	}

	//목록화면
	@RequestMapping("/boardList")
	public String getList(Model model) {

		ArrayList<BoardVO> list = boardService.getList();
		model.addAttribute("list", list);

		return "service/boardList";
	}

	//결과화면
	@RequestMapping("/boardResult")
	public String boardResult() {

		return "service/boardResult";
	}

	//등록요청
	@RequestMapping(value="/boardForm", method=RequestMethod.POST)
	public String boardForm(BoardVO vo) {

		boardService.boardRegister(vo);

		return "redirect:/service/boardResult";//등록 이후에는 결과로
	}
}

package com.simple.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ReqVO;


@Controller
@RequestMapping("/request")//각 메서드의 공통 디렉토리경로
public class RequestController {

	//화면을 띄우는 컨트롤러
	@RequestMapping("/req_ex01")//request/req_ex01  //들어오는 경로
	public String ex01() {
		return "request/req_ex01";					//나가는 경로	
	}


	//get요청만 허용
	@GetMapping(value = "/basic1")
	//@RequestMapping(value = "/basic1", method = RequestMethod.GET)
	public void basic1() {
		System.out.println("basic1요청");
	}

	//post요청만 허용
	@PostMapping(value = "/basic2")
	//@RequestMapping(value="/basic2", method = RequestMethod.POST)
	public void basic02() {
		System.out.println("basic2요청");
	}

	//get, post 둘다 허용
	@RequestMapping(value="/basic3")
	public void basic03() {
		System.out.println("basic3요청");
	}


	/////////////////////////////////////////////////////
	/////////////파라미터값 받기////////////////
	@RequestMapping("/req_ex02")
	public String ex02() {
		return "request/req_ex02";
	}

	/*
	 * //전통적인 방법
	 * 
	 * @RequestMapping("/param1") public String param1(HttpServletRequest request) {
	 * String name = request.getParameter("name"); String age =
	 * request.getParameter("age"); String[] inter =
	 * request.getParameterValues("inter");
	 * 
	 * System.out.println(name);
	 * 
	 * return "request/result"; //result페이지로 }
	 */




	//@RequestParam(네임값) - 반드시 필수로 값이 전달 되야 합니다. 스트링은 값이없으면 공백으로 전달
	//required = false는 반드시 필수가 아님
	//defaultValue 값이 없을 때 기본값
	/*
	 * @RequestMapping("/param1") public String param1(@RequestParam("name") String
	 * x,
	 * 
	 * @RequestParam(value = "age", required = false, defaultValue = "10") int y,
	 * 
	 * @RequestParam(value = "inter", required = false, defaultValue = "")
	 * ArrayList<String> z){
	 * 
	 * System.out.println(x); System.out.println(y);
	 * System.out.println(z.toString());
	 * 
	 * 
	 * return "request/result"; }
	 */




	/*
	 * //커맨드 객체를 이용하는 방법
	 * 
	 * @RequestMapping("/param1") public String param1(ReqVO vo) {
	 * System.out.println(vo.toString()); return "request/result"; }
	 */

	
	
	//화면처리
	@RequestMapping("/req_quiz01")
	public String quiz01() {
		return "request/req_quiz01";
	}

	@RequestMapping(value="/login", method=RequestMethod.POST) 
	public String login(@RequestParam("id") String id, @RequestParam("pw") String pw) {
		System.out.println(id);
		System.out.println(pw);
		
		if(id.equals("abc123") && pw.equals("xxx123")) {
			
			return "request/req_quiz01_ok";
			
		} else {
			return "request/req_quiz01_no";
		}
	}

}

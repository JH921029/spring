package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz")
public class QuizController {
	
	@RequestMapping("quiz01")
	public String quiz01() {
		
		
		return "quiz/quiz01";
	}
	
	@RequestMapping(value="/birth")
	public String birth(@ModelAttribute("year") String year,
						@ModelAttribute("month") String month,
						@ModelAttribute("day") String day) {
		
		
		return "quiz/quiz01_ok";
	}
	


}

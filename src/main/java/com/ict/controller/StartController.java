package com.ict.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// 어노테이션으로 컨트롤러 만들자
@Controller
public class StartController {

	
	//실행메서드 (ModelAndView 또는 String)
	//인자는 자유롭게 사용할 수 있다.(requst, model, session....)
	
	@RequestMapping(value = "start.do", method=RequestMethod.GET)
	public ModelAndView exec() {
		ModelAndView mv = new ModelAndView("output");	
		mv.addObject("name", "희동이");
		mv.addObject("age", 3);
		mv.addObject("addr", "서울");
		
		
		return mv;
	}
}

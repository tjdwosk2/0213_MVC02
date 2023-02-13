package com.ict.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {
		
	// * a 링크는 get 방식이므로 post에서는 받지않는다 .
	//@RequestMapping(value = "index.do" ,method = RequestMethod.GET)
	
	@GetMapping("index.do")
	public ModelAndView exec() {
		ModelAndView mv = new ModelAndView("output");
		
		mv.addObject("name", "둘리");
		mv.addObject("age", 12);
		mv.addObject("addr", "남극");
		
		
		return mv;
	}
}

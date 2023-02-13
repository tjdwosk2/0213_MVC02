package com.ict.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@GetMapping("index2.do")
	public ModelAndView exec01() {
		ModelAndView mv = new ModelAndView("output");
		String[] dogName = {"땅콩이","진돌이","바둑이","점순이"};
		
		//오브 젝트여서 다 저장완료 
		mv.addObject("dogName", dogName);
		return mv;
	}
	@GetMapping("start2.do")
	public ModelAndView exec02() {
		ModelAndView mv = new ModelAndView("output");
		ArrayList<String> list = new ArrayList<String>();
		list.add("헤리");
		list.add("엠마");
		list.add("덤블도어");
		list.add("론");
	
		mv.addObject("list", list);
		return mv;
		
		
	}
}

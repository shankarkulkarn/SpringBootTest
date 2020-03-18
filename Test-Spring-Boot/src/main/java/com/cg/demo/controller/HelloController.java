package com.cg.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	
	@RequestMapping("welcome")
	public ModelAndView  sayHello()
	{
		  String str="Welcome To Spring Boot APP ";
		  ModelAndView mv = new ModelAndView("hello","message",str);
		  return mv;
	}
	
}

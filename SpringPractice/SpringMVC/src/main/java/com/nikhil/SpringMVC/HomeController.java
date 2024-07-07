package com.nikhil.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("addAlien")
	public String addAlien(@ModelAttribute Alien alien) {
		
//		Alien alien=new Alien();
//		alien.setAid(aid);
//		alien.setAname(aname);
//		
//		mv.addObject("alien",alien);
//		mv.setViewName("result");
		return "result";
	}
}

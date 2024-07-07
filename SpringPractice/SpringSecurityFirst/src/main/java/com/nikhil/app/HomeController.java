package com.nikhil.app;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HomeController {
	
	@GetMapping("home")
	public String home(HttpServletRequest response) {
		return "Hey welcome...  "+response.getSession().getId();
	}
	
	@GetMapping("about")
	public String about(HttpServletRequest response) {
		return "Nikhil Reddy...  "+response.getSession().getId();
	}
}

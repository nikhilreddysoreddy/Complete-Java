package com.nikhil.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringFirstApplication.class, args);
		
		Alien a=context.getBean(Alien.class);
		a.code();
	}
	

}

package com.nikhil.Spring1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Laptop implements Computer {
	
	public Laptop() {
		System.out.println("laptop object has created.");
	}
	
	@Override
	public void compile() {
		System.out.println("Compiling using laptop...");
	}
}

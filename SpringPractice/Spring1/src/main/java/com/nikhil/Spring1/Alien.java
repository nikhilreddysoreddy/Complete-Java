package com.nikhil.Spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	@Value("22")
	private int age;
	
//	@Autowired
//	@Qualifier("laptop")
	private Computer com;
	
	
//	public Alien(int age, Computer lap) {
//		System.out.println("constructor has called..");
//		this.age = age;
//		this.lap = lap;
//	}
	
	
	public Computer getCom() {
		return com;
	}
	
	@Autowired
	@Qualifier("desktop")
	public void setCom(Computer com) {
		this.com = com;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("age setter method is called");
		this.age = age;
	}
	
	public Alien() {
		System.out.println("Alien object has created..");
	}
	public void code() {
		System.out.println("hey i'm coding..");
		com.compile();
	}
}

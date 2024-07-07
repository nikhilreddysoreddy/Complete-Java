package com.nikhil.Spring1.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.nikhil.Spring1.Alien;
import com.nikhil.Spring1.Computer;
import com.nikhil.Spring1.Desktop;
import com.nikhil.Spring1.Laptop;

@Configuration
@ComponentScan("com.nikhil.Spring1")
public class AppConfig {
	
//	@Bean
//	public Alien alien(Computer com) {		//@Qualifier("desk") 
//		Alien alien=new Alien();
//		alien.setAge(24);
//		alien.setCom(com);
//		return alien;
//	}
//	
//	@Bean(name= {"desk"})
//	@Primary
//	public Desktop desktop() {
//		return new Desktop();
//	}
//	
//	@Bean
//	public Laptop laptop() {
//		return new Laptop();
//	}
}

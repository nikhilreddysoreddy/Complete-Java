package com.nikhil.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nikhil.app.model.Laptop;
import com.nikhil.app.service.LaptopService;

@SpringBootApplication
public class SpringSecondApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringSecondApplication.class, args);
		LaptopService service=context.getBean(LaptopService.class);
		
		Laptop lap=context.getBean(Laptop.class);
		service.addLaptop(lap);
	}

}

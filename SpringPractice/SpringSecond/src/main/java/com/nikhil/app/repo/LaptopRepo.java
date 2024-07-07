package com.nikhil.app.repo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nikhil.app.model.Laptop;

@Component
public class LaptopRepo 
{
	
	public void save(Laptop lap) {
		System.out.println("Laptop saved to database..");
	}
}

package com.nikhil.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.nikhil.app.model.Laptop;
import com.nikhil.app.repo.LaptopRepo;

@Service
public class LaptopService {
	@Autowired
	private LaptopRepo repo; 
	
	public void addLaptop(Laptop lap) {
		repo.save(lap);
	}
	
	public boolean isGoodForProg(Laptop lap) {
		return true;
	}
}

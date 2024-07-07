package com.nikhil.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nikhil.app.model.Student;
import com.nikhil.app.repo.Studentrepo;

@Service
public class StudentService {
	
	private Studentrepo repo; 
	
	public Studentrepo getRepo() {
		return repo;
	}
	@Autowired
	public void setRepo(Studentrepo repo) {
		this.repo = repo;
	}

	public void addStudent(Student std1) {
		repo.save(std1);
	}
	public List<Student> getStudents() {
		return repo.findAll();
	}

}

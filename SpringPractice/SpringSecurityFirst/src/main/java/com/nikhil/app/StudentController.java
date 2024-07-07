package com.nikhil.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {
	List<Student> students=new ArrayList<Student>(List.of(new Student(74,"Nikhil","CSE"),new Student(75,"Venky","ECE")));
	
	@GetMapping("csrf")
	public CsrfToken getCsrf(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
	}
	
	@GetMapping("students")
	public List<Student> getStudents(){
		return students;
	}
	
	@PostMapping("students")
	public void addStudent(@RequestBody Student student) {
		students.add(student);
	}
}

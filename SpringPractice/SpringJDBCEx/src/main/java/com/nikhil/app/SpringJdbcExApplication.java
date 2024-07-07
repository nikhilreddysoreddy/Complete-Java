package com.nikhil.app;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nikhil.app.service.StudentService;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringJdbcExApplication.class, args);
		
		Student std1=context.getBean(Student.class);
		std1.setRollNo(55);
		std1.setName("suji");
		std1.setMarks(74);
		
		StudentService service=context.getBean(StudentService.class);
		service.addStudent(std1);
		
		List<Student> students=service.getStudents();
		System.out.println(students);
	}

}

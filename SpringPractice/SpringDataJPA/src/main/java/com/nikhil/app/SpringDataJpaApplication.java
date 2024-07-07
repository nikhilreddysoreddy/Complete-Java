package com.nikhil.app;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nikhil.app.model.Student;
import com.nikhil.app.repo.Studentrepo;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringDataJpaApplication.class, args);
		
//		Student s1=context.getBean(Student.class);
//		s1.setRollNo(74);
//		s1.setName("Nikhil");
//		s1.setMarks(82);
		
		Student s2=context.getBean(Student.class);
		s2.setRollNo(75);
		
//		Student s3=context.getBean(Student.class);
//		s3.setRollNo(76);
//		s3.setName("Prakash");
//		s3.setMarks(80);
		
		Studentrepo repo=context.getBean(Studentrepo.class);
//		repo.save(s2);
		
//		System.out.println(repo.findAll());
		
//		Optional<Student> s=repo.findById(76);
//		System.out.println(s.orElse(new Student()));
		
//		System.out.println(repo.findByName("nikhil"));
//		System.out.println(repo.findByMarks(82));
//		System.out.println(repo.findByMarksGreaterThan(70));
		
//		repo.save(s2);
		
		repo.delete(s2);
	}

}

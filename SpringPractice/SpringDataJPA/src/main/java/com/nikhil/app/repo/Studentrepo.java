package com.nikhil.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nikhil.app.model.Student;

@Repository
public interface Studentrepo extends JpaRepository<Student, Integer>{
	
	List<Student> findByName(String name);
	
	List<Student> findByMarks(int marks);
	
	List<Student> findByMarksGreaterThan(int marks);
}

package com.nikhil.app.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nikhil.app.model.JobPost;
import com.nikhil.app.repo.JobRepo;

@Service
public class JobService {
	
	@Autowired
	private JobRepo repo;
	
	public void addJob(JobPost jobPost) {
		repo.save(jobPost);
	}
	
	public List<JobPost> getAllJobs(){
		return repo.findAll();
	}

	public JobPost getJob(int postId) {
//		int i=10/0;
		return repo.findById(postId).orElse(new JobPost());
	}

	public void updatePost(JobPost jobPost) {
		repo.save(jobPost);		
	}

	public void deletePost(int postId) {
		repo.deleteById(postId);
	}
	
	public void load() {
		
		List<JobPost> jobs=new ArrayList<>(Arrays.asList(
				new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
						List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
				new JobPost(5, "Fullstack Developer", "Must have good experience in java and complete Enterprice level application development", 2,
						List.of("Core Java", "J2EE", "Spring Boot", "CSS","HTML","MangoDB","JavaScript")),
				new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
						3, List.of("HTML", "CSS", "JavaScript", "React")),		
				new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
						List.of("Python", "Machine Learning", "Data Analysis")),
				new JobPost(4, "Network Engineer","Design and implement computer networks for efficient data communication", 5,
						List.of("Networking", "Cisco", "Routing", "Switching"))
				));
		repo.saveAll(jobs);
	}

	public List<JobPost> search(String keyword) {
		return repo.findByPostProfileContainingOrPostDescContaining(keyword,keyword);
	}
}

package com.nikhil.app.service;

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
		repo.addJob(jobPost);
	}
	
	public List<JobPost> getAllJobs(){
		return repo.getAlljobs();
	}

	public JobPost getJob(int postId) {
		return repo.getJob(postId);
	}

	public void updatePost(JobPost jobPost) {
		repo.updatePost(jobPost);		
	}

	public void deletePost(int postId) {
		repo.deletePost(postId);
		
	}
}

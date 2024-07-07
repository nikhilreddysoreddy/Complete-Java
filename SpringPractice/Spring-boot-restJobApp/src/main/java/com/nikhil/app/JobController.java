package com.nikhil.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nikhil.app.model.JobPost;
import com.nikhil.app.service.JobService;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class JobController {
	@Autowired
	private JobService service;
	
	@GetMapping(path = "jobposts", produces={"application/json"})
	public List<JobPost> viewAllJobs(){
		return service.getAllJobs();
	}
	
	@GetMapping("jobpost/{postId}")
	public JobPost getJob(@PathVariable("postId") int postId) {
		return service.getJob(postId);
	}
	
	@PostMapping(path = "jobpost", consumes = {"application/xml"})
	public JobPost addJob(@RequestBody JobPost jobPost) {
		service.addJob(jobPost);
		return service.getJob(jobPost.getPostId());
	}
	
	@PutMapping("jobpost")
	public JobPost updatePost(@RequestBody JobPost jobPost) {
		service.updatePost(jobPost);
		return service.getJob(jobPost.getPostId());
	}
	
	@DeleteMapping("jobpost/{postId}")
	public String deletePost(@PathVariable int postId) {
		service.deletePost(postId);
		return "Deleted";
	}
}

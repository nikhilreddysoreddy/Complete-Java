package com.nikhil.app.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nikhil.app.model.JobPost;

@Repository
public class JobRepo {
	
	List<JobPost> jobs=new ArrayList<>(Arrays.asList(
			new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
					List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
			new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
					3, List.of("HTML", "CSS", "JavaScript", "React")),		
			new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
					List.of("Python", "Machine Learning", "Data Analysis")),
			new JobPost(4, "Network Engineer","Design and implement computer networks for efficient data communication", 5,
					List.of("Networking", "Cisco", "Routing", "Switching"))
			));
	
	public List<JobPost> getAlljobs(){
		return jobs;
	}
	
	public void addJob(JobPost post) {
		jobs.add(post);
		System.out.println(jobs);
	}

	public JobPost getJob(int postId) {
		for(JobPost job:jobs) {
			if(job.getPostId()==postId)
				return job;
		}
		return null;
	}

	public void updatePost(JobPost jobPost) {
		for(JobPost job:jobs) {
			if(job.getPostId()==jobPost.getPostId()) {
				job.setPostProfile(jobPost.getPostProfile());
				job.setPostDesc(jobPost.getPostDesc());
				job.setReqExperience(jobPost.getReqExperience());
				job.setPostTechStack(jobPost.getPostTechStack());
			}
		}
	}

	public void deletePost(int postId) {
		for(JobPost job:jobs) {
			if(job.getPostId()==postId) {
				jobs.remove(job);
			}
		}
	}
}

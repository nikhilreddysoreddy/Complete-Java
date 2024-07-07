package com.nikhil.app.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {
	private static Logger logger=LoggerFactory.getLogger(ValidationAspect.class);
	
	@Around("execution(* com.nikhil.app.service.JobService.getJob(..)) && args(postId)")
	public Object inputValidation(ProceedingJoinPoint jp,int postId) throws Throwable {
		
		if(postId<0) {
			logger.info("postId is negative, updating it");
			postId=-postId;
			logger.info("updated value : "+postId);
		}
		
		Object obj=jp.proceed(new Object[]{postId});
		return obj;
	}
}

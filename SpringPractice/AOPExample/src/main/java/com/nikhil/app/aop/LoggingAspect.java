package com.nikhil.app.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(LoggingAspect.class);
	
//	@Before("execution(* com.nikhil.app.service.JobService.*(..))")                              // .. -> arguments (order is return type, className, method, arguments)
//	public void logMethodCall() {
//		LOGGER.info("Method called");
//	}
	
	@Before("execution(* com.nikhil.app.service.JobService.getJob(..))")                              // .. -> arguments (order is return type, className, method, arguments)
	public void logMethodCall(JoinPoint jp) {
		LOGGER.info("Method called "+jp.getSignature().getName());
	}
//	
//	@After("execution(* com.nikhil.app.service.JobService.getJob(..))")                              // .. -> arguments (order is return type, className, method, arguments)
//	public void executionComplete(JoinPoint jp) {
//		LOGGER.info("Method Executed "+jp.getSignature().getName());
//	}
	
//	@AfterThrowing("execution(* com.nikhil.app.service.JobService.getJob(..))")                              // .. -> arguments (order is return type, className, method, arguments)
//	public void interupted(JoinPoint jp) {
//		LOGGER.info("Method has some issues "+jp.getSignature().getName());
//	}
	
	@AfterReturning("execution(* com.nikhil.app.service.JobService.getJob(..))")                              // .. -> arguments (order is return type, className, method, arguments)
	public void methiodExecutionSuccess(JoinPoint jp) {
		LOGGER.info("Method Executed successfully "+jp.getSignature().getName());
	}
}




package com.nikhil.app.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfomanceMonitorAspect {
	private static Logger LOGGER=LoggerFactory.getLogger(PerfomanceMonitorAspect.class);
	
	@Around("execution(* com.nikhil.app.service.JobService.*(..))")
	public Object performanceTime(ProceedingJoinPoint jp) throws Throwable {
		Long start=System.currentTimeMillis();
		
		Object obj =jp.proceed();
		
		Long end=System.currentTimeMillis();
		LOGGER.info("Time taken by "+jp.getSignature().getName()+" : "+(end-start));
		return obj;
	}
}

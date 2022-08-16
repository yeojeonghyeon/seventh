package com.scci.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logging {
	@Pointcut("execution(* com.scci.aop.*.*(..))")
	private void selectAops() {}
	
	@Before("selectAops()")
	public void beforeLog(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		System.out.println("===========AspectJ=============");
		System.out.println("methodName : " + methodName);
		for(Object p : args) {
			System.out.println("param value : " + p);
		}
		System.out.println("===========AspectJ===========");
	}
}

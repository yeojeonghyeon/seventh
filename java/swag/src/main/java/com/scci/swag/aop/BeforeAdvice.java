package com.scci.swag.aop;

import org.aspectj.lang.JoinPoint;

public class BeforeAdvice {
	public BeforeAdvice() {}
	
	public void beforeLog(JoinPoint jp) {
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		System.out.println("beforeLog called. " + method);
	}
}

package com.scci.aop;

import org.aspectj.lang.JoinPoint;

// beans.xml에 bean 등록 하고
public class CommonLog {
	public void beforeLog(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		System.out.println("=============================");
		System.out.println("methodName : " + methodName);
		for(Object p : args) {
			System.out.println("param value : " + p);
		}
		System.out.println("=============================");
	}
}

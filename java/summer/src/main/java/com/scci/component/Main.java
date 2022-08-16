package com.scci.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		LoginServiceImpl loginService = (LoginServiceImpl)context.getBean("loginServiceImpl");
		String userInfo = loginService.login("cocofarm");
		System.out.println(userInfo);
	}
}

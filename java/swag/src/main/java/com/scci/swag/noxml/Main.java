package com.scci.swag.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		// 첫번째 파라미터는 메서드 이름인 빈 객체의 이름, 두번째는 검색할 빈 객체의 타입
		Greeter g = ctx.getBean("greeter", Greeter.class);
		
		MyFileSystemBean bean1 = ctx.getBean("getMyFileSystemBean", MyFileSystemBean.class);
		MyFileSystemBean bean2 = ctx.getBean("getMyFileSystemBean", MyFileSystemBean.class);
		Customer cus = ctx.getBean("customer", Customer.class);
		System.out.println(cus.getPerson().getName());
		// Greeter 객체의 greet 메서드를 실행
		String msg = g.greet("greeter");
		System.out.println(msg);
		System.out.println(bean1);
		System.out.println(bean2);
		ctx.close();
	}
}

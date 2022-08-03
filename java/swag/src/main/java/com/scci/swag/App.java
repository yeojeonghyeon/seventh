package com.scci.swag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scci.swag.annotation.Foo;
import com.scci.swag.bean.Proto;
import com.scci.swag.bean.Single;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		Foo foo = (Foo) context.getBean("foo");
		Proto pro1 = (Proto) context.getBean("proto");
		Proto pro2 = (Proto) context.getBean("proto");
		Single single = (Single) context.getBean("single");
		single.getProto().setMessage("from single");
		obj.getMessage();
		pro1.setMessage("different proto");
		System.out.println(pro1.getMessage());
		System.out.println(pro2.getMessage());
		System.out.println(single.getProto().getMessage());
	}
}

class HelloWorld {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}
}
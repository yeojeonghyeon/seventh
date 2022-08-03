package com.scci.swag.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.scci.swag.noxml")
public class AppContext {

	@Bean
	public Greeter greeter() {
		Greeter g = new Greeter();
		g.setFormat("%s, hello!");
		return g;
	}
	@Bean(name= {"getMyFileSystemBean","MyFileSystemBean"})
	public MyFileSystemBean getMyFileSystemBean() {
		return new MyFileSystemBean();
	}
	@Bean
	public Person getPerson() {
		return new Person("a", "b");
	}
}
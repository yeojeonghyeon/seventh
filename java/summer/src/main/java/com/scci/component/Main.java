package com.scci.component;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		LoginServiceImpl loginService = (LoginServiceImpl)context.getBean("loginServiceImpl");
		String userInfo = loginService.login("cocofarm");
		System.out.println(userInfo);
		
		BoardServiceImpl boardService = (BoardServiceImpl)context.getBean("boardServiceImpl");
		List<Post> list = boardService.getPosts();
		list.forEach((post)->{
			System.out.println("======================");
			System.out.println(post.getTitle());
			System.out.println(post.getBody());
			System.out.println("======================");
		});
		
		MemberServiceImpl memberService = (MemberServiceImpl)context.getBean("memberServiceImpl");
		List<Member> members = memberService.getMembers();
		members.forEach((member)->{
			System.out.println("======================");
			System.out.println(member.getName());
			System.out.println(member.getGrade());
			System.out.println(member.getRegisterDt());
			System.out.println("======================");
		});
	}
}

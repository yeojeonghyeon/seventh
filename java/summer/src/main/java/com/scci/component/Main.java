package com.scci.component;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	private static Logger logger = LoggerFactory.getLogger(Main.class);
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		LoginServiceImpl loginService = (LoginServiceImpl)context.getBean("loginServiceImpl");
		String userInfo = loginService.login("cocofarm");
		
		BoardServiceImpl boardService = (BoardServiceImpl)context.getBean("boardServiceImpl");
		List<Post> list = boardService.getPosts();
		list.forEach((post)->{
			logger.debug("======================");
			logger.debug(post.getTitle());
			logger.debug(post.getBody());
			logger.debug("======================");
		});
		
		MemberServiceImpl memberService = (MemberServiceImpl)context.getBean("memberServiceImpl");
		List<Member> members = memberService.getMembers();
		members.forEach((member)->{
			logger.debug("======================");
			logger.debug(member.getName());
			logger.debug(member.getGrade());
			logger.debug(member.getRegisterDt());
			logger.debug("======================");
		});
		
		Post post = (Post)context.getBean("post");
		logger.debug(post.getTitle());
		logger.debug(post.getBody());
	}
}

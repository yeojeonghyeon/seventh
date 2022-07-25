package com.scci.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter{

	@Override
	public void destroy() {}

	@Override
	//doFilter만 오버라이딩 해주면 됨.
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//요청과 응답 한글 처리...
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		//사전 작업(위에서 처리한 한글 처리 작업)의 내용이 
		//서버상의 다음 번 컴포넌트에게 계속 적용되기 위한 작업...
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}
	
}
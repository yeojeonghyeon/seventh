package com.scci.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.scci.service.TestService;
import com.scci.vo.CustomerVO;

@Controller
public class LoginController {
	@Autowired
	private TestService testService;
	@RequestMapping("/login")
	public String index() {
		return "login";
	}
	
	@RequestMapping("/accessDenied")
	public String accessDenied() {
		return "accessDenied";
	}
}

package com.scci.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/member")
public class MemberController {
	@RequestMapping("/init")
	public String getInit(@RequestParam String content, @RequestParam Map<String, String> param, HttpServletRequest request) {
		return "memberSearchView";
	}
}

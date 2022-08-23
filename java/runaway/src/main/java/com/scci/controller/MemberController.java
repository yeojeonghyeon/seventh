package com.scci.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.scci.vo.Menu;

@Controller
@RequestMapping("/member")
public class MemberController {
	@RequestMapping("/init")
	public String getInit(@RequestParam Map<String, String> param, HttpServletRequest request) {
		return "memberSearchView";
	}
	
	@ModelAttribute
	public void getMenu(Model model){
		List<Menu> list = Arrays.asList(new Menu("normal", "정회원"), new Menu("gold", "우수회원"));
		model.addAttribute("menu", list);
	}
}

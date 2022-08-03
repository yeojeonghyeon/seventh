package com.scci.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping(value="/menu/{id}")
	public String menu(@PathVariable("id") String id, @RequestParam Map<String, String> param, Model model) {
		model.addAttribute("fromParams", param);
		return "menu";
	}
	@RequestMapping(value="/errorPage", method=RequestMethod.GET)
	public String errorPage(@RequestParam Map<String, String> param, Model model) {
		return "errorPage";
	}
	@RequestMapping(value="/errorThrow", method=RequestMethod.GET)
	public String errorThrow(@RequestParam Map<String, String> param, Model model) {
		int i = 1/0;
		return "errorPage";
	}
}

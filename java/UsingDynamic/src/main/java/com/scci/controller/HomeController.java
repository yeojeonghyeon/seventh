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
public class HomeController {
	@Autowired
	private TestService testService;
	
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
	
	@RequestMapping(value="/actors")
	public String actors(@RequestParam Map<String, String> param, Model model) {
		List<Map<String, String>> results = testService.selectActors(param);
		model.addAttribute("results", results);
		return "actors";
	}
	
	@RequestMapping(value="/customer")
	public String customer(@RequestParam String custId, Model model) {
		List<Map<String, String>> results = testService.selectCustomer(custId);
		model.addAttribute("results", results);
		return "customer";
	}
	@RequestMapping(value="/insertCustomer", method=RequestMethod.POST)
	public String insertCustomer(@RequestParam Map<String, String> param, CustomerVO customer, Model model) throws Exception {
		int affectedRow = testService.insertCustomer(param);
		model.addAttribute("affectedRow", affectedRow);
		return "insertCustomerResult";
	}
}

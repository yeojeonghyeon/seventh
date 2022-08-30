package com.scci.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.scci.service.CustomerService;
import com.scci.vo.CustomerVO;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/init")
	public String init() {
		return "customerSearchView";
	}
	
	@RequestMapping(value="/list", method=RequestMethod.POST)
	public String list(@RequestParam Map<String, String> params, Model model) {
		List<CustomerVO> members = customerService.getCustomers(params);
		model.addAttribute("members", members);
		return "customerSearchView";
	}
}

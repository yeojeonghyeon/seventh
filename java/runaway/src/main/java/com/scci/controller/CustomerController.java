package com.scci.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@RequestMapping("/init")
	public String init() {
		return "customerSearchView";
	}
}

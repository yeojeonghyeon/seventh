package com.scci.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.scci.service.BookOrderService;

@Controller
@RequestMapping("/book")
public class BookOrderController {
	@Autowired
	private BookOrderService bookOrderService;
	
	@RequestMapping("/init")
	public String getInit(@RequestParam Map<String, String> param, HttpServletRequest request) {
		return "bookOrderSearch";
	}
	
	@RequestMapping("/orders")
	public String orders(@RequestParam Map<String, String> param, Model model) {
		List<Map<String, String>> orders = bookOrderService.getOrders(param);
		model.addAttribute("orders", orders);
		return "bookOrderSearch";
	}
}

package com.scci.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.scci.service.BookOrderService;
import com.scci.vo.OrdersDetailVO;

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
	
	@RequestMapping(value="/ordersDetail", method=RequestMethod.GET)
	public String ordersDetailInit() {
		return "orderDetailView";
	}
	
	@RequestMapping(value="/ordersDetail", method=RequestMethod.POST)
	public String ordersDetail(@RequestParam Map<String, String> param, Model model) {
		List<OrdersDetailVO> orders = bookOrderService.getOrdersDetail(param);
		model.addAttribute("orders", orders);
		return "orderDetailView";
	}
	
	@ModelAttribute
	public void getPublisher(Model model) {
		List<Map<String, String>> publishers = bookOrderService.getPublisher();
		model.addAttribute("publishers", publishers);
	}
}

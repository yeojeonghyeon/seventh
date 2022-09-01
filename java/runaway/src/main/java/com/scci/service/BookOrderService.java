package com.scci.service;

import java.util.List;
import java.util.Map;

import com.scci.vo.OrdersDetailVO;

public interface BookOrderService {
	public List<Map<String, String>> getOrders(Map<String, String> params);
	public List<Map<String, String>> getPublisher();
	public List<OrdersDetailVO> getOrdersDetail(Map<String, String> params);
}

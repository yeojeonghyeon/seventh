package com.scci.service;

import java.util.List;
import java.util.Map;

public interface BookOrderService {
	public List<Map<String, String>> getOrders(Map<String, String> params);
}

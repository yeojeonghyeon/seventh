package com.scci.dao;

import java.util.List;
import java.util.Map;

public interface BookOrderDao {
	public List<Map<String, String>> getOrders(Map<String, String> params);
}

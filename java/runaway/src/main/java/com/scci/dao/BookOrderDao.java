package com.scci.dao;

import java.util.List;
import java.util.Map;

import com.scci.vo.InQtyVO;
import com.scci.vo.OrdersDetailVO;

public interface BookOrderDao {
	public List<Map<String, String>> getOrders(Map<String, String> params);
	// sql에서 파라미터를 받지 않으므로 파라메터가 없음.
	public List<Map<String, String>> getPublisher();
	public List<OrdersDetailVO> getOrdersDetail(Map<String, String> params);
	public List<InQtyVO> getInQty(Map<String, String> params);
}

package com.scci.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scci.dao.BookOrderDao;
import com.scci.vo.InQtyVO;
import com.scci.vo.OrdersDetailVO;

@Service
public class BookOrderServiceImpl implements BookOrderService{
	@Autowired
	private BookOrderDao bookOrderDao;
	
	@Override
	public List<Map<String, String>> getOrders(Map<String, String> params) {
		return bookOrderDao.getOrders(params);
	}

	@Override
	public List<Map<String, String>> getPublisher() {
		return bookOrderDao.getPublisher();
	}

	@Override
	public List<OrdersDetailVO> getOrdersDetail(Map<String, String> params) {
		return bookOrderDao.getOrdersDetail(params);
	}

	@Override
	public List<InQtyVO> getInQty(Map<String, String> params) {
		return bookOrderDao.getInQty(params);
	}
}

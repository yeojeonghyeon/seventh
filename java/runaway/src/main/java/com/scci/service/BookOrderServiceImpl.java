package com.scci.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scci.dao.BookOrderDao;

@Service
public class BookOrderServiceImpl implements BookOrderService{
	@Autowired
	private BookOrderDao bookOrderDao;
	
	@Override
	public List<Map<String, String>> getOrders(Map<String, String> params) {
		return bookOrderDao.getOrders(params);
	}
}

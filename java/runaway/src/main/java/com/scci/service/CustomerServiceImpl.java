package com.scci.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scci.dao.CustomerDao;
import com.scci.vo.CustomerVO;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public List<CustomerVO> getCustomers(Map<String, String> params) {
		return customerDao.getCustomers(params);
	}
}

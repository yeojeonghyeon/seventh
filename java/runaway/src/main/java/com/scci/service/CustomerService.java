package com.scci.service;

import java.util.List;
import java.util.Map;

import com.scci.vo.CustomerVO;

public interface CustomerService {
	List<CustomerVO> getCustomers(Map<String, String> params);
}

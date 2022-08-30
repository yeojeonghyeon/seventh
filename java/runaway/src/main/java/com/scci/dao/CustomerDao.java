package com.scci.dao;

import java.util.List;
import java.util.Map;

import com.scci.vo.CustomerVO;

public interface CustomerDao {
	List<CustomerVO> getCustomers(Map<String, String> params);
}

package com.scci.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scci.dao.TestDAO;

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private TestDAO testDAO;
	
	@Override
	public List<Map<String, String>> selectActors(Map<String, String> param) {
		// TODO Auto-generated method stub
		return testDAO.selectActors(param);
	}

	@Override
	public List<Map<String, String>> selectCustomer(String custId) {
		// TODO Auto-generated method stub
		return testDAO.selectCustomer(custId);
	}

	@Override
	public int insertCustomer(Map<String, String> param){
		int result = testDAO.insertCustomer(param);
		result = 1/0;
		return result;
	}
	
//	@Override
//	public int insertCustomer(Map<String, String> param){
//		return testDAO.insertCustomer(param);
//	}

}

package com.scci.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}

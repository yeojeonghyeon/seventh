package com.scci.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.scci.vo.CustomerVO;

public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<CustomerVO> getCustomers(Map<String, String> params) {
		return sqlSession.selectList("mapper.test.selectCustomer", params);
	}
}

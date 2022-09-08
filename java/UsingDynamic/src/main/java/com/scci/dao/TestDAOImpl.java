package com.scci.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class TestDAOImpl implements TestDAO{
	@Autowired
	private SqlSession sqlSession;
	

	@Override
	public List<Map<String, String>> selectActors(Map<String, String> param) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("mapper.oracle.test.selectBook", param);
	}


	@Override
	public List<Map<String, String>> selectCustomer(String custId) {
		return sqlSession.selectList("mapper.oracle.test.selectCustomer", custId);
	}


	@Override
	@Transactional(rollbackFor = {RuntimeException.class})
	public int insertCustomer(Map<String, String> param) {
		int result = sqlSession.insert("mapper.oracle.test.insertCustomer", param);
		result = 1/0;
		return result;
	}
}

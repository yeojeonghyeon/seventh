package com.scci.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookOrderDaoImpl implements BookOrderDao {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<Map<String, String>> getOrders(Map<String, String> params) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("mapper.test.selectOrderList", params);
	}
}

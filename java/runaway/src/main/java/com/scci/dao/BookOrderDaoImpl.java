package com.scci.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scci.vo.InQtyVO;
import com.scci.vo.OrdersDetailVO;

@Repository
public class BookOrderDaoImpl implements BookOrderDao {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<Map<String, String>> getOrders(Map<String, String> params) {
		return sqlSession.selectList("mapper.test.selectOrderList", params);
	}

	@Override
	public List<Map<String, String>> getPublisher() {
		return sqlSession.selectList("mapper.test.selectPublisher");
	}

	@Override
	public List<OrdersDetailVO> getOrdersDetail(Map<String, String> params) {
		return sqlSession.selectList("mapper.test.selectOrdersDetail", params);
	}

	@Override
	public List<InQtyVO> getInQty(Map<String, String> params) {
		return sqlSession.selectList("mapper.test.selectInQtyInfo", params);
	}
}

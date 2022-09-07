package com.scci.service;

import java.util.List;
import java.util.Map;

public interface TestService {
	public List<Map<String, String>> selectActors(Map<String, String> param);
	public List<Map<String, String>> selectCustomer(String custId);
	public int insertCustomer(Map<String, String> param);
}

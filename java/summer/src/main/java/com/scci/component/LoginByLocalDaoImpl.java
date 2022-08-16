package com.scci.component;

public class LoginByLocalDaoImpl implements LoginDao {
	@Override
	public String login(String user) {
		System.out.println("LoginByLocalDaoImpl's login called");
		return "local db login : " + user;
	}

}
